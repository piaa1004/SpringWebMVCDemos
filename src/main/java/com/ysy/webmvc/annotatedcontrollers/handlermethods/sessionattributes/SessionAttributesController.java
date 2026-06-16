package com.ysy.webmvc.annotatedcontrollers.handlermethods.sessionattributes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 클래스 레벨 {@code @SessionAttributes} : 지정한 모델 속성을 HTTP session 에 저장,
 * 후속 요청에서 같은 컨트롤러가 그대로 꺼내 쓸 수 있게 한다.
 *
 * 흐름:
 *   GET  /cart/start → cart 를 모델에 추가, session 으로 승격
 *   GET  /cart/show  → session 에서 cart 꺼냄
 *   POST /cart/end   → SessionStatus.setComplete() → session 에서 제거
 */
@Controller
@SessionAttributes("cart")
public class SessionAttributesController {

    @GetMapping("/cart/start")
    @ResponseBody
    public String start(Model model) {
        Cart c = new Cart();
        c.items.add("apple");
        model.addAttribute("cart", c);
        return "started: " + c;
    }

    @GetMapping("/cart/show")
    @ResponseBody
    public String show(@ModelAttribute("cart") Cart cart) {
        return "current: " + cart;
    }

    @GetMapping("/cart/end")
    @ResponseBody
    public String end(SessionStatus status) {
        status.setComplete();
        return "cart cleared";
    }
}
