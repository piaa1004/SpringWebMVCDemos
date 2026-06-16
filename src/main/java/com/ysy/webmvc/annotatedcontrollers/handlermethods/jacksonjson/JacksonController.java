package com.ysy.webmvc.annotatedcontrollers.handlermethods.jacksonjson;

import java.time.LocalDateTime;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Jackson 의 @JsonView, MappingJacksonValue 활용 예.
 */
@RestController
public class JacksonController {

    /** ObjectMapper 의 PrettyPrinter / JavaTimeModule 효과 확인. */
    @GetMapping("/j/time")
    public Map<String, Object> time() {
        return Map.of("now", LocalDateTime.now());
    }

    /** @JsonView 로 응답 필드를 선택적으로 노출. */
    @GetMapping("/j/public")
    @JsonView(Views.Public.class)
    public User publicView() {
        return new User("alice", "secret");
    }

    @GetMapping("/j/internal")
    @JsonView(Views.Internal.class)
    public User internalView() {
        return new User("alice", "secret");
    }

    /** MappingJacksonValue 로 응답마다 동적으로 view 지정. */
    @GetMapping("/j/dynamic")
    public MappingJacksonValue dynamic() {
        MappingJacksonValue v = new MappingJacksonValue(new User("alice", "secret"));
        v.setSerializationView(Views.Public.class);
        return v;
    }

    public static class Views {
        public interface Public {}
        public interface Internal extends Public {}
    }

    public static class User {
        @JsonView(Views.Public.class)
        public String name;

        @JsonView(Views.Internal.class)
        public String secret;

        public User(String name, String secret) {
            this.name = name;
            this.secret = secret;
        }
    }
}
