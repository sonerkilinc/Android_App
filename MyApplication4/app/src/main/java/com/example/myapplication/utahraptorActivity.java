package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class utahraptorActivity extends AppCompatActivity {

    private Toolbar actionbarutah;

    Button Btn79,Btn80,Btn81;

    public void init(){

        actionbarutah=(Toolbar)findViewById(R.id.actionbarutah);
        setSupportActionBar(actionbarutah);
        getSupportActionBar().setTitle("Utahraptor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utahraptor);
        init();

        final MediaPlayer ses27=MediaPlayer.create(this,R.raw.ses27);
        Btn79=(Button)findViewById(R.id.Btn79);
        Btn80=(Button)findViewById(R.id.Btn80);
        Btn81=(Button)findViewById(R.id.Btn81);

        Btn79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses27.start();
            }
        });

        Btn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses27.stop();
            }
        });

        Btn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses27.pause();
            }
        });
    }
}
