package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkcarnotaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturkcarnotaurus;

    Button Bt55,Bt56,Bt57;

    public void init(){

        actionbarturkcarnotaurus=(Toolbar)findViewById(R.id.actionbarturkcarnotaurus);
        setSupportActionBar(actionbarturkcarnotaurus);
        getSupportActionBar().setTitle("Carnotaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkcarnotaurus);

        init();

        final MediaPlayer ses19=MediaPlayer.create(this,R.raw.ses19);
        Bt55=(Button)findViewById(R.id.Bt55);
        Bt56=(Button)findViewById(R.id.Bt56);
        Bt57=(Button)findViewById(R.id.Bt57);

        Bt55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses19.start();
            }
        });

        Bt56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses19.stop();
            }
        });

        Bt57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses19.pause();
            }
        });
    }
}
