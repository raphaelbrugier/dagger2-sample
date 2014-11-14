package com.github.rbrugier;

import javax.inject.Inject;

public class Tweeter {
    private final TwitterApi twitterApi;

    @Inject
    public Tweeter(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    public void tweet(String tweetChars) {
        twitterApi.sendTweet(tweetChars);
    }
}
