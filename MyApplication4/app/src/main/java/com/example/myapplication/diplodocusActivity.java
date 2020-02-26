package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diplodocusActivity extends AppCompatActivity {

    private Toolbar actionbardiplodocus;

    Button Btn52,Btn53,Btn54;

    public void init(){

        actionbardiplodocus=(Toolbar)findViewById(R.id.actionbardiplodocus);
        setSupportActionBar(actionbardiplodocus);
        getSupportActionBar().setTitle("Diplodocus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diplodocus);
        init();

        final MediaPlayer ses18=MediaPlayer.create(this,R.raw.ses18);
        Btn52=(Button)findViewById(R.id.Btn52);
        Btn53=(Button)findViewById(R.id.Btn53);
        Btn54=(Button)findViewById(R.id.Btn54);

        Btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses18.start();
            }
        });
        Btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses18.stop();
            }
        });
        Btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses18.pause();
            }
        });
    }
}
