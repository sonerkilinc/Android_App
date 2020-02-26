package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turkgalliActivity extends AppCompatActivity {

    private Toolbar actionbarturkgalli;

    Button Bt85,Bt86,Bt87;

    public void init(){

        actionbarturkgalli=(Toolbar)findViewById(R.id.actionbarturkgalli);
        setSupportActionBar(actionbarturkgalli);
        getSupportActionBar().setTitle("Gallimimus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkgalli);
        init();

        final MediaPlayer ses29=MediaPlayer.create(this,R.raw.ses29);
        Bt85=(Button)findViewById(R.id.Bt85);
        Bt86=(Button)findViewById(R.id.Bt86);
        Bt87=(Button)findViewById(R.id.Bt87);

        Bt85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses29.start();
            }
        });
        Bt86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses29.stop();
            }
        });
        Bt87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses29.pause();
            }
        });
    }
}
