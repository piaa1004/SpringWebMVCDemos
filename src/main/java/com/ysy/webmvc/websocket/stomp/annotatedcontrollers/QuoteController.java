package com.ysy.webmvc.websocket.stomp.annotatedcontrollers;

import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
public class QuoteController {

    /** 메시지 처리 후 broker 로 전달. */
    @MessageMapping("/quote")
    @SendTo("/topic/quotes")
    public String quote(String symbol) {
        return symbol.toUpperCase() + "=" + Math.round(Math.random() * 100);
    }

    /** SUBSCRIBE 즉시 응답(브로커 우회). */
    @SubscribeMapping("/init")
    public String init() {
        return "welcome";
    }

    @MessageExceptionHandler(IllegalArgumentException.class)
    @SendTo("/topic/errors")
    public String onErr(IllegalArgumentException ex) {
        return "err=" + ex.getMessage();
    }
}
