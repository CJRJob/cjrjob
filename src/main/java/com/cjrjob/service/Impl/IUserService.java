package com.cjrjob.service.Impl;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Seeker;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 12:37 2018/8/23
 * @Modified By:
 **/
public interface IUserService {

    ServerResponse<Seeker> login(String email, String password);

    ServerResponse<String> register(Seeker seeker);

    ServerResponse<String> sendCode(String fromEmail);

    ServerResponse<String> checkEmailCode(String email, int code);

    ServerResponse<String> restPassword(String email, String passwordNew, String forgetToken);
}
