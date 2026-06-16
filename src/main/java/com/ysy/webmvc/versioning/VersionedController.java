package com.ysy.webmvc.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 같은 path 의 서로 다른 버전을 헤더로 분기. (Spring 6.2.x 호환)
 */
@RestController
public class VersionedController {

    @GetMapping(value = "/api/users", headers = "X-API-Version=1")
    public String v1() {
        return "users v1";
    }

    @GetMapping(value = "/api/users", headers = "X-API-Version=2")
    public String v2() {
        return "users v2 (paged response)";
    }
}
