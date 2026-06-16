package com.ysy.webmvc.annotatedcontrollers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Exceptions.
 *
 * 컨트롤러 로컬 {@code @ExceptionHandler}. 전역(@ControllerAdvice) 보다 우선 매칭.
 */
@RestController
public class LocalExceptionController {

    @GetMapping("/danger")
    public String danger() {
        throw new IllegalStateException("kaboom");
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<String> handle(IllegalStateException ex) {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT)
                .body("local handler: " + ex.getMessage());
    }
}
