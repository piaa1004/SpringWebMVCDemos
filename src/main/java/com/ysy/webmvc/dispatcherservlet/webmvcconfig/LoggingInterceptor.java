package com.ysy.webmvc.dispatcherservlet.webmvcconfig;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.printf("[interceptor] %s %s%n", request.getMethod(), request.getRequestURI());
        return true;
    }
}
