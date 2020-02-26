package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class plateosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarplato;

    Button Btn91,Btn92,Btn93;

    public void init(){

        actionbarplato=(Toolbar)findViewById(R.id.actionbarplato);
        setSupportActionBar(actionbarplato);
        getSupportActionBar().setTitle("Plateosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plateosaurus);
        init();

        final MediaPlayer ses31=MediaPlayer.create(this,R.raw.ses31);
        Btn91=(Button)findViewById(R.id.Btn91);
        Btn92=(Button)findViewById(R.id.Btn92);
        Btn93=(Button)findViewById(R.id.Btn93);

        Btn91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses31.start();
            }
        });
        Btn92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses31.stop();
            }
        });
        Btn93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses31.pause();
            }
        });
    }
}
