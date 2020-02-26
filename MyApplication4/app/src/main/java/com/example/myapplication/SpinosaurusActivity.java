package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpinosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarspinosaurus;

    Button Btn46,Btn47,Btn48;

    public void init(){
        actionbarspinosaurus=(Toolbar)findViewById(R.id.actionbarspinosaurus);
        setSupportActionBar(actionbarspinosaurus);
        getSupportActionBar().setTitle("Spinosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinosaurus);
        init();

        final MediaPlayer ses16=MediaPlayer.create(this,R.raw.ses16);
        Btn46=(Button)findViewById(R.id.Btn46);
        Btn47=(Button)findViewById(R.id.Btn47);
        Btn48=(Button)findViewById(R.id.Btn48);

        Btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.start();
            }
        });
        Btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.stop();
            }
        });

        Btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.pause();
            }
        });
    }
}
