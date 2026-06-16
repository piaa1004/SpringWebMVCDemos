package com.ysy.webmvc.mvcconfig.validation;

import jakarta.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @PostMapping("/v/booking")
    public String book(@Valid @RequestBody Booking b, BindingResult br) {
        if (br.hasErrors()) {
            return "errors=" + br.getAllErrors();
        }
        return "booked " + b.guestName;
    }
}
