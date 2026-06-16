package com.ysy.webmvc.annotatedcontrollers.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Annotated Controllers > Controller Advice.
 *
 * {@code @RestControllerAdvice} = {@code @ControllerAdvice} + 응답 본문 직렬화.
 *   - 전역 {@code @ExceptionHandler}
 *   - 전역 {@code @ModelAttribute} (모든 컨트롤러의 모델에 공통 속성 주입)
 *   - 전역 {@code @InitBinder} 도 동일 위치에 둘 수 있음.
 */
@RestControllerAdvice
public class GlobalAdvice {

    @ModelAttribute("serverName")
    public String serverName() {
        return "SpringWebMVCDemos";
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> any(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("global: " + ex.getClass().getSimpleName() + " " + ex.getMessage());
    }
}
