package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkTetanuActivity extends AppCompatActivity {

    private Toolbar actionbarTurkTetanu;

    public void init(){

        actionbarTurkTetanu=(Toolbar)findViewById(R.id.actionbarTurkTetanu);
        setSupportActionBar(actionbarTurkTetanu);
        getSupportActionBar().setTitle("Tetanurae");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk_tetanu);
        init();
    }
}
