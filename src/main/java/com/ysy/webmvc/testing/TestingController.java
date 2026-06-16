package com.ysy.webmvc.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @GetMapping("/t/hello")
    public String hello() {
        return "hello";
    }
}
