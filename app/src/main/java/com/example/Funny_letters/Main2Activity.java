package com.example.Funny_letters;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.igortaran.R;

import java.util.List;
import java.util.Vector;

public class Main2Activity extends AppCompatActivity {

    private boolean isNeedStopMusic = true;
    private ViewPager viewPager;
    private PagerAdapterLet pagerAdapterLet;
    private Button btnLeft, btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lettersview);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        pagerAdapterLet = new PagerAdapterLet(this);
        viewPager.setAdapter(pagerAdapterLet);

        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);

        //letter1 = (ImageView) findViewById(R.id.letter1);
        btnRight = (Button) findViewById(R.id.btnRight);

//        final Animation animScaleTouch = AnimationUtils.loadAnimation(this, R.anim.myalpha);
//            btnRight.setAnimation(animScaleTouch);
//            btnRight.setOnClickListener(new Button.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    view.startAnimation(animScaleTouch);
//                }
//            });

//
//        final Animation animScaleLetter = AnimationUtils.loadAnimation(this, R.anim.mycombo);
//        letter1.setAnimation(animScaleLetter);
//        letter1.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.startAnimation(animScaleLetter);
//                Toast.makeText(getApplicationContext(), "Вы нажали БУКВУ!!!", Toast.LENGTH_SHORT).show();
//            }
//        });
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