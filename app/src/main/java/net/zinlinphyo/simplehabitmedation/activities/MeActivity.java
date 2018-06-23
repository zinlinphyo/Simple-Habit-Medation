package net.zinlinphyo.simplehabitmedation.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import net.zinlinphyo.simplehabitmedation.R;

import butterknife.ButterKnife;

public class MeActivity extends BaseActivity {
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_me);
		ButterKnife.bind(this);
	}
}
