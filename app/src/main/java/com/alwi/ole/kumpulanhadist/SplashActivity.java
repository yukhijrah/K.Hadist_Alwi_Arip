package com.alwi.ole.kumpulanhadist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ole on 10/1/18.
 */

public class SplashActivity extends AppCompatActivity {

    private static final int tigaDTK=3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        countDown();
    }

    private void countDown(){
        Handler handler = new Handler();
        Runnable tunggu = new Runnable() {
            @Override
            public void run() {
                gotoMain();
            }
        };
        handler.postDelayed(tunggu, tigaDTK);
    }

    private void gotoMain(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
