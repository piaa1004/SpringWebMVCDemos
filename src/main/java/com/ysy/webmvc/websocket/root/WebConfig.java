package com.ysy.webmvc.websocket.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * WebSockets (root chapter).
 *
 * 챕터 전체의 entry. WebSocket API / SockJS / STOMP 세 갈래로 분기되며, 각 갈래는
 * 별도 sub-package 에서 시연된다. 본 패키지는 단순 hello 컨트롤러 + 안내 메시지.
 */
@Configuration
@ComponentScan(basePackageClasses = OverviewController.class)
public class WebConfig {
}
