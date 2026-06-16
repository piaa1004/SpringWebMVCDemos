package com.ysy.webmvc.websocket.stomp.authorization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthzController {

    @GetMapping("/stomp/authz")
    public String authz() {
        return "use spring-security-messaging + AuthorizationManagerMessageMatcherRegistry";
    }
}
