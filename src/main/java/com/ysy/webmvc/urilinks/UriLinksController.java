package com.ysy.webmvc.urilinks;

import java.net.URI;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.on;

/**
 * URI Links — Spring 의 세 가지 빌더를 한 컨트롤러에서 시연:
 *   - {@link UriComponentsBuilder}        : 정적 URI 구성 (Spring MVC 외부에서도 사용 가능)
 *   - {@link ServletUriComponentsBuilder} : 현재 요청 기준 URI 빌더 (fromCurrentRequest 등)
 *   - {@link MvcUriComponentsBuilder}     : 컨트롤러 메서드 참조로 type-safe URI 생성
 */
@RestController
public class UriLinksController {

    @GetMapping("/uri/static")
    public Map<String, String> staticUri() {
        URI uri = UriComponentsBuilder.fromUriString("https://example.com")
                .path("/items/{id}")
                .queryParam("ref", "abc")
                .build(42);
        return Map.of("uri", uri.toString());
    }

    @GetMapping("/uri/current")
    public Map<String, String> currentUri() {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .replacePath("/echo")
                .queryParam("ts", System.currentTimeMillis())
                .build()
                .toUri();
        return Map.of("uri", uri.toString());
    }

    /** type-safe 한 컨트롤러 메서드 참조: 메서드 시그니처 변경 시 컴파일 에러로 잡힌다. */
    @GetMapping("/uri/method-link")
    public Map<String, String> methodLink() {
        URI uri = MvcUriComponentsBuilder
                .fromMethodCall(on(UriLinksController.class).getOne(123L))
                .build()
                .toUri();
        return Map.of("link", uri.toString());
    }

    @GetMapping("/items/{id}")
    public Map<String, Object> getOne(@PathVariable Long id) {
        return Map.of("id", id);
    }
}
