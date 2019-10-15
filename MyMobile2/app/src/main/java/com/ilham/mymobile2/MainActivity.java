package com.ilham.mymobile2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentAtas fragmentAtas;
    FragmentBawah fragmentBawah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentAtas = new FragmentAtas();
        fragmentBawah = new FragmentBawah();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.FrameAtas,fragmentAtas).commit();
        fragmentManager.beginTransaction().add(R.id.FrameBawah,fragmentBawah).commit();
    }
}
