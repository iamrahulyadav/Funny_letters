package com.example.Funny_letters;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.igortaran.R;

public class Main2Activity extends MusicActivity {

    Button touch_btn;
    ImageView letter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        letter1 = (ImageView) findViewById(R.id.letter1);
        touch_btn = (Button) findViewById(R.id.touch_btn);


        final Animation animScaleTouch = AnimationUtils.loadAnimation(this, R.anim.myalpha);
        touch_btn.setAnimation(animScaleTouch);
        touch_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animScaleTouch);
            }
        });

        final Animation animScaleLetter = AnimationUtils.loadAnimation(this, R.anim.mycombo);
        letter1.setAnimation(animScaleLetter);
        letter1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animScaleLetter);
                Toast.makeText(getApplicationContext(), "Вы нажали БУКВУ!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

//    public void onClickLetter(View view) {
//        Toast.makeText(getApplicationContext(), "Вы нажали БУКВУ!!!", Toast.LENGTH_SHORT).show();
//    }
}