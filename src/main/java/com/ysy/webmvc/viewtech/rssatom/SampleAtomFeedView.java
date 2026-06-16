package com.ysy.webmvc.viewtech.rssatom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rometools.rome.feed.atom.Content;
import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.atom.Feed;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

public class SampleAtomFeedView extends AbstractAtomFeedView {

    @Override
    protected void buildFeedMetadata(Map<String, Object> model, Feed feed, HttpServletRequest request) {
        feed.setId("urn:demo");
        feed.setTitle("Demo Atom");
        feed.setUpdated(new Date());
    }

    @Override
    protected List<Entry> buildFeedEntries(Map<String, Object> model,
                                           HttpServletRequest request,
                                           HttpServletResponse response) {
        List<Entry> entries = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Entry e = new Entry();
            e.setId("urn:demo:item:" + i);
            e.setTitle("Atom Item " + i);
            e.setUpdated(new Date());
            Content c = new Content();
            c.setValue("atom desc " + i);
            e.setContents(List.of(c));
            entries.add(e);
        }
        return entries;
    }
}
