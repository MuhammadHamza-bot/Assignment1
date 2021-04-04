package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.alphabets);
        ArrayList <String> alp=new ArrayList<String>();
        char var='A';
        for (int i = 0; i <26 ; i++,var++) {
            alp.add(Character.toString(var));
            ArrayAdapter <String> obj=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alp);
            listView.setAdapter(obj);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name",alp.get(position));
                    startActivity(intent);
                }
            });
        }
    }
}