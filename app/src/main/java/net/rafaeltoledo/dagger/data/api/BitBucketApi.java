package net.rafaeltoledo.dagger.data.api;

import net.rafaeltoledo.dagger.data.domain.PullRequest;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;

public interface BitBucketApi {

    //@GET("/repos/{username}/{repository}/pulls")
    @GET("/repos/rails/rails/pulls")
    Observable<List<PullRequest>> getPullRequests();
}
