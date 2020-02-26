package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CerapodaActivity extends AppCompatActivity {

    private Toolbar actionbarcera;

    Button Btn31,Btn32,Btn33;

    public void init(){

        actionbarcera=(Toolbar)findViewById(R.id.actionbarcera);
        setSupportActionBar(actionbarcera);
        getSupportActionBar().setTitle("Cerapoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerapoda);
        init();

        final MediaPlayer ses8=MediaPlayer.create(this,R.raw.ses8);
        Btn31=(Button)findViewById(R.id.Btn31);
        Btn32=(Button)findViewById(R.id.Btn32);
        Btn33=(Button)findViewById(R.id.Btn33);

        Btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.start();
            }
        });
        Btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.stop();
            }
        });
        Btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.pause();
            }
        });
    }
}
