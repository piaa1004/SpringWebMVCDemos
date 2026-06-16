package com.ysy.webmvc.websocket.stomp.flowofmessages;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    /** SEND /app/chat → 이 메서드 처리 → /topic/chat 으로 brodacast. */
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public String chat(String message) {
        return "broadcast: " + message;
    }
}
