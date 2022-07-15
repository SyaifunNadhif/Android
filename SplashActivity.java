package com.example.mytokoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    Animation topAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //untuk menghilangkan bar
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        TextView textView = findViewById(R.id.text_splash);
        ImageView imageView = findViewById(R.id.logo);
        textView.animate().translationX(1000).setDuration(1000).setStartDelay(3000);
//        imageView.animate().translationX(1000).setDuration(1000).setStartDelay(2500);
        imageView.animate().translationY(1000).setDuration(1000).setStartDelay(3500);

        Thread thread = new Thread(){
            public void run() {
                try{
                    Thread.sleep(4000);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

        };

        thread.start();


    }
}