package com.ilham.mymobile2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.WebPage));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentAtas fragmentAtas = new FragmentAtas();
                Bundle bundle = new Bundle();
                bundle.putString("WebLinks", listView.getItemAtPosition(position).toString());
                fragmentAtas.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.FrameAtas,fragmentAtas).commit();
            }
        });
        return view;
    }
}
