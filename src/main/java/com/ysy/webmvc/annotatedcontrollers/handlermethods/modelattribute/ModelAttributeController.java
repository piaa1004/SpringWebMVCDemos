package com.ysy.webmvc.annotatedcontrollers.handlermethods.modelattribute;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ModelAttribute 인자: 쿼리/폼 파라미터를 객체로 바인딩.
 *   GET /pet?name=Rex&age=3 → Pet{name=Rex, age=3}
 */
@RestController
public class ModelAttributeController {

    @GetMapping("/pet")
    public String pet(@ModelAttribute Pet pet) {
        return pet.toString();
    }
}
