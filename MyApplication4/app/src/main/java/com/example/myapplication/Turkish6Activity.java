package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Turkish6Activity extends AppCompatActivity {

    private Toolbar actionbarTurkish6;

    Button Bt10,Bt11,Bt12;

    public void init(){

        actionbarTurkish6=(Toolbar)findViewById(R.id.actionbarTurkish6);
        setSupportActionBar(actionbarTurkish6);
        getSupportActionBar().setTitle("Ceratosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish6);
        init();

        final MediaPlayer ses6=MediaPlayer.create(this,R.raw.ses6);
        Bt10=(Button)findViewById(R.id.Bt10);
        Bt11=(Button)findViewById(R.id.Bt11);
        Bt12=(Button)findViewById(R.id.Bt12);

        Bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.start();
            }
        });
        Bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.stop();
            }
        });

        Bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.pause();
            }
        });
    }
}
