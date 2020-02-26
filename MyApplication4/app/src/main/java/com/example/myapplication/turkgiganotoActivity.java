package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkgiganotoActivity extends AppCompatActivity {

    private Toolbar actionbarturkgigano;

    Button Bt58,Bt59,Bt60;

    public void init(){

        actionbarturkgigano=(Toolbar)findViewById(R.id.actionbarturkgigano);
        setSupportActionBar(actionbarturkgigano);
        getSupportActionBar().setTitle("Giganotosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkgiganoto);

        init();

        final MediaPlayer ses20=MediaPlayer.create(this,R.raw.ses20);

        Bt58=(Button)findViewById(R.id.Bt58);
        Bt59=(Button)findViewById(R.id.Bt59);
        Bt60=(Button)findViewById(R.id.Bt60);

        Bt58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses20.start();
            }
        });

        Bt59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses20.stop();
            }
        });

        Bt60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses20.pause();
            }
        });
    }
}
