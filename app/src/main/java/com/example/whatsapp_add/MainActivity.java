package com.example.whatsapp_add;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int splashscreen=2000;
    //Creating variables for logo and text
    ImageView logo;
    TextView from,fb;
    //Creating variable for animation
    Animation topanimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=findViewById(R.id.Logo);
        from=findViewById(R.id.from);
        fb=findViewById(R.id.fb);

        topanimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);

        logo.setAnimation(topanimation);
        from.setAnimation(topanimation);
        fb.setAnimation(topanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Agree_Continue.class);
                startActivity(intent);
                finish();
            }
        },splashscreen);
    }
}