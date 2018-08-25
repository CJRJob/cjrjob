package com.cjrjob.common;



import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 11:06 2018/8/25
 * @Modified By:
 **/
@Slf4j
@Component
public class ExceptionResolver implements HandlerExceptionResolver{
    @Override
    public ModelAndView resolveException (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        log.error("{} Exception", httpServletRequest.getRequestURI(), e);
        ModelAndView modelAndView = new ModelAndView(new MappingJacksonJsonView());

        modelAndView.addObject("status", ResponseCode.ERROR.getCode());
        modelAndView.addObject("msg", "接口异常， 详情请查看服务端日志的异常信息");
        modelAndView.addObject("data", e.toString());
        return modelAndView;
    }

}
