package com.cjrjob.service.lmpl;


import com.cjrjob.common.ServerResponse;
import com.cjrjob.dao.CollectionMapper;
import com.cjrjob.pojo.Collection;
import com.cjrjob.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service("IPostService")
public class PostServiceImpl implements IPostService {
    @Autowired
    private CollectionMapper collectionMapper;

    public ServerResponse<String> collectPost(Collection collection) {

        Collection co = new Collection();
        co.setCreateTime(new Date());
        co.setJobSeekerId(collection.getJobSeekerId());
        co.setJobFullInfo(collection.getJobFullInfo());
        collectionMapper.insertSelective(co);
        return ServerResponse.createBySuccess("收藏成功");

    }


}

