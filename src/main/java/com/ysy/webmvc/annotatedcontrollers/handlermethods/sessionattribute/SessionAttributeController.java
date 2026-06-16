package com.ysy.webmvc.annotatedcontrollers.handlermethods.sessionattribute;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * 메서드 인자 레벨 {@code @SessionAttribute} : 외부 코드가 미리 세션에 넣어둔 값을 읽어옴.
 * (클래스 레벨 @SessionAttributes 와 달리 직접 모델→세션 승격 메커니즘 없음.)
 */
@RestController
public class SessionAttributeController {

    @GetMapping("/sess/put")
    public String put(HttpSession session) {
        session.setAttribute("greeting", "hi");
        return "put";
    }

    @GetMapping("/sess/read")
    public String read(@SessionAttribute("greeting") String greeting) {
        return "read=" + greeting;
    }
}
