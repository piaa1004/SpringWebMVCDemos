package com.ysy.webmvc.mvcconfig.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class TagInterceptor implements HandlerInterceptor {

    private final String tag;
    public TagInterceptor(String tag) { this.tag = tag; }

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) {
        res.setHeader("X-Tag", tag);
        return true;
    }
}
