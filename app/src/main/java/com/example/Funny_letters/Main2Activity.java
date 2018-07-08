package com.example.Funny_letters;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.igortaran.R;

public class Main2Activity extends AppCompatActivity {
    private boolean isNeedStopMusic = true;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lettersview);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        viewPager = findViewById(R.id.viewpager);

        PagerAdapterLet pagerAdapterLet = new PagerAdapterLet(this);
        viewPager.setAdapter(pagerAdapterLet);
    }

    public void MoveNext(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }

    public void MovePrevious(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        MusicManager.getInstance().startPlay(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isNeedStopMusic) {
            MusicManager.getInstance().stopPlay();
        }
    }

    @Override
    protected void onResume() {
        isNeedStopMusic = true;
        super.onResume();
    }
}