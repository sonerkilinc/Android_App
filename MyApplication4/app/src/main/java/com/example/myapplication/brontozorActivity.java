package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class brontozorActivity extends AppCompatActivity {

    private Toolbar actionbarbrontozor;

    public void init(){

        actionbarbrontozor=(Toolbar)findViewById(R.id.actionbarbrontozor);
        setSupportActionBar(actionbarbrontozor);
        getSupportActionBar().setTitle("Brontozor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brontozor);
        init();
    }
}
