package com.ysy.webmvc.dispatcherservlet.processing;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SequenceInterceptor implements HandlerInterceptor {

    private final String tag;

    public SequenceInterceptor(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) {
        System.out.printf("[%s] preHandle%n", tag);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler,
                           @Nullable ModelAndView mav) {
        System.out.printf("[%s] postHandle%n", tag);
    }

    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler,
                                @Nullable Exception ex) {
        System.out.printf("[%s] afterCompletion ex=%s%n", tag, ex);
    }
}
