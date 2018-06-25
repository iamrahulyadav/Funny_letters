package com.example.Funny_letters;

import android.os.Bundle;

import com.example.igortaran.R;

public class Main3Activity extends BaseActivity {

    private boolean isNeedStopMusic = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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