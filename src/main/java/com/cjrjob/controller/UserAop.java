package com.cjrjob.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjrjob.common.Const;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Seeker;

@Aspect
@Component
public class UserAop {
    @Autowired
    HttpServletRequest request;

    @Pointcut(value = "execution(public * com.cjrjob.controller.CollectionRest.*(..))")
    private void collectionPoin() {
    }

    @Around("collectionPoin()")
    public Object name(ProceedingJoinPoint point) {
        try {
            HttpSession session = request.getSession();
            Seeker currentSeeker = (Seeker) session.getAttribute(Const.CURRENT_USER);
            if (currentSeeker == null) {
                return ServerResponse.createByErrorMessage("用户未登陆");
            }
            return point.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return point;
    }
}
