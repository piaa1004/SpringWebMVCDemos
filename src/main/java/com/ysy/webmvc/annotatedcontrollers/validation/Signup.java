package com.ysy.webmvc.annotatedcontrollers.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Signup {

    @NotBlank
    @Size(min = 3, max = 20)
    public String username;

    @Email
    public String email;
}
