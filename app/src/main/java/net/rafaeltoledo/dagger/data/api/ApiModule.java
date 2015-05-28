package net.rafaeltoledo.dagger.data.api;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

@Module
public class ApiModule {

    @Provides
    @Singleton
    Endpoint provideEndpoint() {
        return Endpoints.newFixedEndpoint("https://api.github.com/");
    }

    @Provides
    @Singleton
    RestAdapter provideRestAdapter(Endpoint endpoint, OkHttpClient client, Gson gson) {
        return new RestAdapter.Builder()
                .setConverter(new GsonConverter(gson))
                .setClient(new OkClient(client))
                .setEndpoint(endpoint)
                .build();
    }

    @Provides
    @Singleton
    BitBucketApi provideBitBucketApi(RestAdapter adapter) {
        return adapter.create(BitBucketApi.class);
    }
}
