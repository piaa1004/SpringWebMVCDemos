package com.ysy.webmvc.mvcconfig.messageconverters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageConvertersController {

    @GetMapping(value = "/mc/csv", produces = "text/csv")
    public String csv() {
        return "name,age\nalice,30\nbob,40";
    }
}
