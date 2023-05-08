package com.example.proektege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// регистрация
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = findViewById(R.id.est_accaunt);
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // создаем интент для перехода на новую активность
                Intent intent = new Intent(MainActivity.this, MainActivityRes.class);
                startActivity(intent);
            }
        });
        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // здесь описывается действие, которое должно произойти при нажатии на кнопку
                Intent intent = new Intent(MainActivity.this, MainActivityRes.class);
                startActivity(intent);
            }
        });
    }


}