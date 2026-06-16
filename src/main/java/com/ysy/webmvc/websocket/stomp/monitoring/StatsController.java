package com.ysy.webmvc.websocket.stomp.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.config.WebSocketMessageBrokerStats;

@RestController
public class StatsController {

    @Autowired
    private WebSocketMessageBrokerStats stats;

    @GetMapping("/ws/stats")
    public String stats() {
        return stats.toString();
    }
}
