package net.zinlinphyo.simplehabitmedation.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import com.google.gson.Gson;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.adapters.SessionAdapter;
import net.zinlinphyo.simplehabitmedation.data.models.SimpleHabitModel;
import net.zinlinphyo.simplehabitmedation.data.vo.CategoryVO;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;
import net.zinlinphyo.simplehabitmedation.mvp.presenters.DetailsPresenter;
import net.zinlinphyo.simplehabitmedation.mvp.views.DetailsView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity implements DetailsView{

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.description)
    TextView tvDescription;

    @BindView(R.id.rv_programs)
    RecyclerView rvSession;

    SessionAdapter sessionAdapter;

    private DetailsPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mPresenter = new DetailsPresenter(this);

        sessionAdapter = new SessionAdapter(getApplicationContext());
        rvSession.setAdapter(sessionAdapter);
        rvSession.setLayoutManager(new LinearLayoutManager(this));

        if (getIntent().getStringExtra("vo").equals("current")) {

            mPresenter.GetCurrentProgram();

        } else
            if (getIntent().getStringExtra("vo").equals("category")) {

            String categoryId = getIntent().getStringExtra("category_id");
            String programId = getIntent().getStringExtra("program_id");

            mPresenter.GetCategoryData(categoryId, programId);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail, menu);
        return true;
    }

    @Override
    public void displayErrorMsg(String errorMsg) {

    }

    @Override
    public void displayCurrentProgramData(CurrentProgramVO data) {
        getSupportActionBar().setTitle(data.getTitle());

        tvDescription.setText(data.getDescription());
        sessionAdapter.setNewData(data.getSessions());
    }

    @Override
    public void displayCategoryData(ProgramVO data) {
        getSupportActionBar().setTitle(data.getTitle());
        tvDescription.setText(data.getDescription());
        sessionAdapter.setNewData(data.getSessions());
    }
}
