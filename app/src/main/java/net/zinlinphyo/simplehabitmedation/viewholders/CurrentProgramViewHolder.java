package net.zinlinphyo.simplehabitmedation.viewholders;

import android.view.View;
import android.widget.TextView;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.CurrentProgramVO;
import net.zinlinphyo.simplehabitmedation.delegates.CurrentProgramDelegate;

import butterknife.BindView;
import butterknife.OnClick;

public class CurrentProgramViewHolder extends BaseViewHolder<CurrentProgramVO> {

    @BindView(R.id.tv_header_title)
    TextView tvHeaderTitle;

    @BindView(R.id.tv_current_program_title)
    TextView tvCurrentSession;

    @BindView(R.id.tv_current_program_duration)
    TextView tvCurrentSessionDuration;

    private CurrentProgramDelegate currentProgramDelegate;

    CurrentProgramVO currentProgramVO;

    public CurrentProgramViewHolder(View itemView, CurrentProgramDelegate currentProgramDelegate) {
        super(itemView);
        this.currentProgramDelegate = currentProgramDelegate;
    }

    @Override
    public void setData(CurrentProgramVO data) {
        this.currentProgramVO = data;
        tvHeaderTitle.setText(data.getTitle());
        tvCurrentSession.setText(data.getSessions().get(0).getTitle());
        tvCurrentSessionDuration.setText(data.getSessions().get(0).getLengthInSeconds().toString() + " seconds");
    }

    @OnClick(R.id.cv_current_program)
    void onClickStart() {
        currentProgramDelegate.onTapCurrentProgram(currentProgramVO);
    }
}
