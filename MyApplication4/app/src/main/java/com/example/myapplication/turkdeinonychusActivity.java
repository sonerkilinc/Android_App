package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkdeinonychusActivity extends AppCompatActivity {

    private Toolbar actionbarturkdeinon;

    Button Bt82,Bt83,Bt84;

    public void init(){

        actionbarturkdeinon=(Toolbar)findViewById(R.id.actionbarturkdeionon);
        setSupportActionBar(actionbarturkdeinon);
        getSupportActionBar().setTitle("Deinonychus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkdeinonychus);
        init();

        final MediaPlayer ses28=MediaPlayer.create(this,R.raw.ses28);
        Bt82=(Button)findViewById(R.id.Bt82);
        Bt83=(Button)findViewById(R.id.Bt83);
        Bt84=(Button)findViewById(R.id.Bt84);

        Bt82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses28.start();
            }
        });
        Bt83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses28.stop();
            }
        });
        Bt84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses28.pause();
            }
        });
    }
}
