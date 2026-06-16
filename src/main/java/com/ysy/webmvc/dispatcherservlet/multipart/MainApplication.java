package com.ysy.webmvc.dispatcherservlet.multipart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run, then:
 *   echo hello > x.txt
 *   curl -F "file=@x.txt" http://localhost:8080/upload
 *
 * Spring Boot 의 MultipartAutoConfiguration 이 StandardServletMultipartResolver 와
 * Servlet multipart-config 를 자동으로 켜준다. 추가 설정은 application.properties 의
 * spring.servlet.multipart.* 참조.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
