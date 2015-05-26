package net.rafaeltoledo.dagger.ui;

import net.rafaeltoledo.dagger.ui.adapter.PullRequestAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class UiModule {

    @Provides
    PullRequestAdapter providePullRequestAdapter() {
        return new PullRequestAdapter();
    }
}
