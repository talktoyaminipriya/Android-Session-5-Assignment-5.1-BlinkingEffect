package com.example.blinkingeffect;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    public TextView text;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageBlinkEffect();

            }
        });
    }

        private void manageBlinkEffect() {

            ObjectAnimator anim = ObjectAnimator.ofInt(text,"backgroundColor",Color.WHITE,Color.GREEN,Color.WHITE);
             anim.setDuration(800);
             anim.setEvaluator(new ArgbEvaluator());
             anim.setRepeatMode(Animation.REVERSE);
             anim.setRepeatCount(Animation.INFINITE);
             anim.start();


        }


}

