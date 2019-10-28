package com.ilham.myquis1;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static android.os.Looper.prepare;

public class MainActivity extends AppCompatActivity {

        private String[] dataName;
        private String[] dataDescription;
        private TypedArray dataPhoto;
        private RoomAdapter adapter;
        private ArrayList<Room> rooms;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            adapter = new RoomAdapter(this);

            ListView listView = findViewById(R.id.lv_list);
            listView.setAdapter(adapter);

            prepare();
            addItem();

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(MainActivity.this, rooms.get(i).getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        private void prepare(){
            dataName = getResources().getStringArray(R.array.data_name);
            dataDescription = getResources().getStringArray(R.array.data_description);
            dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        }

        private void addItem(){
            rooms = new ArrayList<>();

            for (int i = 0; i < dataName.length; i++){
                Room room = new Room();
                room.setPhoto(dataPhoto.getResourceId(i, -1));
                room.setName(dataName[i]);
                room.setDescription(dataDescription[i]);
                rooms.add(room);
            }
            adapter.setRooms(rooms);
        }
    }
