package com.ilham.myfoodcatalogue.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilham.myfoodcatalogue.model.Food;
import com.ilham.myfoodcatalogue.model.FoodData;
import com.ilham.myfoodcatalogue.R;
import com.ilham.myfoodcatalogue.adapter.FoodAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFood extends Fragment {

    RecyclerView recyclerView;
    FoodAdapter foodAdapter;
    ArrayList<Food> foods;
    private View v;

    public FragmentFood() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_food, container, false);

        recyclerView = v.findViewById(R.id.recyclerview);
        foods = new ArrayList<>();
        foodAdapter = new FoodAdapter(getContext(), FoodData.getListData());
        //setActionBarTitle(title);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);
        foods.addAll(FoodData.getListData());
        return v;
    }
}
