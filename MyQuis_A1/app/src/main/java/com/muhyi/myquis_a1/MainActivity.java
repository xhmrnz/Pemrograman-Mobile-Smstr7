package com.muhyi.myquis_a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rbGroup;
    RadioButton luasSegitiga;
    RadioButton volumeTabung;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbGroup = findViewById(R.id.rb_group);
        luasSegitiga = findViewById(R.id.luas_segitiga);
        volumeTabung = findViewById(R.id.volume_tabung);
        btnNext = findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rbGroup.getCheckedRadioButtonId();

                if (selectedId == luasSegitiga.getId()){
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SegitigaActivity.class );
                    MainActivity.this.startActivity(intent);
                    finish();
                }
                if (selectedId == volumeTabung.getId()){
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, TabungActivity.class );
                    MainActivity.this.startActivity(intent);
                    finish();
                }
            }
        });

    }
}
