package com.ysy.webmvc.mvcconfig.enable;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnableController {

    private final ApplicationContext ctx;

    @Autowired
    public EnableController(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @GetMapping("/enable/beans")
    public String beans() {
        return Arrays.stream(ctx.getBeanDefinitionNames())
                .filter(n -> n.toLowerCase().contains("handlermapping")
                        || n.toLowerCase().contains("handleradapter")
                        || n.toLowerCase().contains("exceptionresolver"))
                .sorted()
                .collect(Collectors.joining("\n"));
    }
}
