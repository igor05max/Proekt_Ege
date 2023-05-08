package com.example.proektege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity_main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main2);
        ProgressBar pb = findViewById(R.id.pb);
        pb.setProgress(45);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_main2.this, MainActivity_main.class);
                startActivity(intent);
            }
        });

        ImageView button_basa_wariant = findViewById(R.id.image_basa_wariant);
        button_basa_wariant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity_main2.this, MainActivity_basa_wariant.class);
                startActivity(intent2);
            }
        });

        ImageView button_basa_task = findViewById(R.id.image_basa_task);
        button_basa_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity_main2.this, MainActivity_basa_task.class);
                startActivity(intent3);
            }
        });
    }
}