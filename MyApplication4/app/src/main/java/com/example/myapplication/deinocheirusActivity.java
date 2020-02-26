package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class deinocheirusActivity extends AppCompatActivity {


    private Toolbar actionbardeinoche;

    public void init(){

        actionbardeinoche=(Toolbar)findViewById(R.id.actionbardeinoche);
        setSupportActionBar(actionbardeinoche);
        getSupportActionBar().setTitle("Deinocheirus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deinocheirus);
        init();


    }
}
