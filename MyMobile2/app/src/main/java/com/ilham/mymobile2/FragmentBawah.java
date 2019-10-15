package com.ilham.mymobile2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentBawah extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;


    public FragmentBawah() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bawah, container, false);

        listView = view.findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1);
        adapter.add("Google");
        adapter.add("Yahoo");
        adapter.add("Facebook");
        adapter.add("Twitter");
        adapter.add("Amazon");
        listView.setAdapter(adapter);

        return view;

    }

}
