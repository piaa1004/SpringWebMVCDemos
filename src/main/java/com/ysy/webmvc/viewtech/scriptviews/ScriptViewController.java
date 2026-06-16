package com.ysy.webmvc.viewtech.scriptviews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptViewController {

    @GetMapping("/script/info")
    public String info() {
        return "script-views: WebConfig 의 ViewResolverRegistry#scriptTemplate 참조";
    }
}
