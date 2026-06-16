package com.ysy.webmvc.viewtech.jackson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JacksonViewController {

    @GetMapping("/jv/json")
    public String json(Model model) {
        model.addAttribute("name", "spring");
        model.addAttribute("year", 2025);
        return "jacksonJsonView";
    }

    @GetMapping("/jv/xml")
    public String xml(Model model) {
        model.addAttribute("name", "spring");
        model.addAttribute("year", 2025);
        return "jacksonXmlView";
    }
}
