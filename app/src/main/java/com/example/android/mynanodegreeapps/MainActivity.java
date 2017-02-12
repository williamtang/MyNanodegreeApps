package com.example.android.mynanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button btn_spotify;
    private static Button btn_scores;
    private static Button btn_library;
    private static Button btn_build;
    private static Button btn_xyz;
    private static Button btn_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_spotify = (Button)findViewById(R.id.btn_spotify);
        btn_scores = (Button)findViewById(R.id.btn_scores);
        btn_library = (Button)findViewById(R.id.btn_library);
        btn_build = (Button)findViewById(R.id.btn_build);
        btn_xyz = (Button)findViewById(R.id.btn_xyz);
        btn_capstone = (Button)findViewById(R.id.btn_capstone);

        // 按钮事件
        btn_spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch spotify streamer",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch scores app",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch library app",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch build app",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch xyz reader",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my own app",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
