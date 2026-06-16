package com.ysy.webmvc.viewtech.thymeleaf;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/th/list")
    public String list(Model model) {
        model.addAttribute("items", List.of("alpha", "beta", "gamma"));
        return "thymeleaf/list";
    }
}
