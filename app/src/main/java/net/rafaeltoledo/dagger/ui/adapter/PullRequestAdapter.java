package net.rafaeltoledo.dagger.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.rafaeltoledo.dagger.data.domain.BaseResponse;
import net.rafaeltoledo.dagger.data.domain.PullRequest;

import java.util.ArrayList;
import java.util.List;

import rx.functions.Action1;

public class PullRequestAdapter extends BaseAdapter implements Action1<BaseResponse<PullRequest>> {

    private List<PullRequest> items = new ArrayList<>();

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
                    .inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        ((TextView) convertView.findViewById(android.R.id.text1)).setText(
                items.get(position).getAuthor().getDisplayName());

        return convertView;
    }

    @Override
    public void call(BaseResponse<PullRequest> response) {
        this.items.addAll(response.getValues());
        notifyDataSetChanged();
    }
}
