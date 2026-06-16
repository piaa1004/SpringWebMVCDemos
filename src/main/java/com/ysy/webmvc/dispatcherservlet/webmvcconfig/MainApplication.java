package com.ysy.webmvc.dispatcherservlet.webmvcconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   curl http://localhost:8080/ping    (PingController 가 응답)
 *   curl -i http://localhost:8080/home (addViewControllers 가 응답, 200 OK)
 *
 * 인터셉터 로그가 콘솔에 찍힌다.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
