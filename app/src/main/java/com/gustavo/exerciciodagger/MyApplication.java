package com.gustavo.exerciciodagger;

import android.app.Application;

import com.gustavo.exerciciodagger.component.DaggerGitHubApiComponent;
import com.gustavo.exerciciodagger.component.GitHubApiComponent;
import com.gustavo.exerciciodagger.module.AppModule;
import com.gustavo.exerciciodagger.module.GitHubApiClientModule;

public class MyApplication extends Application {

    private GitHubApiComponent mGitHubApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mGitHubApiComponent = DaggerGitHubApiComponent.builder()
                .appModule(new AppModule(this))
                .gitHubApiClientModule(new GitHubApiClientModule("https://api.github.com/"))
                .build();
    }

    public GitHubApiComponent getComponent() {
        return mGitHubApiComponent;
    }
}