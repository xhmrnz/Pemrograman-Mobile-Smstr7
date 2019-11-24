package com.ilham.myfoodcatalogue.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ilham.myfoodcatalogue.R;
import com.ilham.myfoodcatalogue.adapter.DrinkAdapter;
import com.ilham.myfoodcatalogue.model.Drink;
import com.ilham.myfoodcatalogue.model.DrinkData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDrink extends Fragment {

    RecyclerView recyclerView;
    DrinkAdapter drinkAdapter;
    ArrayList<Drink> drinks;
    private View v;


    public FragmentDrink() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_drink, container, false);

        recyclerView = v.findViewById(R.id.recyclerview);
        drinks = new ArrayList<>();
        drinkAdapter = new DrinkAdapter(getContext(), DrinkData.getListData());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(drinkAdapter);
        drinks.addAll(DrinkData.getListData());
        return v;
    }

}
