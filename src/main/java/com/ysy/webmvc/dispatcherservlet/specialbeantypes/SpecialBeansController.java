package com.ysy.webmvc.dispatcherservlet.specialbeantypes;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialBeansController {

    private final ApplicationContext ctx;

    @Autowired
    public SpecialBeansController(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    /**
     * 현재 web ApplicationContext 에 등록된 "DispatcherServlet special beans" 를 dump.
     * Spring docs 의 special bean types 표가 실제 빈으로 어떻게 노출되는지 확인용.
     */
    @GetMapping("/special-beans")
    public String specialBeans() {
        return Arrays.stream(ctx.getBeanDefinitionNames())
                .filter(n -> n.toLowerCase().endsWith("resolver")
                        || n.toLowerCase().contains("handlermapping")
                        || n.toLowerCase().contains("handleradapter")
                        || n.toLowerCase().contains("flashmap")
                        || n.toLowerCase().contains("multipart"))
                .sorted()
                .collect(Collectors.joining("\n"));
    }
}
