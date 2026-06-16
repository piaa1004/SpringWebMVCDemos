package com.ysy.webmvc.async;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Asynchronous Requests.
 *
 * Spring MVC 의 async 설정 (default timeout 과 TaskExecutor) 을 WebMvcConfigurer 로 변경.
 * 컨트롤러는 Callable/DeferredResult/SseEmitter/StreamingResponseBody 를 반환해 비동기로 처리.
 */
@Configuration
@ComponentScan(basePackageClasses = AsyncController.class)
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(5_000L);
        configurer.setTaskExecutor(mvcTaskExecutor());
    }

    private AsyncTaskExecutor mvcTaskExecutor() {
        ThreadPoolTaskExecutor exec = new ThreadPoolTaskExecutor();
        exec.setCorePoolSize(2);
        exec.setMaxPoolSize(4);
        exec.setThreadNamePrefix("mvc-async-");
        exec.initialize();
        return exec;
    }
}
