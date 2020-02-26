package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ThecodontosaurusActivity extends AppCompatActivity {

    private Toolbar actionbarthecodontosaurus;

    public void init(){
        actionbarthecodontosaurus=(Toolbar)findViewById(R.id.actionbarthecodontosaurus);
        setSupportActionBar(actionbarthecodontosaurus);
        getSupportActionBar().setTitle("Thecodontosaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thecodontosaurus);
        init();
    }
}
