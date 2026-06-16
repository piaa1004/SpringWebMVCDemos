package com.ysy.webmvc.annotatedcontrollers.declaration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @RestController} = {@code @Controller} + 모든 핸들러에 {@code @ResponseBody} 적용.
 * 매번 ResponseBody 를 붙일 필요 없이 JSON 등 직접 응답 본문 반환에 적합.
 */
@RestController
public class HelloRestController {

    @GetMapping("/hello-rest")
    public String hello() {
        return "hello from @RestController";
    }
}
