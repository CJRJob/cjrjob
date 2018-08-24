package com.cjrjob.service.Impl.lmpl;

import com.cjrjob.common.Const;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.common.TokenCache;
import com.cjrjob.dao.SeekerMapper;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.service.Impl.IUserService;
import com.cjrjob.util.MD5Util;
import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;


/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 12:37 2018/8/23
 * @Modified By:
 **/
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private JavaMailSender javaMailSender;//在spring中配置的邮件发送的bean

    @Autowired
    private SeekerMapper seekerMapper;


    public ServerResponse<Seeker> login(String email, String password){
        ServerResponse validResponse = this.validEmail(email);
        if (validResponse.isSuccess()){
            return ServerResponse.createByErrorMessage("邮箱不存在");
        }
        // 密码登录MD5
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        Seeker seeker = seekerMapper.selectLogin(email, md5Password);
        if(seeker == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        // 将密码设为空，防止别人抓包抓到密码
        seeker.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", seeker);
    }

    // 注册
    public ServerResponse<String> register(Seeker seeker){
        int resultCount = seekerMapper.checkEmail(seeker.getEmail());
        if (resultCount > 0){
            return ServerResponse.createByErrorMessage("邮箱已存在");
        }
        seeker.setUsername(seeker.getEmail());
        seeker.setPassword(MD5Util.MD5EncodeUtf8(seeker.getPassword()));
        seeker.setRole(Const.Role.ROLE_SEEKER.getValue());

        int result = seekerMapper.insert(seeker);
        if (result == 0){
            return ServerResponse.createByErrorMessage("注册失败");
        }

        return ServerResponse.createBySuccess("注册成功");

    }

    //  复用  校验邮箱是否存在
    public ServerResponse<String> validEmail(String email){
        int resultCount = seekerMapper.checkEmail(email);
        if (resultCount > 0){
            return ServerResponse.createByErrorMessage("邮箱已存在");
        }
        return ServerResponse.createBySuccess("校验成功");
    }

    // 发送验证码
    public  ServerResponse<String> sendCode(String fromEmail){

        Seeker seeker = seekerMapper.findSeekerByEmail(fromEmail);
        if (seeker == null) {
            ServerResponse.createByErrorMessage("邮箱不存在");
        }

        MimeMessage mMessage=javaMailSender.createMimeMessage();//创建邮件对象
        Properties prop = new Properties();

        int code = new Random().nextInt(1000000);
        try {
            //从配置文件中拿到发件人邮箱地址
            prop.load(this.getClass().getResourceAsStream("/cjrjob.properties"));
            String from = prop.get("mail.smtp.username")+"";
            MimeMessageHelper mMessageHelper=new MimeMessageHelper(mMessage,true);
            mMessageHelper.setFrom(from);//发件人邮箱
            mMessageHelper.setTo(fromEmail);//收件人邮箱
            mMessageHelper.setSubject("Spring的邮件发送");//邮件的主题
            mMessageHelper.setText("本次的验证码为" + code,true);//邮件的文本内容，true表示文本以html格式打开

//            File file=new File("D:/1.jpg");//发送邮件的图片
//            FileSystemResource resource=new FileSystemResource(file);
//            smm.addInline("identifier1234", resource);//这里指定一个id,在上面引用

//            File file=new File("D:/1.jpg");
//            FileSystemResource resource=new FileSystemResource(file);
//            smm.addAttachment("CoolImage.jpg", resource);//发送一个附件
            javaMailSender.send(mMessage);//发送邮件

            Seeker updateSeeker = new Seeker();
            updateSeeker.setJobSeekerId(seeker.getJobSeekerId());
            updateSeeker.setUsername(seeker.getUsername());
            updateSeeker.setRegTime(seeker.getRegTime());
            updateSeeker.setRole(seeker.getRole());
            updateSeeker.setPassword(seeker.getPassword());
            updateSeeker.setVerifycode(code);
            int updateCount = seekerMapper.updateByPrimaryKeySelective(updateSeeker);
            if (updateCount == 0){
                return ServerResponse.createByErrorMessage("验证码更新失败");
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 生成一个Token
        String forgetToken = UUID.randomUUID().toString(); // 37b135e6-f3cc-40a1-8327-deceed12c8c7
        TokenCache.setKey(fromEmail, forgetToken);
        return ServerResponse.createBySuccess(forgetToken);
    }

    // 判断邮箱验证码是否正确
    public ServerResponse<String> checkEmailCode(String email, int code){
        ServerResponse validResponse = this.validEmail(email);
        if (validResponse.isSuccess()){
            return ServerResponse.createByErrorMessage("邮箱不存在");
        }
        // 获取验证码
        Seeker seeker = seekerMapper.findSeekerByEmail(email);
        int verifyCode = seeker.getVerifycode();

        if (code != verifyCode){
            return ServerResponse.createByErrorMessage("验证码错误");
        }
        return ServerResponse.createBySuccess("验证成功");
    }


    //重置密码
    public ServerResponse<String> restPassword(String email, String passwordNew, String forgetToken){
        // 判断Token是否为空
        if (StringUtils.isBlank(forgetToken)){
            return ServerResponse.createByErrorMessage("参数错误, token需要传递");
        }
        // 判断邮箱是否存在
        int resultCount = seekerMapper.checkEmail(email);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("邮箱不存在");
        }

        // 获取token
        String token = TokenCache.getKey(email);
        if (StringUtils.isBlank(token)){
            return ServerResponse.createByErrorMessage("token 无效或过期");
        }

        if (StringUtils.equals(token, forgetToken)){
            String md5Password = MD5Util.MD5EncodeUtf8(passwordNew);
            // 更新完要用MD5的密码
            int result = seekerMapper.updatePasswordByEmail(email, md5Password);
            if (result > 0){
                return ServerResponse.createBySuccess("密码修改成功");
            }
        }else{
            return ServerResponse.createByErrorMessage("Token错误,请重新获取重置密码的token");
        }
        return ServerResponse.createByErrorMessage("修改密码失败");

    }
    }

