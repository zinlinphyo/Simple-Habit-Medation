package net.zinlinphyo.simplehabitmedation.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.SessionVO;

import butterknife.BindView;

public class SessionViewHolder extends BaseViewHolder<SessionVO> {
    @BindView(R.id.tv_no)
    public TextView tvNo;

    @BindView(R.id.tv_session_title)
    TextView tvSessionTitle;

    @BindView(R.id.tv_session_length)
    TextView tvSessionLength;

    public SessionViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(SessionVO data) {
        tvSessionTitle.setText(data.getTitle());
        String min = String.valueOf(Integer.parseInt(data.getLengthInSeconds()) / 60);
        String sec = String.valueOf(Integer.parseInt(data.getLengthInSeconds()) % 60);
        String time = min + ":" + sec;
        tvSessionLength.setText(time);
    }
}
