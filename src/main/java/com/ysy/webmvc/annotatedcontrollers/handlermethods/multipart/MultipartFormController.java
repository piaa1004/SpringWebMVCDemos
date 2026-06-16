package com.ysy.webmvc.annotatedcontrollers.handlermethods.multipart;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Annotated Controllers > Handler Methods > Multipart (form).
 *
 * 폼 한 개에 일반 필드 + 파일들이 섞여 들어오는 케이스.
 *  - @RequestParam → 일반 텍스트/파일
 *  - @RequestPart → JSON 등 구조화된 part 를 HttpMessageConverter 로 역직렬화 가능
 */
@RestController
public class MultipartFormController {

    @PostMapping("/multi")
    public String multi(@RequestParam String title,
                        @RequestParam("file") List<MultipartFile> files,
                        @RequestPart(value = "meta", required = false) MetaDto meta) {
        return String.format("title=%s files=%d meta=%s",
                title, files.size(), meta);
    }

    public static class MetaDto {
        public String tag;
        @Override public String toString() { return "Meta{tag=" + tag + "}"; }
    }
}
