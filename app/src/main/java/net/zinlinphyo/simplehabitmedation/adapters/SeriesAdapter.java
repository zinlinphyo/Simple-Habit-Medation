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

public class SeriesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

	private final static int HEADER_VIEW = 0;
	private final static int SERIES_VIEW = 1;
	private final static int CATEGORY_VIEW = 2;

	private int layoutRes;

	private LayoutInflater mLayoutInflater;
	private Context mContex;

	public SeriesAdapter(Context context){
		mLayoutInflater = LayoutInflater.from(context);
		mContex = context;
	}

	@NonNull
	@Override
	public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		layoutRes = 0;
		switch (viewType){
			case HEADER_VIEW: layoutRes = R.layout.view_item_header; break;
			case SERIES_VIEW: layoutRes = R.layout.view_item_series; break;
			case CATEGORY_VIEW: layoutRes = R.layout.view_item_category; break;
		}
		View view = mLayoutInflater.inflate(layoutRes, parent, false);

//		View seriesItemView = mLayoutInflater.inflate(R.layout.view_item_series, parent, false);
		return new SeriesViewHolder(view);
	}

	@Override
	public int getItemViewType(int position){
		if ((position > 2) && (position % 3 == 0)){
			position = 1;
		}
		switch (position){
			case 0: return HEADER_VIEW;
			case 1: return SERIES_VIEW;
			case 2: return CATEGORY_VIEW;
			default: return CATEGORY_VIEW;
		}
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		int viewType = getItemViewType(position);

		SeriesViewHolder seriesViewHolder;
		if (holder.getItemViewType() == 1){
			seriesViewHolder = (SeriesViewHolder) holder;
			seriesViewHolder.rvTopic.setLayoutManager(new LinearLayoutManager(mContex, LinearLayoutManager.HORIZONTAL, false));
			TopicAdapter topicAdapter = new TopicAdapter(mContex);
			seriesViewHolder.rvTopic.setAdapter(topicAdapter);
		}
	}

//	@Override
//	public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
//		holder.rvTopic.setLayoutManager(new LinearLayoutManager(mContex, LinearLayoutManager.HORIZONTAL, false));
//		TopicAdapter topicAdapter = new TopicAdapter(mContex);
//		holder.rvTopic.setAdapter(topicAdapter);
//	}

	@Override
	public int getItemCount() {
		return 10;
	}
}
