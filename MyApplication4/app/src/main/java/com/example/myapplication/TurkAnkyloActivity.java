package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkAnkyloActivity extends AppCompatActivity {

    private Toolbar actionbarturkanky;

    Button Bt25,Bt26,Bt27;

    public void init(){

        actionbarturkanky=(Toolbar)findViewById(R.id.actionbarturkanky);
        setSupportActionBar(actionbarturkanky);
        getSupportActionBar().setTitle("Ankylosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk_ankylo);
        init();

        final MediaPlayer ses7=MediaPlayer.create(this,R.raw.ses7);

        Bt25=(Button)findViewById(R.id.Bt25);
        Bt26=(Button)findViewById(R.id.Bt26);
        Bt27=(Button)findViewById(R.id.Bt27);

        Bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.start();
            }
        });

        Bt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.stop();
            }
        });

        Bt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.pause();
            }
        });
    }
}
