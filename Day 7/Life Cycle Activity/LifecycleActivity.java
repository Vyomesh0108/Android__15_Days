package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        Log.d("Tag","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag","onDestory");
    }
}