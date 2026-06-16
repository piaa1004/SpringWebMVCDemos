package com.ysy.webmvc.restclients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class RestClientsController {

    private final RestClient client;

    public RestClientsController(RestClient client) {
        this.client = client;
    }

    @GetMapping("/rc/origin")
    public String origin() {
        return "I am the origin";
    }

    /** /rc/origin 을 RestClient 로 호출해 받은 응답을 돌려준다. */
    @GetMapping("/rc/proxy")
    public String proxy() {
        String body = client.get().uri("/rc/origin").retrieve().body(String.class);
        return "proxy got: " + body;
    }
}
