package com.ysy.webmvc.annotatedcontrollers.handlermethods.responsebody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Annotated Controllers > Handler Methods > @ResponseBody.
 *
 * 메서드 반환값을 view 이름이 아니라 응답 본문으로 직접 직렬화.
 * RestController = Controller + @ResponseBody (메서드마다 붙일 필요 없음).
 */
@Controller
public class ResponseBodyController {

    @GetMapping("/rb/string")
    @ResponseBody
    public String string() {
        return "raw body";
    }

    @GetMapping("/rb/object")
    @ResponseBody
    public Result object() {
        return new Result("ok", 42);
    }

    public record Result(String status, int code) {}
}
