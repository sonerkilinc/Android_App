package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RiojasaurusActivity extends AppCompatActivity {

    private Toolbar actionbarRio;

    Button Btn28,Btn29,Btn30;

    public void init(){
        actionbarRio=(Toolbar)findViewById(R.id.actionbarRio);
        setSupportActionBar(actionbarRio);
        getSupportActionBar().setTitle("Riojasaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riojasaurus);
        init();

        final MediaPlayer ses12=MediaPlayer.create(this,R.raw.ses12);
        Btn28=(Button)findViewById(R.id.Btn28);
        Btn29=(Button)findViewById(R.id.Btn29);
        Btn30=(Button)findViewById(R.id.Btn30);

        Btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.start();
            }
        });
        Btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.stop();
            }
        });

        Btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses12.pause();
            }
        });
    }
}
