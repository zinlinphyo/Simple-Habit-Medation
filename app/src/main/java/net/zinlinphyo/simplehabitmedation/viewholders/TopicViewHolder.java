package net.zinlinphyo.simplehabitmedation.viewholders;

import android.view.View;
import android.widget.TextView;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.TopicVO;

import butterknife.BindView;

public class TopicViewHolder extends BaseViewHolder<TopicVO> {

    @BindView(R.id.tv_topic_name)
    TextView tvCategoryName;

    @BindView(R.id.tv_topic_description)
    TextView tvDescription;

    public TopicViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(TopicVO data) {
        tvCategoryName.setText(data.getTopicName());
        tvDescription.setText(data.getTopicDesc());
    }
}
