package com.ysy.webmvc.annotatedcontrollers.handlermethods.requestbody;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Handler Methods > @RequestBody.
 *
 * HttpMessageConverter 가 본문을 객체로 역직렬화 (기본적으로 Jackson 이 JSON 처리).
 */
@RestController
public class RequestBodyController {

    @PostMapping("/echo-body")
    public Person echo(@RequestBody Person p) {
        return p;
    }

    public static class Person {
        public String name;
        public Integer age;
    }
}
