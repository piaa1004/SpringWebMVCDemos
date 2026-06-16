package com.ysy.webmvc.websocket.stomp.sendingmessages;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {

    private final SimpMessagingTemplate template;

    public PushController(SimpMessagingTemplate template) {
        this.template = template;
    }

    /** HTTP 호출 → broker 로 STOMP 메시지 푸시 → 구독 중인 클라이언트가 받음. */
    @GetMapping("/push")
    public String push(@RequestParam String msg) {
        template.convertAndSend("/topic/news", msg);
        return "sent";
    }
}
