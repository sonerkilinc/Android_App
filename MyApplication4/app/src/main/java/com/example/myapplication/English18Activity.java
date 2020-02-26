package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English18Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish18;
    Button Btn13,Btn14,Btn15;

    public void init(){

        actionbarEnglish18=(Toolbar)findViewById(R.id.actionbarEnglish18);
        setSupportActionBar(actionbarEnglish18);
        getSupportActionBar().setTitle("Ceratopsia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english18);
        init();


        final MediaPlayer ses5=MediaPlayer.create(this,R.raw.ses5);
        Btn13=(Button)findViewById(R.id.Btn13);
        Btn14=(Button)findViewById(R.id.Btn14);
        Btn15=(Button)findViewById(R.id.Btn15);

        Btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.start();
            }
        });

        Btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.stop();
            }
        });

        Btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.pause();
            }
        });


    }
}
