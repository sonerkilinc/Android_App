package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class apatosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarapato;

    Button Btn73,Btn74,Btn75;

    public void init(){

        actionbarapato=(Toolbar)findViewById(R.id.actionbarapato);
        setSupportActionBar(actionbarapato);
        getSupportActionBar().setTitle("Apatosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apatosaurus);
        init();

        final MediaPlayer ses25=MediaPlayer.create(this,R.raw.ses25);
        Btn73=(Button)findViewById(R.id.Btn73);
        Btn74=(Button)findViewById(R.id.Btn74);
        Btn75=(Button)findViewById(R.id.Btn75);

        Btn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses25.start();
            }
        });
        Btn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses25.stop();
            }
        });
        Btn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses25.pause();
            }
        });

    }
}
