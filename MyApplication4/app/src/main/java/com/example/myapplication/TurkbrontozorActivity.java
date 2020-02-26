package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkbrontozorActivity extends AppCompatActivity {

    private Toolbar actionbarturkbrontozor;

    public void init(){

        actionbarturkbrontozor=(Toolbar)findViewById(R.id.actionbarturkbrontozor);
        setSupportActionBar(actionbarturkbrontozor);
        getSupportActionBar().setTitle("Brontozor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkbrontozor);
        init();
    }
}
