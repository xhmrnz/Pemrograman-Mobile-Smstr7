package com.ilham.myfoodcatalogue;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ilham.myfoodcatalogue.model.Drink;
import com.ilham.myfoodcatalogue.model.Food;

public class DetailActivity2 extends AppCompatActivity {
    ImageView imgCover;
    TextView txtTitle, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgCover = findViewById(R.id.img_cover);
        txtTitle = findViewById(R.id.tvTitle);
        txtDesc = findViewById(R.id.tvDesc);

        final Drink drink = getIntent().getParcelableExtra("EXTRA_DRINK");
        txtTitle.setText(drink.getName());
        txtDesc.setText(drink.getDesc());

        Glide.with(this)
                .load(drink.getPhoto())
                .apply(new RequestOptions().override(500, 250))
                .into(imgCover);

        Toolbar toolbar = findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsebar);

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.transparent));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }
}
