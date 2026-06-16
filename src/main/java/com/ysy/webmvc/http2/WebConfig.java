package com.ysy.webmvc.http2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * HTTP/2.
 *
 * Spring Boot 의 embedded Tomcat 에서 HTTP/2 를 켜는 가장 흔한 방법:
 *   server.http2.enabled=true (application.properties)
 *
 * HTTP/2 는 보통 TLS 와 함께 사용. cleartext h2c 는 일부 설정에서만 동작.
 * 본 토픽은 컨트롤러 하나만 두고 활성화 방법은 코멘트로 안내.
 */
@Configuration
@ComponentScan(basePackageClasses = Http2Controller.class)
public class WebConfig {
}
