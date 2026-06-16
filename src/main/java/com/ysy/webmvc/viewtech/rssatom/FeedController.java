package com.ysy.webmvc.viewtech.rssatom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedController {

    @GetMapping("/feed/rss")
    public String rss() {
        return "rssFeed"; // BeanNameViewResolver → SampleRssFeedView
    }

    @GetMapping("/feed/atom")
    public String atom() {
        return "atomFeed";
    }
}
