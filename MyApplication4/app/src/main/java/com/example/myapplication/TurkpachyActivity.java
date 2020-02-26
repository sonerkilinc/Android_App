package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkpachyActivity extends AppCompatActivity {

    private Toolbar actionbarturkpachy;

    Button Bt31,Bt32,Bt33;

    public void init(){

        actionbarturkpachy=(Toolbar)findViewById(R.id.actionbarturkpachy);
        setSupportActionBar(actionbarturkpachy);
        getSupportActionBar().setTitle("Pachycephalosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkpachy);
        init();

        final MediaPlayer ses11= MediaPlayer.create(this,R.raw.ses11);

        Bt31=(Button)findViewById(R.id.Bt31);
        Bt32=(Button)findViewById(R.id.Bt32);
        Bt33=(Button)findViewById(R.id.Bt33);

        Bt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.start();
            }
        });

        Bt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.stop();
            }
        });


        Bt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.pause();
            }
        });
    }
}
