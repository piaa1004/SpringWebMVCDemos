package com.ysy.webmvc.annotatedcontrollers.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Annotated Controllers > Model.
 *
 * - {@code @ModelAttribute} 메서드는 컨트롤러의 모든 핸들러 호출 전에 실행되어 모델을 미리 채운다.
 * - 핸들러 메서드는 {@link Model} 인자로 추가 채움.
 */
@Controller
public class ModelDemoController {

    @ModelAttribute("globalNow")
    public String now() {
        return java.time.LocalDateTime.now().toString();
    }

    @GetMapping("/model")
    public String model(Model model) {
        model.addAttribute("msg", "hello model");
        return "modeldemo/page"; // → /WEB-INF/views/modeldemo/page.jsp
    }
}
