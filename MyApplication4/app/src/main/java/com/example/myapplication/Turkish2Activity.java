package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Turkish2Activity extends AppCompatActivity {

    private Toolbar actionbarTurkish2;

    public void init(){

        actionbarTurkish2=(Toolbar)findViewById(R.id.actionbarTurkish2);
        setSupportActionBar(actionbarTurkish2);
        getSupportActionBar().setTitle("Saurischia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish2);
        init();


    }
}
