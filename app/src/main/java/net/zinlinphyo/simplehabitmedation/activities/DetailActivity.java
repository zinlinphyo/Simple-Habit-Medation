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
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.data.vo.ProgramVO;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.description)
    TextView tvDescription;

    @BindView(R.id.rv_programs)
    RecyclerView rvSession;

    SessionAdapter sessionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sessionAdapter = new SessionAdapter(getApplicationContext());
        rvSession.setAdapter(sessionAdapter);
        rvSession.setLayoutManager(new LinearLayoutManager(this));

        Gson gson = new Gson();
        if (getIntent().getStringExtra("vo").equals("current")) {

            SimpleHabitModel.getInstance().getCurrentProgram();

            CurrentProgramVO currentProgramVO = SimpleHabitModel.getInstance().getCurrentProgram();
            getSupportActionBar().setTitle(currentProgramVO.getTitle());

            tvDescription.setText(currentProgramVO.getDescription());
            sessionAdapter.setNewData(currentProgramVO.getSessions());

        } else if (getIntent().getStringExtra("vo").equals("categories")) {

            String categoryId = getIntent().getStringExtra("category_id");
            String programId = getIntent().getStringExtra("program_id");

            ProgramVO programVO = SimpleHabitModel.getInstance().getCategoryById(categoryId, programId);

            getSupportActionBar().setTitle(programVO.getTitle());
            tvDescription.setText(programVO.getDescription());
            sessionAdapter.setNewData(programVO.getSessions());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail, menu);
        return true;
    }
}
