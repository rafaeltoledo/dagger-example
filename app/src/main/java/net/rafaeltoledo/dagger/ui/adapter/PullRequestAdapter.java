package net.rafaeltoledo.dagger.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import net.rafaeltoledo.dagger.R;
import net.rafaeltoledo.dagger.data.domain.PullRequest;

import java.util.ArrayList;
import java.util.List;

import rx.functions.Action1;

public class PullRequestAdapter extends BaseAdapter implements Action1<List<PullRequest>> {

    private final Picasso picasso;
    private final List<PullRequest> items = new ArrayList<>();

    public PullRequestAdapter(Picasso picasso) {
        this.picasso = picasso;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public PullRequest getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_pull_request, parent, false);
        }

        PullRequest pr = items.get(position);
        ((TextView) convertView.findViewById(android.R.id.text1)).setText(
                pr.getUser().getLogin());
        ((TextView) convertView.findViewById(android.R.id.text2)).setText(
                pr.getTitle());
        picasso.load(pr.getUser().getAvatarUrl()).into((ImageView)
                convertView.findViewById(android.R.id.icon));

        return convertView;
    }

    @Override
    public void call(List<PullRequest> response) {
        this.items.addAll(response);
        notifyDataSetChanged();
    }
}
