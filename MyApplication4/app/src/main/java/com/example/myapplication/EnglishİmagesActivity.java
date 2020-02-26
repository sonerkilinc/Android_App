package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class EnglishİmagesActivity extends AppCompatActivity {

    private Toolbar actionbarEnglishİmages;

    public void init(){

        actionbarEnglishİmages=(Toolbar)findViewById(R.id.actionbarEnglishİmages);
        setSupportActionBar(actionbarEnglishİmages);
        getSupportActionBar().setTitle("İmages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_images);
        init();
    }
}
