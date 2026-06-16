package com.ysy.webmvc.annotatedcontrollers.validation;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Validation.
 *
 * Bean Validation 적용. {@code @Valid} 가 붙은 인자가 검증되고, 검증 결과는
 * 바로 다음 자리의 {@link BindingResult} 로 받음 (없으면 MethodArgumentNotValidException).
 */
@RestController
public class ValidationController {

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody Signup signup, BindingResult br) {
        if (br.hasErrors()) {
            return ResponseEntity.badRequest().body(br.getAllErrors().toString());
        }
        return ResponseEntity.ok("welcome " + signup.username);
    }
}
