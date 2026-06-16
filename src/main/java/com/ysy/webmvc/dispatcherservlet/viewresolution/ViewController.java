package com.ysy.webmvc.dispatcherservlet.viewresolution;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    /** "jsonView" 라는 빈 이름과 일치 → BeanNameViewResolver 가 처리. */
    @GetMapping("/json")
    public String json(Model model) {
        model.addAttribute("name", "spring");
        model.addAttribute("year", 2025);
        return "jsonView";
    }

    /** 다른 빈에 매칭되지 않으므로 InternalResourceViewResolver 가 JSP forward. */
    @GetMapping("/html")
    public String html(Model model) {
        model.addAttribute("msg", "hello via JSP");
        return "html/hello"; // → /WEB-INF/views/html/hello.jsp
    }
}
