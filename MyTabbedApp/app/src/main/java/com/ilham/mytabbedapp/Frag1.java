package com.ilham.mytabbedapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Frag1 extends Fragment {

    RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();
    private String title = "Mode CardView";
    final String STATE_TITLE = "state_string";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.frag1_layout, container, false);
        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerMovie();
    }

    private void showSelectedMovie(Movie movie){
        Toast.makeText(this, "Kamu Memilih " + movie.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerMovie(){
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(this);
        listMovieAdapter.setListMovie(list);
        rvMovie.setAdapter(listMovieAdapter);

        ItemClickSupport.addTo(rvMovie).setOnItemClickListener(new ItemClickSupport.OnItemClickListener(){
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v){
                showSelectedMovie(list.get(position));
            }
        });

    }
}
