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
import java.text.Format;

public class HitungBeratBadan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_berat_badan);

        EditText bB = findViewById(R.id.BB);
        EditText tB = findViewById(R.id.TB);
        Button btnHitung = findViewById(R.id.hitung);
        TextView status = findViewById(R.id.status);
        Spinner jenis = findViewById(R.id.jenis_kelamin);
        TextView hasil1 = findViewById(R.id.hasil);
        TextView keterangan = findViewById(R.id.keterangan);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.jenis, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jenis.setAdapter(adapter);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long kelamin = jenis.getSelectedItemId();
                Float beratBadan = Float.parseFloat(bB.getText().toString());
                Float tinggiBadan = Float.parseFloat(tB.getText().toString());
                Float konvers = tinggiBadan / 100;
                Float hasil = beratBadan/(konvers * konvers);
                DecimalFormat df = new DecimalFormat("#.##");
                hasil1.setText(df.format(hasil));

                if (hasil < 18.5 ){
                    status.setText("Kurus");
                }else if(hasil >= 18.5 && hasil <= 24.9){
                    status.setText("Normal");
                }else if(hasil >= 25.0 && hasil <= 29.9){
                    status.setText("Gemuk");
                }else{
                    status.setText("Obesitas");
                }

                if(kelamin == 0){
                   Float ideal = tinggiBadan - 100;
                   keterangan.setText("Berat Ideal Anda " + Float.toString((Float)ideal)+ " Kg");
                }else{
                    Float ideal = tinggiBadan - 110;
                    keterangan.setText("Berat Ideal Anda " + Float.toString((Float)ideal)+ " Kg");
                }
            }
        });

    }
}