package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Turkish5Activity extends AppCompatActivity {

    private Toolbar actionbarTurkish5;

    Button Bt7,Bt8,Bt9;

    public void init(){

        actionbarTurkish5=(Toolbar)findViewById(R.id.actionbarTurkish5);
        setSupportActionBar(actionbarTurkish5);
        getSupportActionBar().setTitle("Coelophysoidea");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish5);
        init();

        final MediaPlayer ses9=MediaPlayer.create(this,R.raw.ses9);

        Bt7=(Button)findViewById(R.id.Bt7);
        Bt8=(Button)findViewById(R.id.Bt8);
        Bt9=(Button)findViewById(R.id.Bt9);

        Bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.start();
            }
        });
        Bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.stop();
            }
        });

        Bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.pause();
            }
        });
    }
}
