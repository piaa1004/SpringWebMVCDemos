package com.ysy.webmvc.annotatedcontrollers.handlermethods.flashattributes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Flash attribute : URL 에는 안 보이고 session 에 잠깐 저장 → 다음 요청 모델에만 전달.
 * POST-Redirect-GET 에서 success 메시지를 전달할 때 유용.
 */
@Controller
public class FlashController {

    @GetMapping("/flash/post")
    public String post(@RequestParam String name, RedirectAttributes ra) {
        ra.addFlashAttribute("msg", "created " + name);
        return "redirect:/flash/done";
    }

    @GetMapping("/flash/done")
    @ResponseBody
    public String done(Model model) {
        return "flash msg=" + model.getAttribute("msg");
    }
}
