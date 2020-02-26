package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class argentinosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarargentino;

    Button Btn64,Btn65,Btn66;

    public void init(){

        actionbarargentino=(Toolbar)findViewById(R.id.actionbarargentino);
        setSupportActionBar(actionbarargentino);
        getSupportActionBar().setTitle("Argentinosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argentinosaurus);
        init();

        final MediaPlayer ses22=MediaPlayer.create(this,R.raw.ses22);

        Btn64=(Button)findViewById(R.id.Btn64);
        Btn65=(Button)findViewById(R.id.Btn65);
        Btn66=(Button)findViewById(R.id.Btn66);

        Btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses22.start();
            }
        });

        Btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses22.stop();
            }
        });

        Btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses22.pause();
            }
        });
    }
}
