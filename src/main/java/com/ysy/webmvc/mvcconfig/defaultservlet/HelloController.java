package com.ysy.webmvc.mvcconfig.defaultservlet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/ds/hello")
    public String hello() {
        return "served by Spring MVC";
    }
}
