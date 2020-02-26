package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turksauropodaActivity extends AppCompatActivity {

    private Toolbar actionbarturksauropoda;
    Button Bt19,Bt20,Bt21;

    public void init(){

        actionbarturksauropoda=(Toolbar) findViewById(R.id.actionbarturksauropoda);
        setSupportActionBar(actionbarturksauropoda);
        getSupportActionBar().setTitle("Sauropoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turksauropoda);
        init();

        final MediaPlayer ses2=MediaPlayer.create(this,R.raw.ses2);
        Bt19=(Button)findViewById(R.id.Bt19);
        Bt20=(Button)findViewById(R.id.Bt20);
        Bt21=(Button)findViewById(R.id.Bt21);

        Bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.start();
            }
        });

        Bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.stop();
            }
        });

        Bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.pause();
            }
        });
    }
}
