package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dilophosaurusActivity extends AppCompatActivity {
    private Toolbar actionbardilopho;

    Button Btn61,Btn62,Btn63;

    public void init(){

        actionbardilopho=(Toolbar)findViewById(R.id.actionbardilopho);
        setSupportActionBar(actionbardilopho);
        getSupportActionBar().setTitle("Dilophosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilophosaurus);
        init();

        final MediaPlayer ses21=MediaPlayer.create(this,R.raw.ses21);

        Btn61=(Button)findViewById(R.id.Btn61);
        Btn62=(Button)findViewById(R.id.Btn62);
        Btn63=(Button)findViewById(R.id.Btn63);

        Btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses21.start();
            }
        });

        Btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses21.stop();
            }
        });

        Btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses21.pause();
            }
        });
    }

}
