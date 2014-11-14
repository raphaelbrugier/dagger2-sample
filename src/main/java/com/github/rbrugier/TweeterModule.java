package com.github.rbrugier;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class TweeterModule {

    private final String user;

    public TweeterModule(String user) {
        this.user = user;
    }

    @Provides
    public String getUser() {
        return user;
    }

    @Provides
    @Singleton
    public Tweeter provideTweeter(TwitterApi twitterApi) {
        return new Tweeter(twitterApi);
    }

    @Provides
    @Singleton
    public Timeline provideTimeline(TwitterApi twitterApi) {
        return new Timeline(twitterApi);
    }
}
