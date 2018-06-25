package com.example.Funny_letters;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.example.igortaran.R;

public class BaseActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

    }

    @Override
    protected void onStart() {
        super.onStart();
        counter += 1;
    }

    @Override
    protected void onStop() {
        MusicManager.getInstance().stopPlay();
        super.onStop();
        counter -= 1;
        if (counter == 0) {
            MusicManager.getInstance().stopPlay();
        }
    }
}