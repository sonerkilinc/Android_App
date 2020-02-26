package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VelociraptorActivity extends AppCompatActivity {

    private Toolbar actionbarvelociraptor;

    Button Btn43,Btn44,Btn45;

    public void init(){

        actionbarvelociraptor=(Toolbar)findViewById(R.id.actionbarvelociraptor);
        setSupportActionBar(actionbarvelociraptor);
        getSupportActionBar().setTitle("Velociraptor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velociraptor);
        init();

        final MediaPlayer ses15=MediaPlayer.create(this,R.raw.ses15);
        Btn43=(Button)findViewById(R.id.Btn43);
        Btn44=(Button)findViewById(R.id.Btn44);
        Btn45=(Button)findViewById(R.id.Btn45);

        Btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.start();
            }
        });
        Btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.stop();
            }
        });
        Btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses15.pause();
            }
        });
    }
}
