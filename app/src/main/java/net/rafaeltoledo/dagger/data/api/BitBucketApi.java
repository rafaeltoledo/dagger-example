package net.rafaeltoledo.dagger.data.api;

import net.rafaeltoledo.dagger.data.domain.BaseResponse;
import net.rafaeltoledo.dagger.data.domain.PullRequest;

import retrofit.http.GET;
import rx.Observable;

public interface BitBucketApi {

    //@GET("/repositories/{username}/{repository}/pullrequests")
    @GET("/repositories/suporte_concrete/desafio-android/pullrequests")
    Observable<BaseResponse<PullRequest>> getPullRequests();
}
