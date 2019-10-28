package com.example.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //membuat string key untuk mendapatkan intent
    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Movie movies = intent.getParcelableExtra(EXTRA_MOVIE); //string key yang berisi parcelable

        //jika variable "movies" tidak sama dengan kosong maka...
        if(movies!=null){
            //sesuaikan dengan objek di layout
            TextView nama = findViewById(R.id.item_nama);
            nama.setText(movies.getName());//ciri khas parcelable

            TextView duration = findViewById(R.id.item_duration);
            duration.setText(movies.getDuration());

            ImageView image = findViewById(R.id.item_photo);
            image.setImageResource(movies.getPhoto());

            TextView syn = findViewById(R.id.item_synopsis);
            syn.setText(movies.getDescription());

            TextView genre = findViewById(R.id.item_genre);
            genre.setText(movies.getGenre());

            TextView direct = findViewById(R.id.item_director);
            direct.setText(movies.getDirector());

            TextView year = findViewById(R.id.item_year);
            year.setText(movies.getYear());
        }
    }
}
