package com.ysy.webmvc.mvcconfig.customize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/cu/hello")
    public String hello(@RequestAttribute("hookedBy") String hookedBy) {
        return "hookedBy=" + hookedBy;
    }
}
