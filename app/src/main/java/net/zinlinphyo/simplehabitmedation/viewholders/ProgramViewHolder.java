package net.zinlinphyo.simplehabitmedation.viewholders;

import android.view.View;
import android.widget.TextView;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;
import net.zinlinphyo.simplehabitmedation.delegates.CategoryDelegate;

import butterknife.BindView;
import butterknife.OnClick;

public class ProgramViewHolder extends BaseViewHolder<ProgramVO> {

	@BindView(R.id.tv_program_name)
	TextView tvTopicName;

	@BindView(R.id.tv_program_duration)
	TextView tvTopicDuration;

	private CategoryDelegate categoryDelegate;
	private ProgramVO programVO;
	private CategoryVO mCategory;

	public ProgramViewHolder(View itemView, CategoryDelegate categoryDelegate) {
		super(itemView);
		this.categoryDelegate = categoryDelegate;
	}

	@Override
	public void setData(ProgramVO data) {
		programVO = data;
		tvTopicName.setText(data.getTitle());
		tvTopicDuration.setText(data.getAverageLengths().get(0).toString() + " min");
	}

	public void setCategoryData(CategoryVO category) {
		mCategory = category;
	}

	@OnClick(R.id.cv_program_image)
	void onClickItem(){
		categoryDelegate.onTapCategory(mCategory.getCategoryId(), programVO.getProgramId());
	}

}
