package com.github.rbrugier;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class TwitterApi {

    private final String user;
    private final OkHttpClient httpClient;

    @Inject
    public TwitterApi(String user, OkHttpClient httpClient) {
        this.user = user;
        this.httpClient = httpClient;
    }

    public void sendTweet(String tweet) {
        String request = "[" + user + "] send tweet request : " + tweet;
        httpClient.sendRequest(request);
    }

    public List<String> getTimeline(int tweetsLimit) {
        httpClient.sendRequest("[" + user + "] send get timeline request " + tweetsLimit);
        ArrayList<String> tweets = new ArrayList<>();
        tweets.add("@rbrugier: #Dagger2 is great ! ");
        return tweets;
    }

}
