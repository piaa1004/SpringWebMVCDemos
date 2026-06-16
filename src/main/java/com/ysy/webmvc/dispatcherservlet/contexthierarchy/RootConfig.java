package com.ysy.webmvc.dispatcherservlet.contexthierarchy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Root ApplicationContext.
 *
 * Spring docs - DispatcherServlet › Context Hierarchy:
 *   - Root context 는 보통 service / repository / infrastructure 빈을 담는다.
 *   - DispatcherServlet 의 자식 web context 는 root context 의 빈을 주입받을 수 있지만,
 *     그 반대는 불가능.
 *
 * 여기서는 단순한 GreetingService 한 개만 root 에 등록해, 자식 web context 의 컨트롤러가
 * 이 빈을 주입받는 모습을 보여준다.
 */
@Configuration
public class RootConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("hello from ROOT context");
    }
}
