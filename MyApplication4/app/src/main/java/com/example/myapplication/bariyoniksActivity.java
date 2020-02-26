package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bariyoniksActivity extends AppCompatActivity {

    private Toolbar actionbarbariyo;

    Button Btn67,Btn68,Btn69;

    public void init(){

        actionbarbariyo=(Toolbar)findViewById(R.id.actionbarbariyo);
        setSupportActionBar(actionbarbariyo);
        getSupportActionBar().setTitle("Bariyoniks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bariyoniks);
        init();

        final MediaPlayer ses23=MediaPlayer.create(this,R.raw.ses23);

        Btn67=(Button)findViewById(R.id.Btn67);
        Btn68=(Button)findViewById(R.id.Btn68);
        Btn69=(Button)findViewById(R.id.Btn69);

        Btn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses23.start();
            }
        });

        Btn68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses23.stop();
            }
        });

        Btn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses23.pause();
            }
        });
    }
}

