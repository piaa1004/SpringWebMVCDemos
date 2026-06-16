package com.ysy.webmvc.mvcconfig.advancedxml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvancedXmlController {

    @GetMapping("/ax/info")
    public String info() {
        return "advanced XML: src/main/resources/advanced-xml/mvc.xml";
    }
}
