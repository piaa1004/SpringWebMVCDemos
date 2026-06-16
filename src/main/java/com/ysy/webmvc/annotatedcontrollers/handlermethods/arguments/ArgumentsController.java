package com.ysy.webmvc.annotatedcontrollers.handlermethods.arguments;

import java.security.Principal;
import java.util.Locale;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Handler Methods > Method Arguments.
 *
 * Spring 이 자동으로 주입해주는 대표 인자 타입을 한 컨트롤러에서 시연.
 */
@RestController
public class ArgumentsController {

    @GetMapping("/args")
    public String args(HttpServletRequest request,
                       HttpSession session,
                       HttpMethod method,
                       Locale locale,
                       Principal principal,
                       Model model) {
        model.addAttribute("k", "v"); // model 인자는 view 핸들러에서 유용
        return String.format("uri=%s method=%s locale=%s session=%s principal=%s",
                request.getRequestURI(),
                method,
                locale,
                session.getId(),
                principal);
    }
}
