package com.ysy.webmvc.websocket.stomp.benefits;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * STOMP > Benefits.
 *
 * raw WebSocket 대비 STOMP 의 이점:
 *   - 표준화된 frame 포맷 (SEND, SUBSCRIBE, MESSAGE, ACK, ...)
 *   - destination 기반 라우팅
 *   - 메시지 컨버터 / 브로커 통합 가능
 *   - 클라이언트 라이브러리 풍부 (stomp.js 등)
 */
@Configuration
@ComponentScan(basePackageClasses = BenefitsController.class)
public class WebConfig {
}
