package com.ysy.webmvc.functional;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

@Component
public class GreetingHandler {

    public ServerResponse hello(ServerRequest request) {
        return ServerResponse.ok().body("hello from functional endpoint");
    }

    public ServerResponse echo(ServerRequest request) {
        return ServerResponse.ok().body("echo=" + request.pathVariable("msg"));
    }
}
