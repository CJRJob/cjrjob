package com.cjrjob.service.lmpl;

import com.cjrjob.common.ServerResponse;

import com.cjrjob.pojo.Recruiter;
import com.cjrjob.pojo.RecruiterDTO;
import com.cjrjob.service.ICompanyService;
import com.cjrjob.util.PropertiesUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cjrjob.dao.Re

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service("iCompanyService")
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private RecruiterMapper recruiterMapper;

    @Override
    public ServerResponse<String> addCompany(MultipartFile file, Recruiter recruiter) {
        try{
            //获取文件名
            String fileName = file.getOriginalFilename();
            //文件存入存放图片地址
            String path = PropertiesUtil.getProperty("imgStore");
            //判断接收的文件为不为空
            if(!file.isEmpty() && null != recruiter){
                //获取新的文件名字
                String newName = UUID.randomUUID()+fileName.substring(fileName.lastIndexOf("."));
                File newFile = new File(path+newName);
                //将文件写入到存放的地址
                file.transferTo(newFile);
                //对数据库进行操作
                recruiter.setLogouri(path+newName);
                if (recruiterMapper.insertSelective(recruiter) > 0) {
                    return ServerResponse.createBySuccess("公司添加成功");
                }
            }
        } catch (Exception e) {
           throw new RuntimeException("图片存到服务器IO异常");
        }
        return ServerResponse.createByErrorMessage("公司添加失败");
    }

    @Override
    public ServerResponse showCompanyInfoByPage(int currentPage, int pageSize) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", pageSize);
        List<Recruiter> recruiter = recruiterMapper.selectByPage(map);
        if (CollectionUtils.isEmpty(recruiter)){
            return ServerResponse.createByErrorMessage("公司查询失败");
        }
        return ServerResponse.createBySuccess("公司查询成功", recruiter);
    }

    @Override
    public ServerResponse showCompanyInfoFirst(int pageSize) {
        int num = recruiterMapper.select();
        int pages = 0;
        if (num > 0) {
            if (num % pageSize == 0) {
                pages = num / pageSize;
            } else {
                pages = num / pageSize + 1;
            }
            ServerResponse result = showCompanyInfoByPage(1, pageSize);
            Object recruiter = result.getData();
            if (null == recruiter){
                return ServerResponse.createByErrorMessage("公司查询失败");
            }
            RecruiterDTO recruiterDTO = new RecruiterDTO();
            recruiterDTO.setJobRecruiter(recruiter);
            recruiterDTO.setPages(pages);
            return ServerResponse.createBySuccess("公司查询成功", recruiterDTO);
        }
        return ServerResponse.createByErrorMessage("公司查询失败");
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
