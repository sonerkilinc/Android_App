package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gallimimusActivity extends AppCompatActivity {

    private Toolbar actionbargalli;

    Button Btn85,Btn86,Btn87;

    public void init(){

        actionbargalli=(Toolbar)findViewById(R.id.actionbargalli);
        setSupportActionBar(actionbargalli);
        getSupportActionBar().setTitle("Gallimimus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallimimus);
        init();

        final MediaPlayer ses29=MediaPlayer.create(this,R.raw.ses29);
        Btn85=(Button)findViewById(R.id.Btn85);
        Btn86=(Button)findViewById(R.id.Btn86);
        Btn87=(Button)findViewById(R.id.Btn87);

        Btn85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses29.start();
            }
        });
        Btn86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses29.stop();
            }
        });
        Btn87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses29.pause();
            }
        });
    }
}
