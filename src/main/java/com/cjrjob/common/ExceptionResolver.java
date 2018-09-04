<<<<<<< HEAD
<<<<<<< HEAD
package com.cjrjob.common;



=======
package com.cjrjob.common;

>>>>>>> origin/shuwang
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 11:06 2018/8/25
=======

/**
 * @Author: LR
 * @Descriprition: 全局异常处理
 * @Date: Created in 8:07 2018/8/13
>>>>>>> origin/shuwang
 * @Modified By:
 **/
@Slf4j
@Component
<<<<<<< HEAD
public class ExceptionResolver implements HandlerExceptionResolver{
    @Override
    public ModelAndView resolveException (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
=======
public class ExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
>>>>>>> origin/shuwang

        log.error("{} Exception", httpServletRequest.getRequestURI(), e);
        ModelAndView modelAndView = new ModelAndView(new MappingJacksonJsonView());

        modelAndView.addObject("status", ResponseCode.ERROR.getCode());
        modelAndView.addObject("msg", "接口异常， 详情请查看服务端日志的异常信息");
        modelAndView.addObject("data", e.toString());
        return modelAndView;
    }
<<<<<<< HEAD

}
=======
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
 * @Descriprition: 全局异常处理
 * @Date: Created in 8:07 2018/8/13
 * @Modified By:
 **/
@Slf4j
@Component
public class ExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        log.error("{} Exception", httpServletRequest.getRequestURI(), e);
        ModelAndView modelAndView = new ModelAndView(new MappingJacksonJsonView());

        modelAndView.addObject("status", ResponseCode.ERROR.getCode());
        modelAndView.addObject("msg", "接口异常， 详情请查看服务端日志的异常信息");
        modelAndView.addObject("data", e.toString());
        return modelAndView;
    }
}
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
=======
}
>>>>>>> origin/shuwang
