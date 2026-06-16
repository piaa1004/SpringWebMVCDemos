package com.ysy.webmvc.viewtech.rssatom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Item;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

public class SampleRssFeedView extends AbstractRssFeedView {

    @Override
    protected void buildFeedMetadata(Map<String, Object> model, Channel feed, HttpServletRequest request) {
        feed.setTitle("Demo RSS");
        feed.setLink("http://localhost:8080/feed/rss");
        feed.setDescription("Spring MVC RSS sample");
    }

    @Override
    protected List<Item> buildFeedItems(Map<String, Object> model,
                                        HttpServletRequest request,
                                        HttpServletResponse response) {
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Item it = new Item();
            it.setTitle("Item " + i);
            it.setLink("http://localhost:8080/items/" + i);
            Description d = new Description();
            d.setValue("desc " + i);
            it.setDescription(d);
            items.add(it);
        }
        return items;
    }
}
