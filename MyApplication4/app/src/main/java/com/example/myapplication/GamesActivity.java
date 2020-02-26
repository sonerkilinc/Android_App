package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamesActivity extends AppCompatActivity {

    private Toolbar actionbargames;
    private Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18;

    public void init(){
        actionbargames=(Toolbar)findViewById(R.id.actionbargames);
        setSupportActionBar(actionbargames);
        getSupportActionBar().setTitle("Games");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        B1=(Button)findViewById(R.id.B1);
        B2=(Button)findViewById(R.id.B2);
        B3=(Button)findViewById(R.id.B3);
        B4=(Button)findViewById(R.id.B4);
        B5=(Button)findViewById(R.id.B5);
        B6=(Button)findViewById(R.id.B6);
        B7=(Button)findViewById(R.id.B7);
        B8=(Button)findViewById(R.id.B8);
        B9=(Button)findViewById(R.id.B9);
        B10=(Button)findViewById(R.id.B10);
        B11=(Button)findViewById(R.id.B11);
        B12=(Button)findViewById(R.id.B12);
        B13=(Button)findViewById(R.id.B13);
        B14=(Button)findViewById(R.id.B14);
        B15=(Button)findViewById(R.id.B15);
        B16=(Button)findViewById(R.id.B16);
        B17=(Button)findViewById(R.id.B17);
        B18=(Button)findViewById(R.id.B18);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        init();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B1.setBackgroundColor(Color.GREEN);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B2.setBackgroundColor(Color.RED);
                B1.setBackgroundColor(Color.GREEN);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B3.setBackgroundColor(Color.RED);
                B1.setBackgroundColor(Color.GREEN);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B4.setBackgroundColor(Color.RED);
                B6.setBackgroundColor(Color.GREEN);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B5.setBackgroundColor(Color.RED);
                B6.setBackgroundColor(Color.GREEN);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B6.setBackgroundColor(Color.GREEN);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B7.setBackgroundColor(Color.GREEN);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B8.setBackgroundColor(Color.RED);
                B7.setBackgroundColor(Color.GREEN);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B9.setBackgroundColor(Color.RED);
                B7.setBackgroundColor(Color.GREEN);
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B10.setBackgroundColor(Color.RED);
                B11.setBackgroundColor(Color.GREEN);
            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B11.setBackgroundColor(Color.GREEN);
            }
        });
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B12.setBackgroundColor(Color.RED);
                B11.setBackgroundColor(Color.GREEN);
            }
        });
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B13.setBackgroundColor(Color.RED);
                B14.setBackgroundColor(Color.GREEN);
            }
        });
        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B14.setBackgroundColor(Color.GREEN);
            }
        });
        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B15.setBackgroundColor(Color.RED);
                B14.setBackgroundColor(Color.GREEN);
            }
        });
        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B16.setBackgroundColor(Color.GREEN);
            }
        });
        B17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B17.setBackgroundColor(Color.RED);
                B16.setBackgroundColor(Color.GREEN);
            }
        });
        B18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B18.setBackgroundColor(Color.RED);
                B16.setBackgroundColor(Color.GREEN);
            }
        });


    }
}
