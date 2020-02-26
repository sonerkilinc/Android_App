package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class giganotosaurusActivity extends AppCompatActivity {

    private Toolbar actionbargigano;

    Button Btn58,Btn59,Btn60;

    public void init(){

        actionbargigano=(Toolbar)findViewById(R.id.actionbargigano);
        setSupportActionBar(actionbargigano);
        getSupportActionBar().setTitle("Giganotosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giganotosaurus);
        init();

        final MediaPlayer ses20=MediaPlayer.create(this,R.raw.ses20);

        Btn58=(Button)findViewById(R.id.Btn58);
        Btn59=(Button)findViewById(R.id.Btn59);
        Btn60=(Button)findViewById(R.id.Btn60);

        Btn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses20.start();
            }
        });

        Btn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses20.stop();
            }
        });

        Btn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses20.pause();
            }
        });
    }
}
