package com.abhishekbvp.librarymanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {
    private static int timer = 3000;

    ImageView imageView;
    TextView textView;
    Animation leftAnimation, rightAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        imageView = findViewById(R.id.logo);
        textView = findViewById(R.id.description);

        leftAnimation = AnimationUtils.loadAnimation(this,R.anim.left_animation);
        rightAnimation = AnimationUtils.loadAnimation(this,R.anim.right_animation);

        imageView.setAnimation(leftAnimation);
        textView.setAnimation(rightAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, timer);
    }
}