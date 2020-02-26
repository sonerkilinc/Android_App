package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class turkornithomimusActivity extends AppCompatActivity {

    private Toolbar actionbarturkhomimus;

    public void init(){
        actionbarturkhomimus=(Toolbar)findViewById(R.id.actionbarturkhomimus);
        setSupportActionBar(actionbarturkhomimus);
        getSupportActionBar().setTitle("Ornithomimus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkornithomimus);
        init();
    }
}
