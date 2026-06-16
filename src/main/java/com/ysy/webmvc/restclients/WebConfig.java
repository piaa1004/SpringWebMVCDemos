package com.ysy.webmvc.restclients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

/**
 * REST Clients — Spring 의 클라이언트 패밀리:
 *   - RestTemplate (legacy synchronous)
 *   - RestClient   (modern synchronous fluent, Spring 6.1+)
 *   - WebClient    (reactive, Project Reactor 의존)
 *
 * 본 토픽은 가장 표준이 된 {@link RestClient} 를 빈으로 노출하고, 컨트롤러가 자기 서버를 호출.
 */
@Configuration
@ComponentScan(basePackageClasses = RestClientsController.class)
public class WebConfig {

    @Bean
    public RestClient restClient() {
        return RestClient.builder()
                .baseUrl("http://localhost:8080")
                .build();
    }
}
