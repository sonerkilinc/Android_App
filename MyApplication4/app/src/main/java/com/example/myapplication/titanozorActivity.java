package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class titanozorActivity extends AppCompatActivity {

    private Toolbar actionbartita;

    public void init(){
        actionbartita=(Toolbar)findViewById(R.id.actionbartita);
        setSupportActionBar(actionbartita);
        getSupportActionBar().setTitle("Titanozor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titanozor);
        init();
    }
}
