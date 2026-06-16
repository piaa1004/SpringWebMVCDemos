package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestheader;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderController {

    @GetMapping("/h/ua")
    public String userAgent(@RequestHeader(value = HttpHeaders.USER_AGENT, defaultValue = "-") String ua) {
        return "ua=" + ua;
    }

    @GetMapping("/h/all")
    public String all(@RequestHeader Map<String, String> headers) {
        return headers.toString();
    }
}
