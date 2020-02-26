package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TiranozorActivity extends AppCompatActivity {

    private Toolbar actionbartiranozor;

    Button Btn40,Btn41,Btn42;

    public void init(){

        actionbartiranozor=(Toolbar)findViewById(R.id.actionbartiranozor);
        setSupportActionBar(actionbartiranozor);
        getSupportActionBar().setTitle("Tiranozor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiranozor);
        init();

        final MediaPlayer ses14=MediaPlayer.create(this,R.raw.ses14);
        Btn40=(Button)findViewById(R.id.Btn40);
        Btn41=(Button)findViewById(R.id.Btn41);
        Btn42=(Button)findViewById(R.id.Btn42);

        Btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.start();
            }
        });
        Btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.stop();
            }
        });
        Btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses14.pause();
            }
        });
    }
}
