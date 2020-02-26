package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class nigersaurusActivity extends AppCompatActivity {

    private Toolbar actionbarnigo;

    public void init(){

        actionbarnigo=(Toolbar)findViewById(R.id.actionbarnigo);
        setSupportActionBar(actionbarnigo);
        getSupportActionBar().setTitle("Nigersaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nigersaurus);
        init();
    }
}
