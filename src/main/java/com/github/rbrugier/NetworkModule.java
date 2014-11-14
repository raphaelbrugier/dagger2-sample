package com.github.rbrugier;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    public  OkHttpClient provideHttpClient() {
        return new OkHttpClient();
    }
}
