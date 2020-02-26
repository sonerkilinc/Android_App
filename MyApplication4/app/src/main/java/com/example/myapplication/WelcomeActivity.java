package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnWelcomeEnglish,btnWelcomeTurkish;

    public void init(){
        btnWelcomeEnglish=(Button) findViewById(R.id.btnWelcomeEnglish);
        btnWelcomeTurkish=(Button) findViewById(R.id.btnWelcomeTurkish);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnWelcomeEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEnglish=new Intent(WelcomeActivity.this,EnglishActivity.class);
                startActivity(intentEnglish);
            }
        });

        btnWelcomeTurkish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTurkish=new Intent(WelcomeActivity.this,TurkishActivity.class);
                startActivity(intentTurkish);
            }
        });
    }
}


