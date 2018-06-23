package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.viewholders.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class BaseRecyclerAdapter<T extends BaseViewHolder, W> extends RecyclerView.Adapter<T> {

	protected List<W> mData;
	protected LayoutInflater mLayoutInflater;

	public BaseRecyclerAdapter(Context context){
		this.mData = new ArrayList<>();
		this.mLayoutInflater = LayoutInflater.from(context);
	}

	@NonNull
	@Override
	public T onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return null;
	}

	@Override
	public void onBindViewHolder(@NonNull T holder, int position) {
		holder.setData(mData.get(position));
	}

	@Override
	public int getItemCount() {
		return mData.size();
	}

	public void setNewData(List<W> newData) {
		mData = newData;
		notifyDataSetChanged();
	}
}
