package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
ListView lv1;

String name[]={"Android","Java","PHP","JavaScript","jQuery","HTML","CSS","Ajax","Python",".Net","NodeJs","AngularJs","C","C++"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lv1=findViewById(R.id.lv1);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1,name);

        lv1.setAdapter(arrayAdapter);
        
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "You Select "+name[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}