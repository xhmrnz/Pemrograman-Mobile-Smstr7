package com.ilham.mymobile2_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TemanRecyclerAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return DataTemanku.nama.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mItemText;
        private ImageView mItemImage;

        public ListViewHolder(View itemView) {
            super(itemView);
            mItemText = itemView.findViewById(R.id.itemText);
            mItemImage = itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position) {
            mItemText.setText(DataTemanku.nama[position]);
            mItemImage.setImageResource(DataTemanku.picturePath[position]);
        }

        @Override
        public void onClick(View view) {
        }
    }
}
