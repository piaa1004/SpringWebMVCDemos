package com.ysy.webmvc.annotatedcontrollers.handlermethods.redirectattributes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * {@link RedirectAttributes#addAttribute} 는 URL 쿼리스트링으로 노출.
 * (flash attribute 는 형제 패키지 flashattributes 참조)
 */
@Controller
public class RedirectController {

    @GetMapping("/r/post")
    public String post(@RequestParam String name, RedirectAttributes ra) {
        ra.addAttribute("created", name);
        return "redirect:/r/done";
    }

    @GetMapping("/r/done")
    @ResponseBody
    public String done(@RequestParam(required = false) String created) {
        return "done created=" + created;
    }
}
