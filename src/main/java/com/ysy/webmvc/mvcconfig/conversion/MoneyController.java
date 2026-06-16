package com.ysy.webmvc.mvcconfig.conversion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyController {

    @GetMapping("/conv/money")
    public String money(@RequestParam Money m) {
        return m.toString();
    }
}
