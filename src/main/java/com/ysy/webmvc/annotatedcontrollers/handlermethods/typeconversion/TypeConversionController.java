package com.ysy.webmvc.annotatedcontrollers.handlermethods.typeconversion;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeConversionController {

    @GetMapping("/conv/date")
    public String date(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate d) {
        return d.toString();
    }

    @GetMapping("/conv/percent")
    public String percent(@RequestParam @NumberFormat(style = NumberFormat.Style.PERCENT) Double p) {
        return "p=" + p;
    }

    /** Color enum 으로의 사용자 정의 Converter 가 자동 적용. */
    @GetMapping("/conv/color")
    public String color(@RequestParam Color c) {
        return "color=" + c;
    }
}
