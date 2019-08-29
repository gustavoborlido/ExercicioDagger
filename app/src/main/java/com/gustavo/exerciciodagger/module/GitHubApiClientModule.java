package com.gustavo.exerciciodagger.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class GitHubApiClientModule {

    public final String BASE_URL;

    public GitHubApiClientModule(String url) {
        this.BASE_URL = url;
    }

    @Provides
    @Singleton
    Retrofit getClient() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

}
