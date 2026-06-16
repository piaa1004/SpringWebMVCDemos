package com.ysy.webmvc.dispatcherservlet.pathmatching;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    /** 단일 path variable. */
    @GetMapping("/users/{id}")
    public String byId(@PathVariable String id) {
        return "id=" + id;
    }

    /** 정규식 한정 path variable. 소문자 알파벳만 허용. */
    @GetMapping("/letters/{letter:[a-z]+}")
    public String letters(@PathVariable String letter) {
        return "letter=" + letter;
    }

    /** capture-the-rest 패턴. /files/a/b/c.txt → paths = a/b/c.txt */
    @GetMapping("/files/{*paths}")
    public String files(@PathVariable String paths) {
        return "paths=" + paths;
    }
}
