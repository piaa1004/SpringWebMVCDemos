package com.ysy.webmvc.mvcconfig.interceptors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorsController {

    @GetMapping("/admin/dash")  public String admin()  { return "admin"; }
    @GetMapping("/pub/info")    public String pub()    { return "public"; }
}
