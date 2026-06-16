package com.ysy.webmvc.dispatcherservlet.contexthierarchy;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Run, then:
 *   curl http://localhost:8080/hello
 *   → "hello from ROOT context"
 *
 * 부모(root) / 자식(web) ApplicationContext 가 분리되어 협력하는 모습을 보여주는 데모.
 * Spring Boot 에서는 {@link SpringApplicationBuilder} 로 root 와 child 컨텍스트를 chain.
 *   - root : {@link RootConfig} (web type = NONE)
 *   - child: {@link MainApplication} (자동 component scan 으로 WebConfig + HelloController 발견)
 *
 * child 컨텍스트의 컨트롤러가 root 의 빈을 그대로 주입받는 것을 통해 컨텍스트 계층이 동작함을 확인.
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RootConfig.class)
                .web(WebApplicationType.NONE)
                .child(MainApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
