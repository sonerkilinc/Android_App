package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkbrachiosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturkbrachiosaurus;

    Button Bt49,Bt50,Bt51;
    public void init(){

        actionbarturkbrachiosaurus=(Toolbar)findViewById(R.id.actionbarturkbrachiosaurus);
        setSupportActionBar(actionbarturkbrachiosaurus);
        getSupportActionBar().setTitle("Brachiosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkbrachiosaurus);

        init();

        final MediaPlayer ses17=MediaPlayer.create(this,R.raw.ses17);
        Bt49=(Button)findViewById(R.id.Bt49);
        Bt50=(Button)findViewById(R.id.Bt50);
        Bt51=(Button)findViewById(R.id.Bt51);

        Bt49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses17.start();
            }
        });
        Bt50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses17.stop();
            }
        });
        Bt51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses17.pause();
            }
        });
    }
}
