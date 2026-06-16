package com.ysy.webmvc.websocket.stomp.userdestinations;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class MeController {

    /** /app/me → 결과는 /user/queue/replies (해당 사용자만 받음). */
    @MessageMapping("/me")
    @SendToUser("/queue/replies")
    public String me(String msg) {
        return "private: " + msg;
    }
}
