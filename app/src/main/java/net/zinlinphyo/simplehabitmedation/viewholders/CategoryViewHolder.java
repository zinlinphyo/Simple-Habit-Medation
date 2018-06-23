package net.zinlinphyo.simplehabitmedation.viewholders;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.activities.DetailActivity;
import net.zinlinphyo.simplehabitmedation.adapters.ProgramAdapter;
import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.delegates.CategoryDelegate;

import butterknife.BindView;

public class CategoryViewHolder extends BaseViewHolder<CategoryVO> implements CategoryDelegate {


	@BindView(R.id.tv_category_title)
	TextView tvTitle;

	private RecyclerView rvTopic;
	private ProgramAdapter mProgramAdapter;
	private View itemView;

	public CategoryViewHolder(View itemView, CategoryDelegate categoryDelegate) {
		super(itemView);
		this.itemView = itemView;
		rvTopic = itemView.findViewById(R.id.rv_programs);
		mProgramAdapter = new ProgramAdapter(itemView.getContext(), categoryDelegate);
		rvTopic.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
		rvTopic.setAdapter(mProgramAdapter);
	}

	@Override
	public void setData(CategoryVO data) {
		mProgramAdapter.setNewData(data.getPrograms());

		tvTitle.setText(data.getTitle());
	}

	@Override
	public void onTapCategory(String categoryId, String programId) {
		Intent detailIntent = new Intent(itemView.getContext(), DetailActivity.class);
		detailIntent.putExtra("vo", "categories");
		detailIntent.putExtra("category_id", categoryId);
		detailIntent.putExtra("program_id", programId);
	}
}
