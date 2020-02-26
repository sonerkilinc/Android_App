package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English19Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish19;
    Button Btn7,Btn8,Btn9;

    public  void init(){

        actionbarEnglish19=(Toolbar) findViewById(R.id.actionbarEnglish19);
        setSupportActionBar(actionbarEnglish19);
        getSupportActionBar().setTitle("Ornithopoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english19);
        init();

        final MediaPlayer ses3=MediaPlayer.create(this,R.raw.ses3);
        Btn7=(Button)findViewById(R.id.Btn7);
        Btn8=(Button)findViewById(R.id.Btn8);
        Btn9=(Button)findViewById(R.id.Btn9);

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.start();
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.stop();
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.pause();
            }
        });

    }
}
