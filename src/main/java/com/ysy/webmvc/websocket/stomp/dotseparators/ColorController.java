package com.ysy.webmvc.websocket.stomp.dotseparators;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ColorController {

    /** SEND /app/color.red → color=red. */
    @MessageMapping("color.{name}")
    @SendTo("/topic/colors")
    public String pick(@DestinationVariable String name) {
        return "color=" + name;
    }
}
