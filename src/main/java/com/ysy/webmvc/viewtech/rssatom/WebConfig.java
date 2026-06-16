package com.ysy.webmvc.viewtech.rssatom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;

/**
 * RSS and Atom — Rome 의존성 + AbstractRssFeedView/AbstractAtomFeedView 활용.
 *
 * View 빈 이름을 컨트롤러가 반환하는 view name 과 일치시키면 BeanNameViewResolver 가 매칭한다.
 * (Boot 가 BeanNameViewResolver 자동 등록.)
 */
@Configuration
@ComponentScan(basePackageClasses = FeedController.class)
public class WebConfig {

    @Bean
    public View rssFeed() {
        return new SampleRssFeedView();
    }

    @Bean
    public View atomFeed() {
        return new SampleAtomFeedView();
    }
}
