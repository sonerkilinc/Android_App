package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurktiranozorActivity extends AppCompatActivity {

    private Toolbar actionbarturktiranozor;

    Button Bt40,Bt41,Bt42;

    public void init(){

        actionbarturktiranozor=(Toolbar)findViewById(R.id.actionbarturktiranozor);
        setSupportActionBar(actionbarturktiranozor);
        getSupportActionBar().setTitle("Tiranozor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turktiranozor);
        init();

        final MediaPlayer ses14=MediaPlayer.create(this,R.raw.ses14);
        Bt40=(Button)findViewById(R.id.Bt40);
        Bt41=(Button)findViewById(R.id.Bt41);
        Bt42=(Button)findViewById(R.id.Bt42);

        Bt40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.start();
            }
        });
        Bt41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.stop();
            }
        });
        Bt42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.pause();
            }
        });
    }
}
