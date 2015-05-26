package net.rafaeltoledo.dagger.ui;

import com.squareup.picasso.Picasso;

import net.rafaeltoledo.dagger.ui.adapter.PullRequestAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class UiModule {

    @Provides
    PullRequestAdapter providePullRequestAdapter(Picasso picasso) {
        return new PullRequestAdapter(picasso);
    }
}
