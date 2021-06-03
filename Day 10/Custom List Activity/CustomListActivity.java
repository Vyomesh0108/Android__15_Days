package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {
ListView lvName;
int[] image={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.horse,R.drawable.linux,R.drawable.bmw_};
String[] name={"This is Deer","This is Dog","This is Elephant","This is Horse","This is Linux","This is BMW"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        lvName=findViewById(R.id.lvName);

        MyAdapter myAdapter = new MyAdapter(image,name,CustomListActivity.this);
        lvName.setAdapter(myAdapter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CustomListActivity.this,ListDataActivity.class);
                intent.putExtra("T1",name[position]);
                intent.putExtra("I1",image[position]);
                startActivity(intent);
            }
        });
    }
}