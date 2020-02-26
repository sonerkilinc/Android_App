package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turksauroposeidonActivity extends AppCompatActivity {

    private Toolbar actionbarturksauroposeidon;

    Button Bt88,Bt89,Bt90;

    public void init(){

        actionbarturksauroposeidon=(Toolbar)findViewById(R.id.actionbarturksauroposeidon);
        setSupportActionBar(actionbarturksauroposeidon);
        getSupportActionBar().setTitle("Sauroposeidon");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turksauroposeidon);
        init();

        final MediaPlayer ses30=MediaPlayer.create(this,R.raw.ses30);
        Bt88=(Button)findViewById(R.id.Bt88);
        Bt89=(Button)findViewById(R.id.Bt89);
        Bt90=(Button)findViewById(R.id.Bt90);

        Bt88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses30.start();
            }
        });
        Bt89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses30.stop();
            }
        });
        Bt90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses30.pause();
            }
        });
    }
}
