package net.zinlinphyo.simplehabitmedation.mvp.presenters;

import net.zinlinphyo.simplehabitmedation.mvp.views.DetailsView;

public abstract class DetailsPresenter extends BasePresenter<DetailsView> {

	public DetailsPresenter(DetailsView mView) {
		super(mView);
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
