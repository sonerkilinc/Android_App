package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkThecodontosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarTurkthecodontosaurus;

    public void init(){
        actionbarTurkthecodontosaurus=(Toolbar)findViewById(R.id.actionbarTurkthecodontosaurus);
        setSupportActionBar(actionbarTurkthecodontosaurus);
        getSupportActionBar().setTitle("Thecodontosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk_thecodontosaurus);
        init();
    }
}
