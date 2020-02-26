package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class OrnithischiaActivity extends AppCompatActivity {

    private Toolbar actionbarornit;

    public void init(){

        actionbarornit=(Toolbar)findViewById(R.id.actionbarornit);
        setSupportActionBar(actionbarornit);
        getSupportActionBar().setTitle("Ornithischia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ornithischia);
        init();
    }
}
