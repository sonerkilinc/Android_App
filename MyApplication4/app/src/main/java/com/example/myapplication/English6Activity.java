package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class English6Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish6;
    Button Btn22,Btn23,Btn24;

    public void init(){

        actionbarEnglish6=(Toolbar)findViewById(R.id.actionbarEnglish6);
        setSupportActionBar(actionbarEnglish6);
        getSupportActionBar().setTitle("Ceratosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english6);
        init();

        final MediaPlayer ses6=MediaPlayer.create(this,R.raw.ses6);

        Btn22=(Button)findViewById(R.id.Btn22);
        Btn23=(Button)findViewById(R.id.Btn23);
        Btn24=(Button)findViewById(R.id.Btn24);

        Btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.start();
            }
        });

        Btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.stop();
            }
        });

        Btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.pause();
            }
        });


    }
}
