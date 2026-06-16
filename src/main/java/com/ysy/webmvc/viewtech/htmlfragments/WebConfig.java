package com.ysy.webmvc.viewtech.htmlfragments;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * HTML Fragments — Thymeleaf 의 fragment 기능으로 페이지 일부만 렌더링.
 * HTMX 등에서 partial update 에 사용. view name 형식: "<page>::<fragment>"
 */
@Configuration
@ComponentScan(basePackageClasses = FragmentController.class)
public class WebConfig {
}
