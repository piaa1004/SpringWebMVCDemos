package com.ysy.webmvc.annotatedcontrollers.declaration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Annotated Controllers > Declaration.
 *
 * {@code @Controller} 는 모든 stereotype 중 하나로, MVC 가 컨트롤러로 인식하기 위한 마크.
 * view 이름 또는 HTML body 를 반환할 수 있음.
 */
@Controller
public class HelloHtmlController {

    @GetMapping("/hello-html")
    @ResponseBody
    public String hello() {
        return "<h1>hello from @Controller</h1>";
    }
}
