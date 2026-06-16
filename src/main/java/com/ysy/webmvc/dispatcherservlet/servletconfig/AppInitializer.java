package com.ysy.webmvc.dispatcherservlet.servletconfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * DispatcherServlet > Servlet Config.
 *
 * web.xml 없이 {@link AbstractAnnotationConfigDispatcherServletInitializer} 로
 * DispatcherServlet 을 등록하는 표준 코드. Servlet 3.0+ 의 SPI(ServletContainerInitializer)가
 * 컨테이너 부팅 시 이 클래스를 발견해 자동 실행.
 *
 * 본 데모에서는 사용자가 IDE/Maven 으로 직접 실행 가능하도록
 * {@link MainApplication} 이 embedded Tomcat 에 이 initializer 를 수동 적용한다.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // root context 없음
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
