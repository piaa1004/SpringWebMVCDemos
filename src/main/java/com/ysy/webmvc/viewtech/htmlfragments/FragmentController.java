package com.ysy.webmvc.viewtech.htmlfragments;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {

    @GetMapping("/frag/full")
    public String full(Model model) {
        model.addAttribute("items", List.of("a", "b"));
        return "fragments/page";
    }

    /** "page::list" → 전체 페이지 대신 list fragment 만 응답. */
    @GetMapping("/frag/list")
    public String partial(Model model) {
        model.addAttribute("items", List.of("c", "d", "e"));
        return "fragments/page :: list";
    }
}
