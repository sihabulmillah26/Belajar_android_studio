package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        Button btnKalkulator = findViewById(R.id.kalkulator);
        Button btnSuhu = findViewById(R.id.Konversi_Suhu);
        Button btnBB = findViewById(R.id.hitung_BB);

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kalkulator = new Intent(MainActivity.this,Kalkulator.class);
                startActivity(kalkulator);
            }
        });

        btnSuhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suhu = new Intent(MainActivity.this,KonversiSuhu.class);
                startActivity(suhu);
            }
        });
        btnBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bB = new Intent(MainActivity.this , HitungBeratBadan.class);
                startActivity(bB);
            }
        });
    }
}