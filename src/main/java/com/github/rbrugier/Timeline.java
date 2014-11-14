package com.github.rbrugier;

import javax.inject.Inject;
import java.util.List;

public class Timeline {

    private final TwitterApi twitterApi;

    @Inject
    public Timeline(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    public List<String> getTimeline(int tweetsLimit) {
        return twitterApi.getTimeline(tweetsLimit);
    }
}
