package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ornithomimusActivity extends AppCompatActivity {

    private Toolbar actionbarhomimus;

    public void init(){
        actionbarhomimus=(Toolbar)findViewById(R.id.actionbarhomimus);
        setSupportActionBar(actionbarhomimus);
        getSupportActionBar().setTitle("Ornithomimus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ornithomimus);
        init();
    }
}
