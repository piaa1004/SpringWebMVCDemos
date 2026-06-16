package com.ysy.webmvc.annotatedcontrollers.handlermethods.httpentity;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Handler Methods > HttpEntity.
 *
 * 본문 + 헤더를 한꺼번에 인자로 받는 방법. @RequestBody 보다 더 raw.
 */
@RestController
public class HttpEntityController {

    @PostMapping("/he")
    public String he(HttpEntity<String> entity) {
        return "headers=" + entity.getHeaders().getContentType()
                + " body=" + entity.getBody();
    }
}
