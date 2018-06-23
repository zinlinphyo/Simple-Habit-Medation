package net.zinlinphyo.simplehabitmedation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.data.vo.HomeScreenVO;
import net.zinlinphyo.simplehabitmedation.viewholders.BaseViewHolder;
import net.zinlinphyo.simplehabitmedation.viewholders.TopicViewHolder;

public class TopicAdapter extends BaseRecyclerAdapter<BaseViewHolder, HomeScreenVO> {

    private LayoutInflater mLayoutInflater;

    public TopicAdapter(Context context){
        super(context);
//        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItemView = mLayoutInflater.inflate(R.layout.view_item_topic, parent, false);
        return new TopicViewHolder(categoryItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
