package com.ysy.webmvc.dispatcherservlet.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then: curl "http://localhost:8080/echo?x=1"
 *
 * 콘솔에 REQ-BEFORE / REQ-AFTER 로그가 찍힌다.
 * CommonsRequestLoggingFilter 는 DEBUG 레벨에서만 로그를 출력하므로,
 * application.properties 가 아래 로거를 debug 로 올려 둠:
 *   logging.level.org.springframework.web.filter.CommonsRequestLoggingFilter=debug
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
