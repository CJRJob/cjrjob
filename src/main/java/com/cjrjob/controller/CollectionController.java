package com.cjrjob.controller;

import com.cjrjob.common.Const;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.dao.CollectionMapper;
import com.cjrjob.dao.DeliveryMapper;
import com.cjrjob.dao.FeedbackInfoMapper;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.vo.FeedbackVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wutianjue
 */
@RestController
@RequestMapping("/user")
public class CollectionController {
    @Autowired
    private CollectionMapper collectionMapper;
    @Autowired
    private FeedbackInfoMapper feedbackInfoMapper;
    @Autowired
    private DeliveryMapper deliveryMapper;

    @RequestMapping(value = "/addFeedback.do")
    public ServerResponse<Object> addFeedback(@ModelAttribute FeedbackVo feedbackVo, HttpSession session) {
        Seeker seeker = getSeekerr(session);
        feedbackVo.setUserId(seeker.getJobSeekerId());
        try {
            feedbackInfoMapper.insertByVo(feedbackVo);
        } catch (Exception e) {
            return ServerResponse.createByErrorMessage("反馈信息添加成功");
        }
        return ServerResponse.createBySuccessMessage("反馈信息添加成功");
    }

    @RequestMapping(value = "/collectionList.do")
    public ServerResponse<PageInfo<Map<String, Object>>> query(HttpSession session) {
        PageHelper.startPage(1, 10);
        Seeker seeker = getSeekerr(session);
        List<Map<String, Object>> list = collectionMapper.findBy(seeker.getJobSeekerId());
        return ServerResponse.createBySuccess(new PageInfo<>(list));
    }

    @RequestMapping(value = "/del_collection.do")
    public void delete(@RequestParam int id) {
        collectionMapper.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/deliveryList.do")
    public ServerResponse<PageInfo<Map<String, Object>>> delivery(HttpSession session) {
        PageHelper.startPage(1, 10);
        Seeker seeker = getSeekerr(session);
        List<Map<String, Object>> list = deliveryMapper.findBy(seeker.getJobSeekerId());
        return ServerResponse.createBySuccess(new PageInfo<>(list));
    }

    private Seeker getSeekerr(HttpSession session) {
        return (Seeker) session.getAttribute(Const.CURRENT_USER);
    }
}