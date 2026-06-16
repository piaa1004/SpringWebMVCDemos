package com.ysy.webmvc.dispatcherservlet.logging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }
}
