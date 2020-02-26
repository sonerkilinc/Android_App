package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eoraptorActivity extends AppCompatActivity {


    private Toolbar actionbareo;

    Button Btn97,Btn98,Btn99;

    public void init(){

        actionbareo=(Toolbar)findViewById(R.id.actionbareo);
        setSupportActionBar(actionbareo);
        getSupportActionBar().setTitle("Eoraptor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eoraptor);
        init();

        final MediaPlayer ses34=MediaPlayer.create(this,R.raw.ses34);
        Btn97=(Button)findViewById(R.id.Btn97);
        Btn98=(Button)findViewById(R.id.Btn98);
        Btn99=(Button)findViewById(R.id.Btn99);

        Btn97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses34.start();
            }
        });
        Btn98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses34.stop();
            }
        });
        Btn99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses34.pause();
            }
        });
    }
}
