package com.ysy.webmvc.dispatcherservlet.interception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptedController {

    @GetMapping("/api/users")
    public String users() {
        return "[\"alice\",\"bob\"]";
    }

    @GetMapping("/api/public/health")
    public String health() {
        return "OK";
    }
}
