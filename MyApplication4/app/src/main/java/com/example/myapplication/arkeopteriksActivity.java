package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class arkeopteriksActivity extends AppCompatActivity {

    private Toolbar actionbararkeop;

    Button Btn70,Btn71,Btn72;

    public void init(){

        actionbararkeop=(Toolbar)findViewById(R.id.actionbararkeop);
        setSupportActionBar(actionbararkeop);
        getSupportActionBar().setTitle("Arkeopteriks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arkeopteriks);
        init();

        final MediaPlayer ses24=MediaPlayer.create(this,R.raw.ses24);
        Btn70=(Button)findViewById(R.id.Btn70);
        Btn71=(Button)findViewById(R.id.Btn71);
        Btn72=(Button)findViewById(R.id.Btn72);

        Btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses24.start();
            }
        });
        Btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses24.stop();
            }
        });

        Btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses24.pause();
            }
        });
    }
}
