package net.zinlinphyo.simplehabitmedation.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import net.zinlinphyo.simplehabitmedation.R;

public class SeriesViewHolder extends RecyclerView.ViewHolder {

	public RecyclerView rvTopic;
	public SeriesViewHolder(View itemView) {
		super(itemView);
		rvTopic = itemView.findViewById(R.id.rv_topic);
	}
}
