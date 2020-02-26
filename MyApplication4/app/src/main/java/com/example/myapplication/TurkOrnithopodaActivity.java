package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkOrnithopodaActivity extends AppCompatActivity {

    private Toolbar actionbarturkornithopoda;
    Button Bt37,Bt38,Bt39;

    public  void init(){

        actionbarturkornithopoda=(Toolbar) findViewById(R.id.actionbarturkornithopoda);
        setSupportActionBar(actionbarturkornithopoda);
        getSupportActionBar().setTitle("Ornithopoda");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk_ornithopoda);
        init();

        final MediaPlayer ses3=MediaPlayer.create(this,R.raw.ses3);
        Bt37=(Button)findViewById(R.id.Bt37);
        Bt38=(Button)findViewById(R.id.Bt38);
        Bt39=(Button)findViewById(R.id.Bt39);

        Bt37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.start();
            }
        });
        Bt38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.stop();
            }
        });
        Bt39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.pause();
            }
        });
    }
}

