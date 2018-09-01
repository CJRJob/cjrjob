package com.cjrjob.controller;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Recruiter;
import com.cjrjob.service.ICompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/company")
public class CompanyController {

    private static final Logger log = LoggerFactory.getLogger(CompanyController.class);
    @Autowired
    private ICompanyService iCompanyService;

    //添加公司
    @RequestMapping("add.do")
    @ResponseBody
    public ServerResponse<String> addCompany(Recruiter recruiter) {
        return iCompanyService.addCompany(recruiter);
    }

    //查询公司信息
    @RequestMapping("jobDetail.do")
    @ResponseBody
    public ServerResponse showCompanyInfo(int id) {
        return iCompanyService.showCompanyInfo(id);
    }
}
