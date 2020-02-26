package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkargentinoActivity extends AppCompatActivity {

    private Toolbar actionbarturkargentino;

    Button Bt64,Bt65,Bt66;

    public void init(){

        actionbarturkargentino=(Toolbar)findViewById(R.id.actionbarturkargentino);
        setSupportActionBar(actionbarturkargentino);
        getSupportActionBar().setTitle("Argentinosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkargentino);

        init();

        final MediaPlayer ses22=MediaPlayer.create(this,R.raw.ses22);

        Bt64=(Button)findViewById(R.id.Bt64);
        Bt65=(Button)findViewById(R.id.Bt65);
        Bt66=(Button)findViewById(R.id.Bt66);

        Bt64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses22.start();
            }
        });

        Bt65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses22.stop();
            }
        });

        Bt66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses22.pause();
            }
        });
    }
}
