package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class deinonychusActivity extends AppCompatActivity {

    private Toolbar actionbardeinon;

    Button Btn82,Btn83,Btn84;

    public void init(){

        actionbardeinon=(Toolbar)findViewById(R.id.actionbardeionon);
        setSupportActionBar(actionbardeinon);
        getSupportActionBar().setTitle("Deinonychus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deinonychus);
        init();

        final MediaPlayer ses28=MediaPlayer.create(this,R.raw.ses28);
        Btn82=(Button)findViewById(R.id.Btn82);
        Btn83=(Button)findViewById(R.id.Btn83);
        Btn84=(Button)findViewById(R.id.Btn84);

        Btn82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses28.start();
            }
        });
        Btn83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses28.stop();
            }
        });
        Btn84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses28.pause();
            }
        });
    }
}
