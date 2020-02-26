package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkishİmagesActivity extends AppCompatActivity {

    private Toolbar actionbarTurkishİmages;

    public void init(){

        actionbarTurkishİmages=(Toolbar)findViewById(R.id.actionbarTurkishİmages);
        setSupportActionBar(actionbarTurkishİmages);
        getSupportActionBar().setTitle("Resimler");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish_images);
        init();
    }
}


