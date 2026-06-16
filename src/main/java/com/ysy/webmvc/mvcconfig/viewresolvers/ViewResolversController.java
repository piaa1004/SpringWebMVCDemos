package com.ysy.webmvc.mvcconfig.viewresolvers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewResolversController {

    @GetMapping("/vr/info")
    public String info() {
        return "view-resolvers registered via ViewResolverRegistry — see WebConfig";
    }
}
