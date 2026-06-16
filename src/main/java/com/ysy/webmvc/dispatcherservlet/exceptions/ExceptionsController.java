package com.ysy.webmvc.dispatcherservlet.exceptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionsController {

    @GetMapping("/throw/illegal-arg")
    public String illegalArg() {
        throw new IllegalArgumentException("name is blank");
    }

    @GetMapping("/throw/illegal-state")
    public String illegalState() {
        throw new IllegalStateException("not initialized");
    }
}
