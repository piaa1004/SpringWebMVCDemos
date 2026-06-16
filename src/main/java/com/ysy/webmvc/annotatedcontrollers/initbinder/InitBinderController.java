package com.ysy.webmvc.annotatedcontrollers.initbinder;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > @InitBinder.
 *
 * 컨트롤러 단위로 {@code WebDataBinder} 를 커스터마이즈해, 요청 파라미터를 컨트롤러에 전달하기 전에
 * 타입 변환 규칙을 더한다. 여기서는 yyyyMMdd → LocalDate.
 */
@RestController
public class InitBinderController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
            @Override public void setAsText(String text) {
                setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyyMMdd")));
            }
        });
    }

    @GetMapping("/parse")
    public String parse(@RequestParam("date") LocalDate date) {
        return "parsed=" + date;
    }
}
