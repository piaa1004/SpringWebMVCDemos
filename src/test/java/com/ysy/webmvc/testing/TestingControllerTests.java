package com.ysy.webmvc.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Spring MVC Test — @WebMvcTest 로 컨트롤러 슬라이스만 부팅하고 MockMvc 로 HTTP 호출 시뮬레이션.
 */
@WebMvcTest(TestingController.class)
class TestingControllerTests {

    @Autowired MockMvc mvc;

    @Test
    void helloReturnsBody() throws Exception {
        mvc.perform(get("/t/hello"))
           .andExpect(status().isOk())
           .andExpect(content().string("hello"));
    }
}
