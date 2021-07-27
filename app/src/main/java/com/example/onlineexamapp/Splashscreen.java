package com.example.onlineexamapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class Splashscreen extends AppCompatActivity {
        private static int SPLASH_SCREEN = 5000;
        //variables
        Animation topAnim, bottomAnim;
        ImageView image;
        TextView logo;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_splash);

            if(getSupportActionBar()!=null)  //remove top actionbar
            {
                getSupportActionBar().hide();
            }

            //Animations
            topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
            bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);


            //Hooks
            image = findViewById(R.id.imageView);
            logo = findViewById(R.id.textView);


            image.setAnimation(topAnim);
            logo.setAnimation(bottomAnim);


            new Handler().postDelayed(new Runnable() { //next page
                @Override
                public void run() {
                    Intent intent = new Intent(Splashscreen.this, Register.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_SCREEN);
        }
    }
