package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarnotaurusActivity extends AppCompatActivity {

    private Toolbar actionbarcarnotaurus;

    Button Btn55,Btn56,Btn57;

    public void init(){

        actionbarcarnotaurus=(Toolbar)findViewById(R.id.actionbarcarnotaurus);
        setSupportActionBar(actionbarcarnotaurus);
        getSupportActionBar().setTitle("Carnotaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnotaurus);
        init();

        final MediaPlayer ses19=MediaPlayer.create(this,R.raw.ses19);
        Btn55=(Button)findViewById(R.id.Btn55);
        Btn56=(Button)findViewById(R.id.Btn56);
        Btn57=(Button)findViewById(R.id.Btn57);

        Btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses19.start();
            }
        });

        Btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses19.stop();
            }
        });

        Btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses19.pause();
            }
        });
    }
}
