package com.ysy.webmvc.websocket.stomp.overview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverviewController {

    @GetMapping("/stomp/overview")
    public String overview() {
        return "STOMP overview — see enable / simplebroker / annotatedcontrollers sub-packages for working samples";
    }
}
