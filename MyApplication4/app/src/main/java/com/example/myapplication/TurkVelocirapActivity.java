package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkVelocirapActivity extends AppCompatActivity {

    private Toolbar actionbarturkvelociraptor;

    Button Bt43,Bt44,Bt45;

    public void init(){

        actionbarturkvelociraptor=(Toolbar)findViewById(R.id.actionbarturkvelociraptor);
        setSupportActionBar(actionbarturkvelociraptor);
        getSupportActionBar().setTitle("Velociraptor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk_velocirap);
        init();

        final MediaPlayer ses15=MediaPlayer.create(this,R.raw.ses15);
        Bt43=(Button)findViewById(R.id.Bt43);
        Bt44=(Button)findViewById(R.id.Bt44);
        Bt45=(Button)findViewById(R.id.Bt45);

        Bt43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.start();
            }
        });
        Bt44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.stop();
            }
        });
        Bt45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.pause();
            }
        });
    }
}
