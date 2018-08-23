package com.cjrjob.service.Impl.lmpl;

import com.cjrjob.common.Const;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.dao.SeekerMapper;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.service.Impl.IUserService;
import com.cjrjob.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 12:37 2018/8/23
 * @Modified By:
 **/
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private SeekerMapper seekerMapper;

    public ServerResponse<Seeker> login(String email, String password){
        int resultCount = seekerMapper.checkEmail(email);
        if (resultCount == 0){
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

    public ServerResponse<String> register(Seeker seeker){
        int resultCount = seekerMapper.checkEmail(seeker.getEmail());
        if (resultCount != 0){
            return ServerResponse.createByErrorMessage("邮箱已存在");
        }

        seeker.setPassword(MD5Util.MD5EncodeUtf8(seeker.getPassword()));
        seeker.setRole(Const.Role.ROLE_SEEKER.getValue());

        int result = seekerMapper.insert(seeker);
        if (result == 0){
            return ServerResponse.createByErrorMessage("注册失败");
        }

        return ServerResponse.createBySuccess("注册成功");

    }
    }

