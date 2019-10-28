package com.muhyi.myquis_a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabungActivity extends AppCompatActivity {

    TextView tvPi, tvJari, tvTinggi, tvVolume, tvTotal, txtNote;
    EditText edtJari, edtTinggi;
    Button btnHitung, btnKembali;

    final double pi = 3.14285714286;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        tvPi = findViewById(R.id.tv_pi);
        tvJari = findViewById(R.id.tv_jari);
        tvTinggi = findViewById(R.id.tv_tinggi);
        tvVolume = findViewById(R.id.tv_volume);
        tvTotal = findViewById(R.id.tv_total);
        txtNote = findViewById(R.id.note);
        edtJari = findViewById(R.id.edt_jari);
        edtTinggi = findViewById(R.id.edt_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        btnKembali = findViewById(R.id.btn_kembali);

        btnHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (edtJari.length() == 0 && edtTinggi.length() == 0) {
                    txtNote.setText("isi field 'r' dan 'tinggi'!");
                } else if (edtJari.length() == 0) {
                    txtNote.setText("isi field 'r'");
                } else if (edtTinggi.length() == 0) {
                    txtNote.setText("isi field 'tinggi'");
                } else {
                    String jari = edtJari.getText().toString().trim();
                    String tinggi = edtTinggi.getText().toString().trim();

                    double r = Double.parseDouble(jari);
                    double t = Double.parseDouble(tinggi);
                    double volume = (pi * r * r) * t;
                    Math.round(volume);
                    tvTotal.setText("" + volume);
                }

            }
        });
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TabungActivity.this, MainActivity.class);
                TabungActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}