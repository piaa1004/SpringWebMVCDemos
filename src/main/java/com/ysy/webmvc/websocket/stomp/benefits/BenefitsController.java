package com.ysy.webmvc.websocket.stomp.benefits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenefitsController {

    @GetMapping("/stomp/benefits")
    public String benefits() {
        return "STOMP benefits: standardized frames, destination routing, broker integration";
    }
}
