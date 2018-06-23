package net.zinlinphyo.simplehabitmedation.mvp.presenters;

import net.zinlinphyo.simplehabitmedation.data.models.SimpleHabitModel;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;
import net.zinlinphyo.simplehabitmedation.mvp.views.DetailsView;

public class DetailsPresenter extends BasePresenter<DetailsView> {

	public DetailsPresenter(DetailsView mView) {
		super(mView);
	}

	public void GetCurrentProgram(){
		CurrentProgramVO currentProgramVO = SimpleHabitModel.getInstance().getCurrentProgram();
		mView.displayCurrentProgramData(currentProgramVO);
	}

	public void GetCategoryData(String categoryId, String programId){
		ProgramVO programVO = SimpleHabitModel.getInstance().getCategoryById(categoryId, programId);
		mView.displayCategoryData(programVO);
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}
}
