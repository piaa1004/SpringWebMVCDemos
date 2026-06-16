package com.ysy.webmvc.dispatcherservlet.processing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String orders() {
        System.out.println("[controller] handling /orders");
        return "ok";
    }
}
