package com.ysy.webmvc.dispatcherservlet.servletconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl http://localhost:8080/configured-by
 *
 * Spring Boot 에서는 DispatcherServlet 이 SpringApplication 부팅 과정에서 자동으로 등록된다.
 * pure-Spring + WAR 환경에서 같은 일을 하던 {@link AppInitializer} 클래스를 함께 두어,
 * "어떤 코드가 비-Boot 환경에서 같은 역할을 했는가" 를 비교할 수 있게 했다.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
