package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkdeinocheirusActivity extends AppCompatActivity {

    private Toolbar actionbarturkdeinoche;

    public void init(){

        actionbarturkdeinoche=(Toolbar)findViewById(R.id.actionbarturkdeinoche);
        setSupportActionBar(actionbarturkdeinoche);
        getSupportActionBar().setTitle("Deinocheirus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkdeinocheirus);
        init();
    }
}
