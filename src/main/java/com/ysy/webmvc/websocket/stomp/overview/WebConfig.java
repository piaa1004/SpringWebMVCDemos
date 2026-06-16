package com.ysy.webmvc.websocket.stomp.overview;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * STOMP > Overview.
 *
 * STOMP (Simple Text Oriented Messaging Protocol) 는 WebSocket 위에서 동작하는 프레이밍 프로토콜.
 * SEND / SUBSCRIBE / MESSAGE 등 단순한 프레임으로 publish-subscribe 메시징을 제공.
 */
@Configuration
@ComponentScan(basePackageClasses = OverviewController.class)
public class WebConfig {
}
