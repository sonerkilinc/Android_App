package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkamargasaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturkamarga;

    Button Bt94,Bt95,Bt96;

    public void init(){

        actionbarturkamarga=(Toolbar)findViewById(R.id.actionbarturkamarga);
        setSupportActionBar(actionbarturkamarga);
        getSupportActionBar().setTitle("Amargasaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkamargasaurus);
        init();

        final MediaPlayer ses33=MediaPlayer.create(this,R.raw.ses33);
        Bt94=(Button)findViewById(R.id.Bt94);
        Bt95=(Button)findViewById(R.id.Bt95);
        Bt96=(Button)findViewById(R.id.Bt96);

        Bt94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses33.start();
            }
        });
        Bt95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses33.stop();
            }
        });
        Bt96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses33.pause();
            }
        });
    }
}
