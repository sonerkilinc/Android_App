package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class turknyasasaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturknya;

    public void init(){
        actionbarturknya=(Toolbar)findViewById(R.id.actionbarturknya);
        setSupportActionBar(actionbarturknya);
        getSupportActionBar().setTitle("Nyasasaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turknyasasaurus);
        init();
    }
}
