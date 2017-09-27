package com.example.hsg.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.i("MY","--onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        
        Log.i("MY","--onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MY","--onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MY","--onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MY","--onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MY","--onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MY","--onDestroy");
    }
}
