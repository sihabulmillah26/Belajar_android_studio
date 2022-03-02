package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        TextView hasil = findViewById(R.id.teks_hasil);
        EditText nilai1 = findViewById(R.id.bil_1);
        EditText nilai2 = findViewById(R.id.bil_2);
        Button btnTambah = findViewById(R.id.tambah);
        Button btnKurang = findViewById(R.id.kurang);
        Button btnBagi = findViewById(R.id.bagi);
        Button btnKali = findViewById(R.id.kali);


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float bilangan1 = Float.parseFloat(nilai1.getText().toString());
                Float bilangan2 = Float.parseFloat(nilai2.getText().toString());

                Float total = bilangan1 + bilangan2;
                hasil.setText(Float.toString((float)total) );

            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float bilangan1 = Float.parseFloat(nilai1.getText().toString());
                Float bilangan2 = Float.parseFloat(nilai2.getText().toString());

                Float total = bilangan1 - bilangan2;
                hasil.setText(Float.toString((float)total) );

            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float bilangan1 = Float.parseFloat(nilai1.getText().toString());
                Float bilangan2 = Float.parseFloat(nilai2.getText().toString());

                Float total = bilangan1 * bilangan2;
                hasil.setText(Float.toString((float)total) );

            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float bilangan1 = Float.parseFloat(nilai1.getText().toString());
                Float bilangan2 = Float.parseFloat(nilai2.getText().toString());

                Float total = bilangan1 / bilangan2;
                hasil.setText(Float.toString((float)total) );

            }
        });


    }
}