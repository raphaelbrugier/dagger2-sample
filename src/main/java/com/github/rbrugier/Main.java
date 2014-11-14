package com.github.rbrugier;

public class Main {

    public static void main(String[] args) {
        ApplicationComponent appComponent = Dagger_ApplicationComponent.builder()
                .tweeterModule(new TweeterModule("rbrugier"))
                .build();

        Tweeter tweeter = appComponent.getTweeter();
        tweeter.tweet("Hello");
        appComponent.getTimeline().getTimeline(10).stream().forEach(System.out::println);
    }
}
