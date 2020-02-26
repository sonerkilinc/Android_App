package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English14Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish14;
    Button Btn10,Btn11,Btn12;

    public void init(){

        actionbarEnglish14=(Toolbar)findViewById(R.id.actionbarEnglish14);
        setSupportActionBar(actionbarEnglish14);
        getSupportActionBar().setTitle("Stegosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english14);
        init();

        final MediaPlayer ses4=MediaPlayer.create(this,R.raw.ses4);
        Btn10=(Button)findViewById(R.id.Btn10);
        Btn11=(Button)findViewById(R.id.Btn11);
        Btn12=(Button)findViewById(R.id.Btn12);

        Btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.start();
            }
        });

        Btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.stop();
            }
        });

        Btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.pause();
            }
        });
    }
}
