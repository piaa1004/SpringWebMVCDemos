package com.ysy.webmvc.viewtech.xsltviews;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class XsltController {

    @GetMapping("/xslt/people")
    public String people(Model model) {
        String xml = "<people><p name='alice'/><p name='bob'/></people>";
        Source source = new StreamSource(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));
        model.addAttribute("data", source);
        return "people"; // → xslt/people.xsl
    }
}
