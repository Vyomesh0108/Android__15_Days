package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SquareNumber extends AppCompatActivity {
EditText etnum1;
Button btn;
TextView square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_number);

        etnum1=findViewById(R.id.etnum1);
        btn=findViewById(R.id.btn);
        square=findViewById(R.id.square);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1;

                n1=etnum1.getText().toString();

                int num1,sqrt;

                num1=Integer.parseInt(n1);

                if(num1<=10)
                {
                    sqrt = num1 * num1;

                    square.setText("Square of " + num1 + " is " + sqrt);

                    Toast.makeText(SquareNumber.this, "Square of " + num1 + " is " + sqrt, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    square.setText("Please Enter Number Between 1 to 10");

                    Toast.makeText(SquareNumber.this, "Please Enter Number Between 1 to 10", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}