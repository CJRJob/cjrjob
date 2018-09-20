package com.cjrjob.service;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.pojo.SeekerInfo;

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

    ServerResponse<String> forgetRestPassword(String email, String passwordNew, String forgetToken);

    ServerResponse<String> restPassword(String passwordOld, String passwordNew, Seeker seeker);

    ServerResponse<SeekerInfo> updateInformation(SeekerInfo seekerInfo);

    ServerResponse<SeekerInfo> seekerInfoDetail(Integer jobSeekerId);
}
