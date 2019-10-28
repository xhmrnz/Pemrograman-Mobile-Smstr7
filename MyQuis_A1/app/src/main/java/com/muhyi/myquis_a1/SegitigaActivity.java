package com.muhyi.myquis_a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaActivity extends AppCompatActivity {
    TextView tvAlas, tvTinggi, tvHasil, tvTotal;
    EditText edtAlas, edtTinggi;
    Button btnHasil, btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        tvAlas = findViewById(R.id.tv_alas);
        tvTinggi = findViewById(R.id.tv_tinggi);
        tvHasil = findViewById(R.id.tv_hasil);
        tvTotal = findViewById(R.id.tv_total);
        edtAlas = findViewById(R.id.edt_alas);
        edtTinggi = findViewById(R.id.edt_tinggi);
        btnHasil = findViewById(R.id.btn_hasil);
        btnKeluar = findViewById(R.id.btn_keluar);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtAlas.length() == 0 && edtTinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi Tidak Boleh Kosong ", Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext alas kosong
                else if (edtAlas.length() == 0) {
                    Toast.makeText(getApplication(), "Alas Tidak Boleh Kosong ", Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (edtTinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi Tidak Boleh Kosong ", Toast.LENGTH_SHORT).show();
                } else {
                    //ambil nilai dari txtAlas dan txtTinggi
                    String isiAlas = edtAlas.getText().toString();
                    String isiTinggi = edtTinggi.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double pj = Double.parseDouble(isiAlas);
                    double lb = Double.parseDouble(isiTinggi);

                    //panggil method LuasSegitiga
                    double hs = LuasSegitiga(pj, lb);

                    //parsing hasil menjadi string
                    String output = String.valueOf(hs);

                    //set txtHasil dengan output (string hasil parsing)
                    tvTotal.setText(output.toString());

                }
            }
        });
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegitigaActivity.this, MainActivity.class);
                SegitigaActivity.this.startActivity(intent);
                finish();
            }
        });
    }

    public double LuasSegitiga(double p, double l) {
        return p * l;
    }
}





