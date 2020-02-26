package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class nyasasaurusActivity extends AppCompatActivity {

    private Toolbar actionbarnya;

    public void init(){
        actionbarnya=(Toolbar)findViewById(R.id.actionbarnya);
        setSupportActionBar(actionbarnya);
        getSupportActionBar().setTitle("Nyasasaurus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyasasaurus);
        init();
    }
}
