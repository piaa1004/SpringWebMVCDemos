package com.ysy.webmvc.mvcconfig.pathmatching;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    /** addPathPrefix("/api", ...) 효과로 실제 URL 은 /api/things 가 된다. */
    @GetMapping("/things")
    public String things() {
        return "things";
    }
}
