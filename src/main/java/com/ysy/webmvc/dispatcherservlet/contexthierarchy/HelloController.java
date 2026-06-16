package com.ysy.webmvc.dispatcherservlet.contexthierarchy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    @Autowired
    public HelloController(GreetingService greetingService) {
        // greetingService 가 ROOT context 에서 내려온 빈임을 확인하는 포인트.
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String hello() {
        return greetingService.greet();
    }
}
