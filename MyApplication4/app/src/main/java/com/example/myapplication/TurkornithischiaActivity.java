package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TurkornithischiaActivity extends AppCompatActivity {

    private Toolbar actionbarturkornit;

    public void init(){

        actionbarturkornit=(Toolbar)findViewById(R.id.actionbarturkornit);
        setSupportActionBar(actionbarturkornit);
        getSupportActionBar().setTitle("Ornithischia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkornithischia);
        init();
    }
}
