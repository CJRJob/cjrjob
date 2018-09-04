package com.cjrjob.service;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Collection;

/**
 *
 */
public interface IPostService {

    ServerResponse<String>  collectPost(Collection collection);
}
