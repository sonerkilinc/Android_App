package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkSauropodomorphaActivity extends AppCompatActivity {

    private Toolbar actionbarTurkSauropodomorpha;

    Button Bt13,Bt14,Bt15;

    public void init(){

        actionbarTurkSauropodomorpha=(Toolbar) findViewById(R.id.actionbarTurkSauropodomorpha);
        setSupportActionBar(actionbarTurkSauropodomorpha);
        getSupportActionBar().setTitle("Sauropodomorpha");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk_sauropodomorpha);
        init();

        final MediaPlayer ses13=MediaPlayer.create(this,R.raw.ses13);

        Bt13=(Button)findViewById(R.id.Bt13);
        Bt14=(Button)findViewById(R.id.Bt14);
        Bt15=(Button)findViewById(R.id.Bt15);

        Bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.start();
            }
        });

        Bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.stop();
            }
        });

        Bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.pause();
            }
        });
    }
}
