package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class brachiosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarbrachiosaurus;

    Button Btn49,Btn50,Btn51;
    public void init(){

        actionbarbrachiosaurus=(Toolbar)findViewById(R.id.actionbarbrachiosaurus);
        setSupportActionBar(actionbarbrachiosaurus);
        getSupportActionBar().setTitle("Brachiosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brachiosaurus);
        init();

        final MediaPlayer ses17=MediaPlayer.create(this,R.raw.ses17);
        Btn49=(Button)findViewById(R.id.Btn49);
        Btn50=(Button)findViewById(R.id.Btn50);
        Btn51=(Button)findViewById(R.id.Btn51);

        Btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses17.start();
            }
        });
        Btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses17.stop();
            }
        });
        Btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses17.pause();
            }
        });
    }
}
