package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Turkish3Activity extends AppCompatActivity {

    private Toolbar actionbarTurkish3;
    Button Bt1,Bt2,Bt3;

    public void init(){

        actionbarTurkish3=(Toolbar)findViewById(R.id.actionbarTurkish3);
        setSupportActionBar(actionbarTurkish3);
        getSupportActionBar().setTitle("Theropoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish3);
        init();

        final MediaPlayer ses1=MediaPlayer.create(this,R.raw.ses1);
        Bt1=(Button)findViewById(R.id.Bt1);
        Bt2=(Button)findViewById(R.id.Bt2);
        Bt3=(Button)findViewById(R.id.Bt3);

        Bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.start();
            }
        });
        Bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.stop();
            }
        });

        Bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses1.pause();
            }
        });
    }
}
