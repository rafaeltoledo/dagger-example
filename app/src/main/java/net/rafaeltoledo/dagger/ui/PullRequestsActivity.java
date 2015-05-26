package net.rafaeltoledo.dagger.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import net.rafaeltoledo.dagger.ExampleApp;
import net.rafaeltoledo.dagger.data.api.BitBucketApi;
import net.rafaeltoledo.dagger.ui.adapter.PullRequestAdapter;

import javax.inject.Inject;

import rx.android.app.AppObservable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class PullRequestsActivity extends ListActivity implements Action1<Throwable> {

    @Inject
    PullRequestAdapter adapter;
    @Inject
    BitBucketApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ExampleApp.get(this).component().inject(this);

        setListAdapter(adapter);

        AppObservable.bindActivity(this, api.getPullRequests()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        ).subscribe(adapter, this);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }

    @Override
    public void call(Throwable throwable) {
        Toast.makeText(this, throwable.toString(), Toast.LENGTH_SHORT).show();
    }
}
