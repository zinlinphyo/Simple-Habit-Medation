package net.zinlinphyo.simplehabitmedation.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import net.zinlinphyo.simplehabitmedation.R;
import net.zinlinphyo.simplehabitmedation.adapters.CategoryAdapter;
import net.zinlinphyo.simplehabitmedation.adapters.SeriesAdapter;
import net.zinlinphyo.simplehabitmedation.adapters.TopicAdapter;

public class SeriesActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        RecyclerView rvSeries = findViewById(R.id.rv_series);
        rvSeries.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        SeriesAdapter seriesAdapter = new SeriesAdapter(getApplicationContext());
        rvSeries.setAdapter(seriesAdapter);

//        RecyclerView rvCategory = findViewById(R.id.rv_category);
//        rvCategory.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
//        CategoryAdapter categoryAdapter = new CategoryAdapter(getApplicationContext());
//        rvCategory.setAdapter(categoryAdapter);

//        ImageView imageView = findViewById(R.id.iv_hero_image);
//        Glide
//                .with(this)
//                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHb-m7cO8jwIgDkUUpMPLzpwwi2GxduxUbPBwXj8tFXUkca_taoQ")
//                .into(imageView);
    }
}
