package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkstegosauriaActivity extends AppCompatActivity {

    private Toolbar actionbarturkstego;
    Button Bt22,Bt23,Bt24;

    public void init(){

        actionbarturkstego=(Toolbar)findViewById(R.id.actionbarturkstego);
        setSupportActionBar(actionbarturkstego);
        getSupportActionBar().setTitle("Stegosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkstegosauria);
        init();

        final MediaPlayer ses4=MediaPlayer.create(this,R.raw.ses4);
        Bt22=(Button)findViewById(R.id.Bt22);
        Bt23=(Button)findViewById(R.id.Bt23);
        Bt24=(Button)findViewById(R.id.Bt24);

        Bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.start();
            }
        });

        Bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.stop();
            }
        });

        Bt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.pause();
            }
        });
    }
}
