package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class amargasaurusActivity extends AppCompatActivity {

    private Toolbar actionbaramarga;

    Button Btn94,Btn95,Btn96;

    public void init(){

        actionbaramarga=(Toolbar)findViewById(R.id.actionbaramarga);
        setSupportActionBar(actionbaramarga);
        getSupportActionBar().setTitle("Amargasaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amargasaurus);
        init();

        final MediaPlayer ses33=MediaPlayer.create(this,R.raw.ses33);
        Btn94=(Button)findViewById(R.id.Btn94);
        Btn95=(Button)findViewById(R.id.Btn95);
        Btn96=(Button)findViewById(R.id.Btn96);

        Btn94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses33.start();
            }
        });
        Btn95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses33.stop();
            }
        });
        Btn96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses33.pause();
            }
        });

    }
}
