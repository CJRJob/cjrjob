package com.cjrjob.controller;

import com.cjrjob.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 * @Author: LR
 * @Descriprition: 邮箱发送验证码
 * @Date: Created in 20:49 2018/8/18
 * @Modified By:
 **/
@Controller
@RequestMapping("/user/")
public class SendMailController {

    @Autowired
    private JavaMailSender javaMailSender;//在spring中配置的邮件发送的bean

    @RequestMapping("send.do")
    @ResponseBody
    public ServerResponse sendMail03(String fromEmail){
        MimeMessage mMessage=javaMailSender.createMimeMessage();//创建邮件对象
        MimeMessageHelper mMessageHelper;
        Properties prop = new Properties();
        String from;


        int code = new Random().nextInt(1000000);
        try {
            //从配置文件中拿到发件人邮箱地址
            prop.load(this.getClass().getResourceAsStream("/cjrjob.properties"));
            from = prop.get("mail.smtp.username")+"";
            mMessageHelper=new MimeMessageHelper(mMessage,true);
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
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ServerResponse.createBySuccess(code);
    }
}
