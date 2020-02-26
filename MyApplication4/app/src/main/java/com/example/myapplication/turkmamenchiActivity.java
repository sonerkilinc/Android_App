package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class turkmamenchiActivity extends AppCompatActivity {
    private Toolbar actionbarturkmamenchi;

    public void init(){

        actionbarturkmamenchi=(Toolbar)findViewById(R.id.actionbarturkmamenchi);
        setSupportActionBar(actionbarturkmamenchi);
        getSupportActionBar().setTitle("Mamenchisaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkmamenchi);
        init();
    }
}
