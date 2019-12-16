package com.ilham.mymobile2_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Mahasiswa> mahasiswa;

    void initViews(){
        listView = findViewById(R.id.listView);
        mahasiswa = new ArrayList<>();

        Mahasiswa m1 = new Mahasiswa(R.drawable.christina,"Christina","0000 0000");
        Mahasiswa m2 = new Mahasiswa(R.drawable.clara,"Clara","1111 1111");
        Mahasiswa m3 = new Mahasiswa(R.drawable.dewi,"Dewi Persik","2222 2222");
        Mahasiswa m4 = new Mahasiswa(R.drawable.dirham,"Dirham","3333 3333");
        Mahasiswa m5 = new Mahasiswa(R.drawable.enisulis,"Ensi Sulis","4444 4444");
        Mahasiswa m6 = new Mahasiswa(R.drawable.ensisita,"Ensi Sita","5555 5555");

        mahasiswa.add(m1);
        mahasiswa.add(m2);
        mahasiswa.add(m3);
        mahasiswa.add(m4);
        mahasiswa.add(m5);
        mahasiswa.add(m6);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
}
