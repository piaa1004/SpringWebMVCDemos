package com.ysy.webmvc.annotatedcontrollers.controlleradvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvisedController {

    @GetMapping("/boom")
    public String boom() {
        throw new IllegalArgumentException("oops");
    }
}
