package net.rafaeltoledo.dagger;

import net.rafaeltoledo.dagger.data.DataModule;
import net.rafaeltoledo.dagger.ui.PullRequestsActivity;
import net.rafaeltoledo.dagger.ui.UiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ExampleModule.class, DataModule.class, UiModule.class})
public interface ExampleComponent {

    void inject(PullRequestsActivity activity);
}
