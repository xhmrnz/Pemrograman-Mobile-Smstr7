package com.ilham.myfoodcatalogue.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ilham.myfoodcatalogue.DetailActivity;
import com.ilham.myfoodcatalogue.DetailActivity2;
import com.ilham.myfoodcatalogue.R;
import com.ilham.myfoodcatalogue.model.Drink;

import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.viewHolder> {

    Context context;
    ArrayList<Drink> drinks;

    public DrinkAdapter(Context context, ArrayList<Drink> drinks) {
        this.context = context;
        this.drinks = drinks;
    }

    @NonNull
    @Override
    public DrinkAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        final DrinkAdapter.viewHolder viewHolder = new DrinkAdapter.viewHolder(view);
        viewHolder.cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity2.class);
                intent.putExtra("EXTRA_DRINK", drinks.get(viewHolder.getAdapterPosition()));
                context.startActivity(intent);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkAdapter.viewHolder holder, int i) {
        holder.title.setText(drinks.get(i).getName());
        holder.desc.setText("Rp." + drinks.get(i).getHarga());

        Glide.with(context)
                .load(drinks.get(i).getPhoto())
                .apply(new RequestOptions().override(500, 250))
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return drinks.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView title,desc;
        ImageView img;
        CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.card_title);
            desc = itemView.findViewById(R.id.card_desc);
            img = itemView.findViewById(R.id.card_image);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
