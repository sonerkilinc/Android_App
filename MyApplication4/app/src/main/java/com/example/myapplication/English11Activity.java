package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English11Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish11;
    Button Btn4,Btn5,Btn6;

    public void init(){

        actionbarEnglish11=(Toolbar) findViewById(R.id.actionbarEnglish11);
        setSupportActionBar(actionbarEnglish11);
        getSupportActionBar().setTitle("Sauropoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english11);
        init();

        final MediaPlayer ses2=MediaPlayer.create(this,R.raw.ses2);
        Btn4=(Button)findViewById(R.id.Btn4);
        Btn5=(Button)findViewById(R.id.Btn5);
        Btn6=(Button)findViewById(R.id.Btn6);

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.start();
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.stop();
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.pause();
            }
        });
    }
}
