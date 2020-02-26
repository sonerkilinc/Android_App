package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkbariyoniksActivity extends AppCompatActivity {

    private Toolbar actionbarturkbariyo;

    Button Bt67,Bt68,Bt69;

    public void init(){

        actionbarturkbariyo=(Toolbar)findViewById(R.id.actionbarturkbariyo);
        setSupportActionBar(actionbarturkbariyo);
        getSupportActionBar().setTitle("Bariyoniks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkbariyoniks);
        init();

        final MediaPlayer ses23=MediaPlayer.create(this,R.raw.ses23);

        Bt67=(Button)findViewById(R.id.Bt67);
        Bt68=(Button)findViewById(R.id.Bt68);
        Bt69=(Button)findViewById(R.id.Bt69);

        Bt67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses23.start();
            }
        });

        Bt68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses23.stop();
            }
        });

        Bt69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses23.pause();
            }
        });
    }
}
