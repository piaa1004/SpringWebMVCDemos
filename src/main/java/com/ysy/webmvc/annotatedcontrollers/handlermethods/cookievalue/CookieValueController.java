package com.ysy.webmvc.annotatedcontrollers.handlermethods.cookievalue;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieValueController {

    @GetMapping("/c/session")
    public String session(@CookieValue(value = "JSESSIONID", defaultValue = "-") String sid) {
        return "JSESSIONID=" + sid;
    }
}
