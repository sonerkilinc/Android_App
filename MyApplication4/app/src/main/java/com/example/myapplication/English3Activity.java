package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class English3Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish3;
    Button Btn1,Btn2,Btn3;

    public void init(){

        actionbarEnglish3=(Toolbar) findViewById(R.id.actionbarEnglish3);
        setSupportActionBar(actionbarEnglish3);
        getSupportActionBar().setTitle("Theropoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english3);
        init();

        final MediaPlayer ses1=MediaPlayer.create(this,R.raw.ses1);
        Btn1=(Button)findViewById(R.id.Btn1);
        Btn2=(Button)findViewById(R.id.Btn2);
        Btn3=(Button)findViewById(R.id.Btn3);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.start();
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.stop();
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.pause();
            }
        });
    }
}
