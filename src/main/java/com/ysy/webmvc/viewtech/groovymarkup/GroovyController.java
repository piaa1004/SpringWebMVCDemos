package com.ysy.webmvc.viewtech.groovymarkup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroovyController {

    @GetMapping("/gv/hello")
    public String hello(Model model) {
        model.addAttribute("name", "groovy");
        return "groovy/hello";
    }
}
