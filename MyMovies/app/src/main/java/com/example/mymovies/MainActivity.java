package com.example.mymovies;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] dataName;
    private String[] dataDescription;
    private String[] dataDuration;
    private String[] dataDirector;
    private String[] dataGenre;
    private String[] dataYear;
    private TypedArray dataPhoto;
    private MovieAdapter adapter;
    private ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MovieAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_MOVIE, movies.get(i)); //perhatikan inisial get(i) !
                startActivity(intent);

                //Toast.makeText(MainActivity.this, movies.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //method menyiapkan data dari Strings.xml
    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        dataDuration = getResources().getStringArray(R.array.data_duration);
        dataDirector = getResources().getStringArray(R.array.data_director);
        dataGenre = getResources().getStringArray(R.array.data_genre);
        dataYear = getResources().getStringArray(R.array.data_year);
    }

    //lalu menambahkannya menjadi arraylist movies
    private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Movie movie = new Movie();
            movie.setPhoto(dataPhoto.getResourceId(i, -1));
            movie.setName(dataName[i]);
            movie.setDescription(dataDescription[i]);
            movie.setDuration(dataDuration[i]);
            movie.setDirector(dataDirector[i]);
            movie.setGenre(dataGenre[i]);
            movie.setYear(dataYear[i]);
            movies.add(movie);
        }
        adapter.setMovies(movies);
    }

}
