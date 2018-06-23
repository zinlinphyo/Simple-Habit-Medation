package net.zinlinphyo.simplehabitmedation.mvp.presenters;

import net.zinlinphyo.simplehabitmedation.data.models.SimpleHabitModel;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.delegates.CategoryDelegate;
import net.zinlinphyo.simplehabitmedation.delegates.CurrentProgramDelegate;
import net.zinlinphyo.simplehabitmedation.events.DataReadyEvent;
import net.zinlinphyo.simplehabitmedation.mvp.views.SeriesView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SeriesPresenter extends BasePresenter<SeriesView> implements CurrentProgramDelegate,
		CategoryDelegate {
	public SeriesPresenter(SeriesView mView) {
		super(mView);
	}

	@Override
	public void onCreate() {
		super.onCreate();

		SimpleHabitModel.getInstance().startLoadingSimpleHabits();
	}

	@Override
	public void onStart() {
		super.onStart();
		EventBus.getDefault().register(this);
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
		EventBus.getDefault().unregister(this);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onTapCategory(String categoryId, String programId) {
		mView.launchCategoryDetailsScreen(categoryId, programId);
	}

	@Override
	public void onTapCurrentProgram(CurrentProgramVO currentProgramVO) {
		mView.launchCurrentProgramDetailsScreen(currentProgramVO);
	}

	@Subscribe(threadMode = ThreadMode.MAIN)
	public void onDataReadyEvent(DataReadyEvent event){
		if (event.getLoadHomeScreen() != null && event.getLoadHomeScreen().size() > 0){
			mView.displayData(event.getLoadHomeScreen());
		}
	}
}
