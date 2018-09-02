package com.cjrjob.service;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Recruiter;
import org.springframework.web.multipart.MultipartFile;

public interface ICompanyService {

    ServerResponse<String> addCompany(MultipartFile file, Recruiter recruiter);

    ServerResponse showCompanyInfo(int id);

    ServerResponse showCompanyInfoByPage(int currentPage, int pageSize);

    ServerResponse showCompanyInfoFirst(int pageSize);

}
