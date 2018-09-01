package com.cjrjob.service.impl;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.dao.RecruiterMapper;
import com.cjrjob.pojo.Recruiter;
import com.cjrjob.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iCompanyService")
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private RecruiterMapper recruiterMapper;

    @Override
    public ServerResponse<String> addCompany(Recruiter recruiter) {
        if (recruiterMapper.insertSelective(recruiter) > 0) {
            return ServerResponse.createBySuccess("公司添加成功");
        }
        return ServerResponse.createByErrorMessage("公司添加失败");
    }

    @Override
    public ServerResponse showCompanyInfo(int id) {
        Recruiter recruiter = recruiterMapper.selectByPrimaryKey(Integer.valueOf(id));
        if (recruiter != null) {
            return ServerResponse.createBySuccess(recruiter);
        }
        return ServerResponse.createByErrorMessage("没有权限");
    }
}
