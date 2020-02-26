package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sauroposeidonActivity extends AppCompatActivity {

    private Toolbar actionbarsauroposeidon;

    Button Btn88,Btn89,Btn90;

    public void init(){

        actionbarsauroposeidon=(Toolbar)findViewById(R.id.actionbarsauroposeidon);
        setSupportActionBar(actionbarsauroposeidon);
        getSupportActionBar().setTitle("Sauroposeidon");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sauroposeidon);
        init();

        final MediaPlayer ses30=MediaPlayer.create(this,R.raw.ses30);
        Btn88=(Button)findViewById(R.id.Btn88);
        Btn89=(Button)findViewById(R.id.Btn89);
        Btn90=(Button)findViewById(R.id.Btn90);

        Btn88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses30.start();
            }
        });
        Btn89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses30.stop();
            }
        });
        Btn90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses30.pause();
            }
        });
    }
}
