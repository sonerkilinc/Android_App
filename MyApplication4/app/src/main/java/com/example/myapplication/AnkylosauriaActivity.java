package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnkylosauriaActivity extends AppCompatActivity {

    private Toolbar actionbaranky;

    Button Btn34,Btn35,Btn36;

    public void init(){

        actionbaranky=(Toolbar)findViewById(R.id.actionbaranky);
        setSupportActionBar(actionbaranky);
        getSupportActionBar().setTitle("Ankylosauria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankylosauria);
        init();

        final MediaPlayer ses7=MediaPlayer.create(this,R.raw.ses7);

        Btn34=(Button)findViewById(R.id.Btn34);
        Btn35=(Button)findViewById(R.id.Btn35);
        Btn36=(Button)findViewById(R.id.Btn36);

        Btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.start();
            }
        });

        Btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.stop();
            }
        });

        Btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.pause();
            }
        });
    }
}
