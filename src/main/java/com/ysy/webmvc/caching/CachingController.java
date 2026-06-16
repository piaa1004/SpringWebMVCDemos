package com.ysy.webmvc.caching;

import java.time.Duration;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 * HTTP Caching — Cache-Control / ETag / If-None-Match / Last-Modified 의 표준 흐름.
 */
@RestController
public class CachingController {

    private static final long LAST_MODIFIED = System.currentTimeMillis();
    private static final String ETAG = "\"v1\"";

    /** Cache-Control 헤더로 클라이언트 캐싱 정책을 지시. */
    @GetMapping("/cache/cc")
    public ResponseEntity<String> cc() {
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(Duration.ofMinutes(10)).cachePublic())
                .body("cached");
    }

    /** ETag/Last-Modified + If-None-Match 검증을 WebRequest 헬퍼로 처리. */
    @GetMapping("/cache/cond")
    public ResponseEntity<String> conditional(WebRequest webRequest) {
        if (webRequest.checkNotModified(ETAG)) {
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
        }
        return ResponseEntity.ok()
                .eTag(ETAG)
                .lastModified(LAST_MODIFIED)
                .body("body for ETag " + ETAG);
    }

    /** 정적으로 헤더만 보이는 디버그용. */
    @GetMapping("/cache/headers")
    public ResponseEntity<String> headers(HttpServletRequest req) {
        return ResponseEntity.ok("if-none-match=" + req.getHeader("If-None-Match")
                + " if-modified-since=" + req.getHeader("If-Modified-Since"));
    }
}
