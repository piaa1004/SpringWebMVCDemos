package com.ysy.webmvc.dispatcherservlet.servletconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @GetMapping("/configured-by")
    public String configuredBy() {
        return "DispatcherServlet was registered via AbstractAnnotationConfigDispatcherServletInitializer";
    }
}
