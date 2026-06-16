package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestattribute;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestAttributeController {

    @GetMapping("/req-id")
    public String reqId(@RequestAttribute("requestId") String id) {
        return "requestId=" + id;
    }
}
