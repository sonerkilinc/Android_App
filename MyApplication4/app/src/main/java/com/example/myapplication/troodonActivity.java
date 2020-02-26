package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class troodonActivity extends AppCompatActivity {

    private Toolbar actionbartro;
    Button Btn76,Btn77,Btn78;
    public void init(){

        actionbartro=(Toolbar)findViewById(R.id.actionbartro);
        setSupportActionBar(actionbartro);
        getSupportActionBar().setTitle("Troodon");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troodon);
        init();

        final MediaPlayer ses26=MediaPlayer.create(this,R.raw.ses26);
        Btn76=(Button)findViewById(R.id.Btn76);
        Btn77=(Button)findViewById(R.id.Btn77);
        Btn78=(Button)findViewById(R.id.Btn78);

        Btn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses26.start();
            }
        });
        Btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses26.stop();
            }
        });
        Btn78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses26.pause();
            }
        });
    }
}
