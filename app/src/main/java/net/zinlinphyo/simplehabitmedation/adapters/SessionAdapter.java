package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.SessionVO;
import net.zinlinphyo.simplehabitmedation.viewholders.SessionViewHolder;

public class SessionAdapter extends BaseRecyclerAdapter<SessionViewHolder, SessionVO> {

    public SessionAdapter(Context context) {
        super(context);
    }

    @Override
    public SessionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_session, parent, false);
        return new SessionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SessionViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        String no = (position + 1) + "";
        holder.tvNo.setText(no);
    }
}
