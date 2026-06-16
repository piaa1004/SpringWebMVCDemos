package com.ysy.webmvc.annotatedcontrollers.handlermethods.matrixvariables;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrixController {

    /** GET /cars/123;color=red;year=2024 → id=123 color=red year=2024 */
    @GetMapping("/cars/{id}")
    public String byId(@PathVariable String id,
                       @MatrixVariable(required = false) String color,
                       @MatrixVariable(required = false) Integer year) {
        return String.format("id=%s color=%s year=%s", id, color, year);
    }
}
