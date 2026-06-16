package com.ysy.webmvc.mvcconfig.apiversion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiVersionController {

    @GetMapping(value = "/widgets", params = "v=1")
    public String v1() { return "widgets v1"; }

    @GetMapping(value = "/widgets", params = "v=2")
    public String v2() { return "widgets v2"; }
}
