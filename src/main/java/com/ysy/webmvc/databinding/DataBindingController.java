package com.ysy.webmvc.databinding;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Data Binding — Spring 의 {@link DataBinder} 패밀리.
 *
 *  - {@link WebDataBinder} : 요청 파라미터를 객체로 바인딩
 *  - {@link BindingResult} : 바인딩/검증 결과 모음 (필드별 오류 포함)
 *  - {@link ValidationUtils} : 보일러플레이트 줄여주는 검증 헬퍼
 */
@RestController
public class DataBindingController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("product", "quantity", "customerEmail");
        binder.setRequiredFields("product", "quantity");
    }

    @PostMapping("/db/order")
    public String order(@ModelAttribute Order order, BindingResult br) {
        ValidationUtils.rejectIfEmpty(br, "product", "product.empty");
        if (order.quantity != null && order.quantity <= 0) {
            br.rejectValue("quantity", "quantity.positive");
        }
        if (br.hasErrors()) {
            return "errors=" + br.getAllErrors();
        }
        return "ok " + order;
    }
}
