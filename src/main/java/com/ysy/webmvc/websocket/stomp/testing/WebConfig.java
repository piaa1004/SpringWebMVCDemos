package com.ysy.webmvc.websocket.stomp.testing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * STOMP > Testing.
 *
 * 컨트롤러 단위 테스트는 일반 단위 테스트와 동일 — @MessageMapping 메서드를 직접 호출하거나
 * WebSocketStompClient + WebSocketStompSession 으로 통합 테스트.
 */
@Configuration
@ComponentScan(basePackageClasses = TestableController.class)
public class WebConfig {
}
