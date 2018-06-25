package com.example.Funny_letters;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.igortaran.R;

public class MainActivity extends BaseActivity {

    Button play_btn, alphabet_btn, rate_btn;
    private boolean isNeedStopMusic = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        final Animation animScalePlay = AnimationUtils.loadAnimation(this, R.anim.mycombo);
        play_btn.setAnimation(animScalePlay);
        play_btn.setOnClickListener(new Button.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                view.startAnimation(animScalePlay);

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                isNeedStopMusic = false;
                startActivity(intent);
            }
        });

        final Animation animScaleAlphabet = AnimationUtils.loadAnimation(this, R.anim.mycombo);
        alphabet_btn.setAnimation(animScaleAlphabet);
        alphabet_btn.setOnClickListener(new Button.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                view.startAnimation(animScaleAlphabet);

                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                isNeedStopMusic = false;
                startActivity(intent);
            }
        });

        final Animation animScaleRate = AnimationUtils.loadAnimation(this, R.anim.mycombo);
        rate_btn.setAnimation(animScaleRate);
        rate_btn.setOnClickListener(new Button.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                view.startAnimation(animScaleRate);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.example.android"));
                isNeedStopMusic = false;
                startActivity(intent);
            }
        });

    }

    private void initView() {
        play_btn = (Button) findViewById(R.id.play_btn);
        alphabet_btn = (Button) findViewById(R.id.alphabet_btn);
        rate_btn = (Button) findViewById(R.id.rate_btn);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MusicManager.getInstance().stopPlay();
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