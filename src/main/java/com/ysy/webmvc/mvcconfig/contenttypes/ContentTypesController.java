package com.ysy.webmvc.mvcconfig.contenttypes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentTypesController {

    public record Hello(String greeting) {}

    @GetMapping(value = "/hi", produces = {"application/json", "application/xml"})
    public Hello hi() {
        return new Hello("hello world");
    }
}
