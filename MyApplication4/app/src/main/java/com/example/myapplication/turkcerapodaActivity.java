package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkcerapodaActivity extends AppCompatActivity {

    private Toolbar actionbarturkcera;

    Button Bt28,Bt29,Bt30;

    public void init(){

        actionbarturkcera=(Toolbar)findViewById(R.id.actionbarturkcera);
        setSupportActionBar(actionbarturkcera);
        getSupportActionBar().setTitle("Cerapoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkcerapoda);
        init();

        final MediaPlayer ses8=MediaPlayer.create(this,R.raw.ses8);
        Bt28=(Button)findViewById(R.id.Bt28);
        Bt29=(Button)findViewById(R.id.Bt29);
        Bt30=(Button)findViewById(R.id.Bt30);

        Bt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.start();
            }
        });
        Bt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.stop();
            }
        });
        Bt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses8.pause();
            }
        });
    }
}
