package com.cjrjob.controller;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/26 0026 14:42
 */
@Controller
@RequestMapping("/job/")
public class JobController {

    @Autowired
    private IJobService jobService;

    /**
     * 这个有异常，注意了.......
     */
    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse showJob(@RequestParam(value = "pageNumber", defaultValue = "1"
    ) Integer pageNumber, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        System.out.println(pageNumber + "  ==============" + pageSize);
        /**两个参数pageNumber,pageSize
         * 默认第一页，一页10条数据*/
        return jobService.getList(pageNumber, pageSize);
    }

    @RequestMapping("detail.do")
    @ResponseBody
    public ServerResponse showJobDetail(Integer job_id) {
        /**一个参数，job的id*/

        return jobService.showJobDetails(job_id);

    }

}
