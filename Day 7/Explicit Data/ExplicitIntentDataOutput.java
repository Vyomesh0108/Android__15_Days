package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntentDataOutput extends AppCompatActivity {
TextView tvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_data_output);

        tvname=findViewById(R.id.tvname);

        Intent intent = getIntent();
        String nm = intent.getStringExtra("NAME");

        tvname.setText("Welcome "+nm);
    }
}