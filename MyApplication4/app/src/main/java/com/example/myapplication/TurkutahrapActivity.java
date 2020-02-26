package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkutahrapActivity extends AppCompatActivity {

    private Toolbar actionbarturkutah;

    Button Bt79,Bt80,Bt81;

    public void init(){

        actionbarturkutah=(Toolbar)findViewById(R.id.actionbarturkutah);
        setSupportActionBar(actionbarturkutah);
        getSupportActionBar().setTitle("Utahraptor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkutahrap);
        init();

        final MediaPlayer ses27=MediaPlayer.create(this,R.raw.ses27);
        Bt79=(Button)findViewById(R.id.Bt79);
        Bt80=(Button)findViewById(R.id.Bt80);
        Bt81=(Button)findViewById(R.id.Bt81);

        Bt79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses27.start();
            }
        });

        Bt80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses27.stop();
            }
        });

        Bt81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses27.pause();
            }
        });

    }
}
