package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkriojasaurusActivity extends AppCompatActivity {

    private Toolbar actionbarTurkRio;

    Button Bt16,Bt17,Bt18;

    public void init(){
        actionbarTurkRio=(Toolbar)findViewById(R.id.actionbarTurkRio);
        setSupportActionBar(actionbarTurkRio);
        getSupportActionBar().setTitle("Riojasaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkriojasaurus);
        init();

        final MediaPlayer ses12=MediaPlayer.create(this,R.raw.ses12);
        Bt16=(Button)findViewById(R.id.Bt16);
        Bt17=(Button)findViewById(R.id.Bt17);
        Bt18=(Button)findViewById(R.id.Bt18);

        Bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.start();
            }
        });
        Bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.stop();
            }
        });

        Bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.pause();
            }
        });
    }
}
