package com.ysy.webmvc.rangerequests;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Range Requests.
 *
 * 핸들러가 {@link Resource} 를 반환하면 ResourceHttpMessageConverter 가
 * HTTP Range 헤더를 인지해 일부 바이트만 응답한다 (HTTP 206 Partial Content).
 */
@RestController
public class RangeController {

    private static final byte[] DATA;
    static {
        DATA = new byte[1024];
        for (int i = 0; i < DATA.length; i++) DATA[i] = (byte) ('a' + (i % 26));
    }

    @GetMapping(value = "/range/alphabet", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<Resource> alphabet() {
        return ResponseEntity.ok()
                .contentLength(DATA.length)
                .header("Accept-Ranges", "bytes")
                .body(new ByteArrayResource(DATA));
    }
}
