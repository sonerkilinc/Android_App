package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkeoraptorActivity extends AppCompatActivity {

    private Toolbar actionbarturkeo;

    Button Bt97,Bt98,Bt99;

    public void init(){

        actionbarturkeo=(Toolbar)findViewById(R.id.actionbarturkeo);
        setSupportActionBar(actionbarturkeo);
        getSupportActionBar().setTitle("Eoraptor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkeoraptor);
        init();

        final MediaPlayer ses34=MediaPlayer.create(this,R.raw.ses34);
        Bt97=(Button)findViewById(R.id.Bt97);
        Bt98=(Button)findViewById(R.id.Bt98);
        Bt99=(Button)findViewById(R.id.Bt99);

        Bt97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses34.start();
            }
        });
        Bt98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses34.stop();
            }
        });
        Bt99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses34.pause();
            }
        });
    }
}
