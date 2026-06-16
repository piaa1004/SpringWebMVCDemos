package com.ysy.webmvc.dispatcherservlet.interception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class ApiKeyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) {
        String key = req.getHeader("X-API-KEY");
        if (!"secret".equals(key)) {
            res.setStatus(401);
            return false; // 컨트롤러 호출 차단
        }
        return true;
    }
}
