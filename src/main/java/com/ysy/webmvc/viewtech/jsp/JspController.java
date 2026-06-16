package com.ysy.webmvc.viewtech.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {

    @GetMapping("/jsp/info")
    @ResponseBody
    public String info() {
        return "JSP 토픽: jar 패키징에서는 동작하지 않음. WebConfig 코멘트의 war 설정 참조.";
    }
}
