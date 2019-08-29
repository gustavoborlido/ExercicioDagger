package com.gustavo.exerciciodagger.component;

import com.gustavo.exerciciodagger.activity.MainActivity;
import com.gustavo.exerciciodagger.module.AppModule;
import com.gustavo.exerciciodagger.module.GitHubApiClientModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {GitHubApiClientModule.class, AppModule.class})
public interface GitHubApiComponent {

    void inject(MainActivity mainActivity);
}
