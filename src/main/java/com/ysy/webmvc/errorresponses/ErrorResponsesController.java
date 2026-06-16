package com.ysy.webmvc.errorresponses;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * Error Responses — RFC 7807 Problem Details 표준 응답.
 *
 *  - {@link ResponseStatusException} : 상태 + 메시지만 빠르게
 *  - {@link ErrorResponseException}  : ProblemDetail 직접 조작 (type/title/properties)
 *  - {@link ErrorResponse}           : 인터페이스 — 커스텀 예외에 부착
 */
@RestController
public class ErrorResponsesController {

    @GetMapping("/err/quick")
    public String quick() {
        throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "validation failed");
    }

    @GetMapping("/err/problem")
    public String problem() {
        ErrorResponseException ex = new ErrorResponseException(HttpStatus.BAD_REQUEST);
        ex.getBody().setTitle("Bad input");
        ex.getBody().setDetail("name must not be blank");
        ex.getBody().setProperty("field", "name");
        throw ex;
    }
}
