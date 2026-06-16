package com.ysy.webmvc.async;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class AsyncController {

    /** Callable : Spring 의 TaskExecutor 에 위임돼 servlet 스레드를 즉시 반환. */
    @GetMapping("/async/callable")
    public Callable<String> callable() {
        return () -> {
            Thread.sleep(300);
            return "callable thread=" + Thread.currentThread().getName();
        };
    }

    /** DeferredResult : 외부 이벤트 (예: 메시지 큐) 가 setResult 호출. */
    @GetMapping("/async/deferred")
    public DeferredResult<String> deferred() {
        DeferredResult<String> dr = new DeferredResult<>(3_000L, "timeout-fallback");
        new Thread(() -> {
            try { Thread.sleep(300); } catch (InterruptedException ignored) {}
            dr.setResult("deferred from " + Thread.currentThread().getName());
        }).start();
        return dr;
    }
}
