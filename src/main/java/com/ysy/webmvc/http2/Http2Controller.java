package com.ysy.webmvc.http2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Http2Controller {

    @GetMapping("/h2/protocol")
    public String protocol(HttpServletRequest request) {
        return "protocol=" + request.getProtocol();
    }
}
