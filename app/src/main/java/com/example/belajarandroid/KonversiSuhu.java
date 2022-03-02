package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class KonversiSuhu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);
        Spinner spin = findViewById(R.id.spin_1);
        Spinner spin2 = findViewById(R.id.spin_2);
        EditText input = findViewById(R.id.et_1);
        TextView hasil = findViewById(R.id.et_2);
        Button btnKonversi = findViewById(R.id.konversi);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.suhu_nama, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin2.setAdapter(adapter);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long suhu1 = spin.getSelectedItemId();
                Long suhu2 = spin2.getSelectedItemId();
                Float konvers = Float.parseFloat(input.getText().toString());
                if ( suhu1 == suhu2 ){
                    hasil.setText(Float.toString((Float) konvers));
                }else if(suhu1 == 0 && suhu2 == 1){
                    Float total = Float.parseFloat (String.valueOf((konvers-32) /1.8));
                    DecimalFormat df = new DecimalFormat("#.##");
                    hasil.setText(df.format(total));
                }else if(suhu1 == 0 && suhu2 == 2){
                    Float total = Float.parseFloat(String.valueOf((konvers-32)*5/9+273.15));
                    DecimalFormat df = new DecimalFormat("#.##");
                    hasil.setText(df.format(total));
                }else if(suhu1 == 1 && suhu2 == 0){
                    Float total = Float.parseFloat(String.valueOf(konvers * 1.8) + 32);
                    DecimalFormat df = new DecimalFormat("#.##");
                    hasil.setText(df.format(total));
                }else if(suhu1 == 1 && suhu2 == 2){
                    Float total = Float.parseFloat(String.valueOf(konvers+273.15));
                    DecimalFormat df = new DecimalFormat("#.##");
                    hasil.setText(df.format(total));
                }else if(suhu1 == 2 && suhu2 == 0){
                    Float total = Float.parseFloat(String.valueOf((konvers-273.15)*9/5+32));
                    DecimalFormat df = new DecimalFormat("#.##");
                    hasil.setText(df.format(total));
                }else {
                    Float total = Float.parseFloat(String.valueOf(konvers-273.15));
                    DecimalFormat df = new DecimalFormat("#.##");
                    hasil.setText(df.format(total));
                }
            }
        });

    }
}
