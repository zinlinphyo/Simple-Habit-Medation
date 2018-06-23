package net.zinlinphyo.simplehabitmedation.mvp.presenters;

import net.zinlinphyo.simplehabitmedation.mvp.views.BaseView;

public abstract class BasePresenter<T extends BaseView>{

	protected T mView;

	public BasePresenter(T mView) {
		this.mView = mView;
	}

	public void onCreate(){

	}

	public void onStart(){

	}

	public void onPause(){

	}

	public void onResume(){

	}

	public void onStop(){

	}

	public void onDestroy(){

	}

}
