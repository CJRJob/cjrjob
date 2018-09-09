package com.cjrjob.service;


import com.cjrjob.common.ServerResponse;
import com.github.pagehelper.PageInfo;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/26 0026 20:41
 */

public interface IJobService {
    /**1 接口,获取职位详情*/

    ServerResponse showJobDetails(Integer id);
    ServerResponse<PageInfo> getList(Integer pageNumber, Integer pageSize);


}