package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SauropodomorphaActivity extends AppCompatActivity {

    private Toolbar actionbarSauropodomorpha;

    Button Btn25,Btn26,Btn27;

    public void init(){

        actionbarSauropodomorpha=(Toolbar) findViewById(R.id.actionbarSauropodomorpha);
        setSupportActionBar(actionbarSauropodomorpha);
        getSupportActionBar().setTitle("Sauropodomorpha");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sauropodomorpha);
        init();

        final MediaPlayer ses13=MediaPlayer.create(this,R.raw.ses13);

        Btn25=(Button)findViewById(R.id.Btn25);
        Btn26=(Button)findViewById(R.id.Btn26);
        Btn27=(Button)findViewById(R.id.Btn27);

        Btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.start();
            }
        });

        Btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.stop();
            }
        });

        Btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses13.pause();
            }
        });
    }
}
