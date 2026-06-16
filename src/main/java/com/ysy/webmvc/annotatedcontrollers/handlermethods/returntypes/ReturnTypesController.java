package com.ysy.webmvc.annotatedcontrollers.handlermethods.returntypes;

import java.util.Map;
import java.util.concurrent.Callable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

/**
 * Annotated Controllers > Handler Methods > Return Values.
 *
 * Spring 이 지원하는 주요 반환 타입 한 줄짜리 데모.
 */
@RestController
public class ReturnTypesController {

    /** String 본문 (RestController 라서 @ResponseBody 자동 적용). */
    @GetMapping("/r/string")
    public String string() {
        return "plain";
    }

    /** Map → JSON. */
    @GetMapping("/r/map")
    public Map<String, Object> map() {
        return Map.of("name", "alice", "age", 30);
    }

    /** ResponseEntity → 상태/헤더 직접 제어. */
    @GetMapping("/r/entity")
    public ResponseEntity<String> entity() {
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("X-Demo", "yes")
                .body("created");
    }

    /** Callable → MVC 비동기 처리. */
    @GetMapping("/r/callable")
    public Callable<String> callable() {
        return () -> {
            Thread.sleep(200);
            return "async via Callable";
        };
    }

    /** DeferredResult → 외부 이벤트로 완료. */
    @GetMapping("/r/deferred")
    public DeferredResult<String> deferred() {
        DeferredResult<String> dr = new DeferredResult<>(2000L);
        new Thread(() -> {
            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
            dr.setResult("async via DeferredResult");
        }).start();
        return dr;
    }

    /** SSE 스트림. */
    @GetMapping("/r/sse")
    public SseEmitter sse() {
        SseEmitter emitter = new SseEmitter();
        new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    emitter.send(SseEmitter.event().name("tick").data(i));
                    Thread.sleep(100);
                }
                emitter.complete();
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        }).start();
        return emitter;
    }

    /** StreamingResponseBody → 청크 응답. */
    @GetMapping("/r/stream")
    public StreamingResponseBody stream() {
        return out -> {
            for (int i = 0; i < 3; i++) {
                out.write(("chunk " + i + "\n").getBytes());
                out.flush();
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        };
    }
}
