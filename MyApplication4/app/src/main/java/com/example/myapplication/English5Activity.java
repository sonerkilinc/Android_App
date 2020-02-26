package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class English5Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish5;
    Button Btn19,Btn20,Btn21;

    public void init(){

        actionbarEnglish5=(Toolbar)findViewById(R.id.actionbarEnglish5);
        setSupportActionBar(actionbarEnglish5);
        getSupportActionBar().setTitle("Coelophysoidea");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english5);
        init();

        final MediaPlayer ses9=MediaPlayer.create(this,R.raw.ses9);

        Btn19=(Button)findViewById(R.id.Btn19);
        Btn20=(Button)findViewById(R.id.Btn20);
        Btn21=(Button)findViewById(R.id.Btn21);

        Btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.start();
            }
        });

        Btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.stop();
            }
        });

        Btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses9.pause();
            }
        });



    }
}
