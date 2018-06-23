package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.HomeScreenVO;
import net.zinlinphyo.simplehabitmedation.data.vo.TopicVO;
import net.zinlinphyo.simplehabitmedation.delegates.CategoryDelegate;
import net.zinlinphyo.simplehabitmedation.delegates.CurrentProgramDelegate;
import net.zinlinphyo.simplehabitmedation.viewholders.BaseViewHolder;
import net.zinlinphyo.simplehabitmedation.viewholders.CategoryViewHolder;
import net.zinlinphyo.simplehabitmedation.viewholders.TopicViewHolder;
import net.zinlinphyo.simplehabitmedation.viewholders.CurrentProgramViewHolder;

public class SeriesAdapter extends BaseRecyclerAdapter<BaseViewHolder, HomeScreenVO>{

	private final static int HEADER_VIEW = 0;
	private final static int SERIES_VIEW = 1;
	private final static int CATEGORY_VIEW = 2;

	private CurrentProgramDelegate currentProgramDelegate;
	private CategoryDelegate categoryDelegate;

	public SeriesAdapter(Context context, CurrentProgramDelegate currentProgramDelegate, CategoryDelegate categoryDelegate){
		super(context);
		if (currentProgramDelegate != null)
			this.currentProgramDelegate = currentProgramDelegate;

		if (categoryDelegate != null)
			this.categoryDelegate = categoryDelegate;
	}

	@NonNull
	@Override
	public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		if(viewType == HEADER_VIEW) {
			View view = mLayoutInflater.inflate(R.layout.view_item_current_program, parent, false);
			return new CurrentProgramViewHolder(view, currentProgramDelegate);
		} else if (viewType == SERIES_VIEW){
			View view = mLayoutInflater.inflate(R.layout.view_item_category, parent, false);
			return new CategoryViewHolder(view, categoryDelegate);
		} else if (viewType == CATEGORY_VIEW){
			View view = mLayoutInflater.inflate(R.layout.view_item_topic, parent, false);
			return new TopicViewHolder(view);
		}else {
			View view = mLayoutInflater.inflate(R.layout.view_item_topic, parent, false);
			return new TopicViewHolder(view);
		}
	}

	@Override
	public int getItemViewType(int position){
		if (mData.get(position) instanceof CurrentProgramVO){
			return HEADER_VIEW;
		}else if (mData.get(position) instanceof CategoryVO){
			return SERIES_VIEW;
		}else if (mData.get(position) instanceof TopicVO){
			return CATEGORY_VIEW;
		}else {
			return 0;
		}
	}
}
