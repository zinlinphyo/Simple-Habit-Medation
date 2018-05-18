package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.viewholders.TopicViewHolder;

public class TopicAdapter extends RecyclerView.Adapter<TopicViewHolder> {

	private LayoutInflater mLayoutInflator;

	public TopicAdapter(Context context) {
		mLayoutInflator = LayoutInflater.from(context);
	}

	@NonNull
	@Override
	public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View topicItemView = mLayoutInflator.inflate(R.layout.view_item_topic, parent, false);
		return new TopicViewHolder(topicItemView);
	}

	@Override
	public void onBindViewHolder(@NonNull TopicViewHolder holder, int position) {

	}

	@Override
	public int getItemCount() {
		return 10;
	}
}
