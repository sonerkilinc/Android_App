package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkdiplodocusActivity extends AppCompatActivity {
    private Toolbar actionbarturkdiplodocus;

    Button Bt52,Bt53,Bt54;

    public void init(){

        actionbarturkdiplodocus=(Toolbar)findViewById(R.id.actionbarturkdiplodocus);
        setSupportActionBar(actionbarturkdiplodocus);
        getSupportActionBar().setTitle("Diplodocus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkdiplodocus);
        init();

        final MediaPlayer ses18=MediaPlayer.create(this,R.raw.ses18);
        Bt52=(Button)findViewById(R.id.Bt52);
        Bt53=(Button)findViewById(R.id.Bt53);
        Bt54=(Button)findViewById(R.id.Bt54);

        Bt52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses18.start();
            }
        });
        Bt53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses18.stop();
            }
        });
        Bt54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses18.pause();
            }
        });

    }
}
