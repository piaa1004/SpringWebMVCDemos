package com.ysy.webmvc.websocket.stomp.testing;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TestableController {

    @MessageMapping("/uppercase")
    @SendTo("/topic/uppercase")
    public String upper(String s) {
        return s == null ? "" : s.toUpperCase();
    }
}
