package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurktitanozorActivity extends AppCompatActivity {
    private Toolbar actionbarturktita;

    public void init(){
        actionbarturktita=(Toolbar)findViewById(R.id.actionbarturktita);
        setSupportActionBar(actionbarturktita);
        getSupportActionBar().setTitle("Titanozor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turktitanozor);
        init();
    }
}
