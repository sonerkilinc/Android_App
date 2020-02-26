package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class PachycephalosauriaActivity extends AppCompatActivity {

    private Toolbar actionbarpachy;

    Button Btn37,Btn38,Btn39;

    public void init(){

        actionbarpachy=(Toolbar)findViewById(R.id.actionbarpachy);
        setSupportActionBar(actionbarpachy);
        getSupportActionBar().setTitle("Pachycephalosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pachycephalosauria);
        init();

        final MediaPlayer ses11= MediaPlayer.create(this,R.raw.ses11);

        Btn37=(Button)findViewById(R.id.Btn37);
        Btn38=(Button)findViewById(R.id.Btn38);
        Btn39=(Button)findViewById(R.id.Btn39);

        Btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.start();
            }
        });

        Btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.stop();
            }
        });


        Btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses11.pause();
            }
        });

    }
}
