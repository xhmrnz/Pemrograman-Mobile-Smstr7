package com.dicoding.iwakuproduct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static String PHOTO;
    TextView nama, remark, stock, condition, size, weight;
    ImageView imgPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_product);

        Intent intent = getIntent();

        nama = findViewById(R.id.item_nama);
        String name = intent.getExtras().getString("name");
        nama.setText(name);

        remark = findViewById(R.id.item_remarks);
        String remarks = intent.getExtras().getString("remark");
        remark.setText(remarks);

        stock = findViewById(R.id.item_stock);
        String stocks = intent.getExtras().getString("stock");
        stock.setText(stocks);

        condition = findViewById(R.id.item_condition);
        String conditions = intent.getExtras().getString("condition");
        condition.setText(conditions);

        size = findViewById(R.id.item_size);
        String sizes = intent.getExtras().getString("size");
        size.setText(sizes);

        weight = findViewById(R.id.item_weight);
        String weights = intent.getExtras().getString("weight");
        weight.setText(weights);

        imgPhoto = (ImageView)findViewById(R.id.item_photo);
        String photo = getIntent().getStringExtra(PHOTO);
        Glide.with(this).load(photo).into(imgPhoto);
    }
}
