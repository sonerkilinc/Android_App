package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class turknigersaurusActivity extends AppCompatActivity {

    private Toolbar actionbarturknigo;

    public void init(){

        actionbarturknigo=(Toolbar)findViewById(R.id.actionbarturknigo);
        setSupportActionBar(actionbarturknigo);
        getSupportActionBar().setTitle("Nigersaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turknigersaurus);
        init();
    }
}
