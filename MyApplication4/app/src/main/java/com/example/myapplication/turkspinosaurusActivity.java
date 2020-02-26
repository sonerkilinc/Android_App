package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkspinosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturkspinosaurus;

    Button Bt46,Bt47,Bt48;

    public void init(){
        actionbarturkspinosaurus=(Toolbar)findViewById(R.id.actionbarturkspinosaurus);
        setSupportActionBar(actionbarturkspinosaurus);
        getSupportActionBar().setTitle("Spinosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkspinosaurus);

        init();

        final MediaPlayer ses16=MediaPlayer.create(this,R.raw.ses16);
        Bt46=(Button)findViewById(R.id.Bt46);
        Bt47=(Button)findViewById(R.id.Bt47);
        Bt48=(Button)findViewById(R.id.Bt48);

        Bt46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.start();
            }
        });
        Bt47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.stop();
            }
        });

        Bt48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses16.pause();
            }
        });
    }
}
