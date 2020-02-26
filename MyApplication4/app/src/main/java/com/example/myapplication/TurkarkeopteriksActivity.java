package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkarkeopteriksActivity extends AppCompatActivity {

    private Toolbar actionbarturkarkeop;

    Button Bt70,Bt71,Bt72;

    public void init(){

        actionbarturkarkeop=(Toolbar)findViewById(R.id.actionbarturkarkeop);
        setSupportActionBar(actionbarturkarkeop);
        getSupportActionBar().setTitle("Arkeopteriks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkarkeopteriks);
        init();

        final MediaPlayer ses24=MediaPlayer.create(this,R.raw.ses24);
        Bt70=(Button)findViewById(R.id.Bt70);
        Bt71=(Button)findViewById(R.id.Bt71);
        Bt72=(Button)findViewById(R.id.Bt72);

        Bt70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses24.start();
            }
        });
        Bt71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses24.stop();
            }
        });

        Bt72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses24.pause();
            }
        });
    }
}
