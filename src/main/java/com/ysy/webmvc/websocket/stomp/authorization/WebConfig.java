package com.ysy.webmvc.websocket.stomp.authorization;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * STOMP > Authorization.
 *
 * 메시지 단위 권한 검사는 Spring Security 의 AuthorizationManager 또는 채널 인터셉터에서.
 * 본 토픽은 entry point 만 안내.
 */
@Configuration
@ComponentScan(basePackageClasses = AuthzController.class)
public class WebConfig {
}
