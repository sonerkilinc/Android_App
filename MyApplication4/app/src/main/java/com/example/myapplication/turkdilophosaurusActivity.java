package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkdilophosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturkdilopho;

    Button Bt61,Bt62,Bt63;

    public void init(){

        actionbarturkdilopho=(Toolbar)findViewById(R.id.actionbarturkdilopho);
        setSupportActionBar(actionbarturkdilopho);
        getSupportActionBar().setTitle("Dilophosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkdilophosaurus);
        init();

        final MediaPlayer ses21=MediaPlayer.create(this,R.raw.ses21);

        Bt61=(Button)findViewById(R.id.Bt61);
        Bt62=(Button)findViewById(R.id.Bt62);
        Bt63=(Button)findViewById(R.id.Bt63);

        Bt61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses21.start();
            }
        });

        Bt62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses21.stop();
            }
        });

        Bt63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses21.pause();
            }
        });
    }
}
