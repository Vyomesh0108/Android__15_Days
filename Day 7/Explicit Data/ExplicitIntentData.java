package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExplicitIntentData extends AppCompatActivity {
EditText etname;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_data);

        etname=findViewById(R.id.etname);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etname.getText().toString();

                Intent intent = new Intent(ExplicitIntentData.this,ExplicitIntentDataOutput.class);
                intent.putExtra("NAME",name);
                startActivity(intent);
            }
        });
    }
}