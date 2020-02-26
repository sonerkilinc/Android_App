package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class mamenchisaurusActivity extends AppCompatActivity {

    private Toolbar actionbarmamenchi;

    public void init(){

        actionbarmamenchi=(Toolbar)findViewById(R.id.actionbarmamenchi);
        setSupportActionBar(actionbarmamenchi);
        getSupportActionBar().setTitle("Mamenchisaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamenchisaurus);
        init();
    }
}
