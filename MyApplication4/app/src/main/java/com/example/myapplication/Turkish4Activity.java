package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Turkish4Activity extends AppCompatActivity {

    private Toolbar actionbarTurkish4;

    Button Bt4,Bt5,Bt6;

    public void init(){

        actionbarTurkish4=(Toolbar)findViewById(R.id.actionbarTurkish4);
        setSupportActionBar(actionbarTurkish4);
        getSupportActionBar().setTitle("Herrerasauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish4);
        init();

        final MediaPlayer ses10=MediaPlayer.create(this,R.raw.ses10);
        Bt4=(Button)findViewById(R.id.Bt4);
        Bt5=(Button)findViewById(R.id.Bt5);
        Bt6=(Button)findViewById(R.id.Bt6);

        Bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.start();
            }
        });
        Bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.stop();
            }
        });
        Bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.pause();
            }
        });

    }
}
