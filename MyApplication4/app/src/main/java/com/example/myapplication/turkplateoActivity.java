package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkplateoActivity extends AppCompatActivity {

    private Toolbar actionbarturkplato;

    Button Bt91,Bt92,Bt93;

    public void init(){

        actionbarturkplato=(Toolbar)findViewById(R.id.actionbarturkplato);
        setSupportActionBar(actionbarturkplato);
        getSupportActionBar().setTitle("Plateosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkplateo);
        init();

        final MediaPlayer ses31=MediaPlayer.create(this,R.raw.ses31);
        Bt91=(Button)findViewById(R.id.Bt91);
        Bt92=(Button)findViewById(R.id.Bt92);
        Bt93=(Button)findViewById(R.id.Bt93);

        Bt91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses31.start();
            }
        });
        Bt92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses31.stop();
            }
        });
        Bt93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses31.pause();
            }
        });
    }
}
