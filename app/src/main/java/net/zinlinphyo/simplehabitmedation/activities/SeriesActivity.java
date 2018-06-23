package net.zinlinphyo.simplehabitmedation.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.adapters.SeriesAdapter;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.HomeScreenVO;
import net.zinlinphyo.simplehabitmedation.mvp.presenters.SeriesPresenter;
import net.zinlinphyo.simplehabitmedation.mvp.views.SeriesView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SeriesActivity extends BaseActivity implements SeriesView {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView navigationView;

    RecyclerView rvSeries;
    SeriesAdapter mSeriesAdapter;

    private SeriesPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        ButterKnife.bind(this);

        mPresenter = new SeriesPresenter(this);
        mPresenter.onCreate();

        rvSeries = findViewById(R.id.rv_series);
        rvSeries.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        mSeriesAdapter = new SeriesAdapter(getApplicationContext(), mPresenter, mPresenter);
        rvSeries.setAdapter(mSeriesAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onStop();
    }

    @Override
    public void displayErrorMsg(String errorMsg) {

    }

    @Override
    public void displayData(List<HomeScreenVO> data) {
        mSeriesAdapter.setNewData(data);
    }

    @Override
    public void launchCurrentProgramDetailsScreen(CurrentProgramVO data) {
        Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
        detailIntent.putExtra("vo", "current");
        startActivity(detailIntent);
    }

    @Override
    public void launchCategoryDetailsScreen(String categoryId, String programId) {
        Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
        detailIntent.putExtra("vo", "category");
        detailIntent.putExtra("category_id", categoryId);
        detailIntent.putExtra("program_id", programId);
        startActivity(detailIntent);
    }

}
