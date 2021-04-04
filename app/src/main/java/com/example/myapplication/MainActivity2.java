package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
MediaPlayer md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name= getIntent().getStringExtra("name").toLowerCase();
        int id=getResources().getIdentifier(name,"drawable",getPackageName());
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(id);
        int mdp=getResources().getIdentifier(name, "raw",getPackageName());
        md=MediaPlayer.create(getApplicationContext(),mdp);
        md.start();
        

    }
}