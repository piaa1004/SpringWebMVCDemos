package com.ysy.webmvc.viewtech.pdfexcel;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentController {

    @GetMapping("/doc/pdf")
    public String pdf(Model model) {
        model.addAttribute("title", "Spring PDF demo");
        model.addAttribute("lines", List.of("line 1", "line 2", "line 3"));
        return "pdfView";
    }

    @GetMapping("/doc/xlsx")
    public String xlsx(Model model) {
        model.addAttribute("rows", List.of(
                List.of("name", "score"),
                List.of("alice", "92"),
                List.of("bob", "88")));
        return "xlsxView";
    }
}
