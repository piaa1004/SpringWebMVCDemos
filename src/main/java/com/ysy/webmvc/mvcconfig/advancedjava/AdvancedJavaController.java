package com.ysy.webmvc.mvcconfig.advancedjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvancedJavaController {

    @GetMapping("/aj/hello")
    public String hello() {
        return "delegated by DelegatingWebMvcConfiguration";
    }
}
