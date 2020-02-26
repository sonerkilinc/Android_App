package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ThyreophoraActivity extends AppCompatActivity {

    private Toolbar actionbarthyre;

    public void init(){

        actionbarthyre=(Toolbar)findViewById(R.id.actionbarthyre);
        setSupportActionBar(actionbarthyre);
        getSupportActionBar().setTitle("Thyreophora");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thyreophora);
        init();
    }
}
