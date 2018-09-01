package com.cjrjob.service;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Recruiter;

public interface ICompanyService {

    ServerResponse<String> addCompany(Recruiter recruiter);

    ServerResponse showCompanyInfo(int id);
}
