package net.zinlinphyo.simplehabitmedation.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

public abstract class BaseViewHolder<W> extends RecyclerView.ViewHolder {

	private W mData;

	public BaseViewHolder(View itemView) {
		super(itemView);
		ButterKnife.bind(this, itemView);
	}

	public abstract void setData(W data);
}
