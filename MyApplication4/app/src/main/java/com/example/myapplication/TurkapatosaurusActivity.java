package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkapatosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturkapato;

    Button Bt73,Bt74,Bt75;

    public void init(){

        actionbarturkapato=(Toolbar)findViewById(R.id.actionbarturkapato);
        setSupportActionBar(actionbarturkapato);
        getSupportActionBar().setTitle("Apatosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkapatosaurus);
        init();

        final MediaPlayer ses25=MediaPlayer.create(this,R.raw.ses25);
        Bt73=(Button)findViewById(R.id.Bt73);
        Bt74=(Button)findViewById(R.id.Bt74);
        Bt75=(Button)findViewById(R.id.Bt75);

        Bt73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses25.start();
            }
        });
        Bt74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses25.stop();
            }
        });
        Bt75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses25.pause();
            }
        });
    }
}
