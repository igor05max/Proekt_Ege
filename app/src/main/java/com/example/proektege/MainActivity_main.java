package com.example.proektege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);
        ProgressBar pb = findViewById(R.id.pb);
        pb.setProgress(5);
        Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_main.this, MainActivity_main2.class);
                startActivity(intent);
            }
        });
        ImageView button_image_prof_wariant = findViewById(R.id.image_wariant_prof);
        button_image_prof_wariant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity_main.this, MainActivity_prof_wariant.class);
                startActivity(intent2);
            }
        });
        ImageView button_image_prof_task = findViewById(R.id.image_prof_task);
        button_image_prof_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity_main.this, MainActivity_prof_tasks.class);
                startActivity(intent3);
            }
        });
    }
}