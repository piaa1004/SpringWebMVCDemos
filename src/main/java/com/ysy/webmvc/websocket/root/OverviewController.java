package com.ysy.webmvc.websocket.root;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverviewController {

    @GetMapping("/ws/overview")
    public String overview() {
        return "see sub-packages: websocketapi, sockjsfallback, stomp/*";
    }
}
