package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TetanuActivity extends AppCompatActivity {

    private Toolbar actionbarTetanu;

    public void init(){

        actionbarTetanu=(Toolbar)findViewById(R.id.actionbarTetanu);
        setSupportActionBar(actionbarTetanu);
        getSupportActionBar().setTitle("Tetanurae");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tetanu);
        init();
    }
}
