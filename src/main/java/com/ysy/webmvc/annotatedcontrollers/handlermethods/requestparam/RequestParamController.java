package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestparam;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    /** 필수 + 기본값. */
    @GetMapping("/q/basic")
    public String basic(@RequestParam(name = "name", defaultValue = "anon") String name,
                        @RequestParam(required = false) Integer age) {
        return "name=" + name + " age=" + age;
    }

    /** 다중 값 → List. */
    @GetMapping("/q/list")
    public String list(@RequestParam("tag") List<String> tags) {
        return "tags=" + tags;
    }

    /** 이름 없이 Map 으로 받음. */
    @GetMapping("/q/map")
    public String map(@RequestParam Map<String, String> all) {
        return "all=" + all;
    }
}
