package com.ysy.webmvc.viewtech.xmlmarshalling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MarshallingView 는 modelKey 가 설정되지 않으면 모델의 첫 번째 (그리고 보통은 유일한) attribute 를 marshall.
 * 본 데모는 attribute 한 개만 두어 별도 키 지정 없이 자동 발견되게 한다.
 */
@Controller
public class XmlController {

    @GetMapping("/xml/person")
    public String person(Model model) {
        model.addAttribute("person", new Person("alice", 30));
        return "personXml";
    }
}
