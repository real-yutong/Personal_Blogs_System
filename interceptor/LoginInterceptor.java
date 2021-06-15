package com.xhx.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xhx on 2021/3/5
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    //    preHandle在业务处理器处理请求之前被调用。预处理，可以进行编码、安全控制等处理；
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}
