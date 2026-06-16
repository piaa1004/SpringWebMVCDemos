package com.ysy.webmvc.dispatcherservlet.locale;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocaleController {

    private final MessageSource messages;

    @Autowired
    public LocaleController(MessageSource messages) {
        this.messages = messages;
    }

    @GetMapping("/greet")
    public String greet(Locale locale) {
        return messages.getMessage("greeting", null, locale);
    }
}
