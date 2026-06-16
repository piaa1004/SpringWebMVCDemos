package com.ysy.webmvc.annotatedcontrollers.handlermethods.responseentity;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotated Controllers > Handler Methods > ResponseEntity.
 *
 * 상태 코드, 헤더, 본문을 모두 제어. {@code ResponseEntity.ok().build()} 같은 빌더 API.
 */
@RestController
public class ResponseEntityController {

    @GetMapping("/re/ok")
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/re/created")
    public ResponseEntity<String> created() {
        return ResponseEntity.created(URI.create("/things/42"))
                .contentType(MediaType.TEXT_PLAIN)
                .body("created");
    }

    @GetMapping("/re/no-content")
    public ResponseEntity<Void> noContent() {
        return ResponseEntity.noContent()
                .header(HttpHeaders.PRAGMA, "no-cache")
                .build();
    }

    @GetMapping("/re/teapot")
    public ResponseEntity<String> teapot() {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("short and stout");
    }
}
