package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English4Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish4;
    Button Btn16,Btn17,Btn18;

    public  void init(){

        actionbarEnglish4=(Toolbar) findViewById(R.id.actionbarEnglish4);
        setSupportActionBar(actionbarEnglish4);
        getSupportActionBar().setTitle("Herrerasauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english4);
        init();

        final MediaPlayer ses10=MediaPlayer.create(this,R.raw.ses10);

        Btn16=(Button)findViewById(R.id.Btn16);
        Btn17=(Button)findViewById(R.id.Btn17);
        Btn18=(Button)findViewById(R.id.Btn18);

        Btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.start();
            }
        });

        Btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.stop();
            }
        });

        Btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses10.pause();
            }
        });

    }
}
