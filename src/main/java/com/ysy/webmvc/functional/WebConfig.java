package com.ysy.webmvc.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;

/**
 * Functional Endpoints.
 *
 * 어노테이션 컨트롤러 대신 {@link RouterFunction} + HandlerFunction 으로 라우팅을 선언.
 * Spring 은 RouterFunction 빈을 자동으로 발견해 RouterFunctionMapping 에 등록한다.
 */
@Configuration
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> routes(GreetingHandler handler) {
        return route(GET("/fn/hello"), handler::hello)
                .andRoute(GET("/fn/echo/{msg}"), handler::echo);
    }
}
