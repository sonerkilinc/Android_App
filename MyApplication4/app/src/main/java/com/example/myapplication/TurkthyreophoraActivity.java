package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkthyreophoraActivity extends AppCompatActivity {

    private Toolbar actionbarturkthyre;

    public void init(){

        actionbarturkthyre=(Toolbar)findViewById(R.id.actionbarturkthyre);
        setSupportActionBar(actionbarturkthyre);
        getSupportActionBar().setTitle("Thyreophora");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkthyreophora);
        init();
    }
}
