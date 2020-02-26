package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkceratopsiaActivity extends AppCompatActivity {

    private Toolbar actionbarturkceratopsia;
    Button Bt34,Bt35,Bt36;

    public void init(){

        actionbarturkceratopsia=(Toolbar)findViewById(R.id.actionbarturkceratopsia);
        setSupportActionBar(actionbarturkceratopsia);
        getSupportActionBar().setTitle("Ceratopsia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkceratopsia);
        init();

        final MediaPlayer ses5=MediaPlayer.create(this,R.raw.ses5);
        Bt34=(Button)findViewById(R.id.Bt34);
        Bt35=(Button)findViewById(R.id.Bt35);
        Bt36=(Button)findViewById(R.id.Bt36);

        Bt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.start();
            }
        });

        Bt35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.stop();
            }
        });

        Bt36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.pause();
            }
        });
    }
}
