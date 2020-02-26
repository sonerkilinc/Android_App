package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turktroodonActivity extends AppCompatActivity {

    private Toolbar actionbarturktro;
    Button Bt76,Bt77,Bt78;
    public void init(){

        actionbarturktro=(Toolbar)findViewById(R.id.actionbarturktro);
        setSupportActionBar(actionbarturktro);
        getSupportActionBar().setTitle("Troodon");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turktroodon);

        init();

        final MediaPlayer ses26=MediaPlayer.create(this,R.raw.ses26);
        Bt76=(Button)findViewById(R.id.Bt76);
        Bt77=(Button)findViewById(R.id.Bt77);
        Bt78=(Button)findViewById(R.id.Bt78);

        Bt76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses26.start();
            }
        });
        Bt77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses26.stop();
            }
        });
        Bt78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses26.pause();
            }
        });
    }
}
