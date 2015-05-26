package net.rafaeltoledo.dagger;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

public class ExampleApp extends Application {

    private ExampleComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            // e.g. Fabric.with(this, new Crashlytics());
            // then Timber.plant(new CrashlyticsTree());
        }

        setupComponent();
    }

    private void setupComponent() {
        component = DaggerExampleComponent.builder()
                .exampleModule(new ExampleModule(this))
                .build();
    }

    public ExampleComponent component() {
        return component;
    }

    public static ExampleApp get(Context context) {
        return (ExampleApp) context.getApplicationContext();
    }
}
