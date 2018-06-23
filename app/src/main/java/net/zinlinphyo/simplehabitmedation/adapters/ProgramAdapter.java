package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;
import net.zinlinphyo.simplehabitmedation.delegates.CategoryDelegate;
import net.zinlinphyo.simplehabitmedation.viewholders.BaseViewHolder;
import net.zinlinphyo.simplehabitmedation.viewholders.ProgramViewHolder;

public class ProgramAdapter extends BaseRecyclerAdapter<ProgramViewHolder, ProgramVO> {

	private LayoutInflater mLayoutInflator;

	private CategoryDelegate categoryDelegate;

	private CategoryVO mCategory;

	public ProgramAdapter(Context context, CategoryDelegate categoryDelegate) {
		super(context);
		mLayoutInflator = LayoutInflater.from(context);
		this.categoryDelegate = categoryDelegate;
	}

	@NonNull
	@Override
	public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View topicItemView = mLayoutInflator.inflate(R.layout.view_item_program, parent, false);
		return new ProgramViewHolder(topicItemView, categoryDelegate);
	}

	@Override
	public void onBindViewHolder(@NonNull ProgramViewHolder holder, int position) {
		holder.setData(mData.get(position));
		holder.setCategoryData(mCategory);
	}

	@Override
	public int getItemCount() {
		return mData.size();
	}

	public void setCategory(CategoryVO category) {
		mCategory = category;
	}
}
