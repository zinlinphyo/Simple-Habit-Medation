package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.viewholders.SeriesViewHolder;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesViewHolder>{

	private LayoutInflater mLayoutInflater;
	private Context mContex;

	public SeriesAdapter(Context context){
		mLayoutInflater = LayoutInflater.from(context);
		mContex = context;
	}

	@NonNull
	@Override
	public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View seriesItemView = mLayoutInflater.inflate(R.layout.view_item_series, parent, false);
		return new SeriesViewHolder(seriesItemView);
	}

	@Override
	public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
		holder.rvTopic.setLayoutManager(new LinearLayoutManager(mContex, LinearLayoutManager.HORIZONTAL, false));
		TopicAdapter topicAdapter = new TopicAdapter(mContex);
		holder.rvTopic.setAdapter(topicAdapter);
	}

	@Override
	public int getItemCount() {
		return 7;
	}
}
