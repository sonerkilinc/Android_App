package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class English2Activity extends AppCompatActivity {

    private Toolbar actionbarEnglish2;
    public void init(){

        actionbarEnglish2=(Toolbar)findViewById(R.id.actionbarEnglish2);
        setSupportActionBar(actionbarEnglish2);
        getSupportActionBar().setTitle("Saurischia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english2);
        init();


    }
}
