package com.ilham.myquis1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RoomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Room> rooms;

    public RoomAdapter(Context context) {
        this.context = context;
        rooms = new ArrayList<>();
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }


    @Override
    public int getCount() {
        return rooms.size();
    }

    @Override
    public Object getItem(int i) {
        return rooms.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_room, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Room room = (Room) getItem(i);
        viewHolder.bind(room);
        return view;
    }

    public class ViewHolder{
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view){
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
        }

        void bind(Room room) {
            txtName.setText(room.getName());
            txtDescription.setText(room.getDescription());
            imgPhoto.setImageResource(room.getPhoto());
        }
    }
}
