package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<friends> friendsList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friends f0 = new friends(1,"Asad", 1980, "Giglgit",R.drawable.a);
        friends f1=new friends(2,"Hamza",1996,"Lahore",R.drawable.b);
        friends f2 = new friends(3,"Musa", 1980, "Quetta",R.drawable.b);
        friends f3 = new friends(4,"Nadeem",1987,"Peshawar",R.drawable.a);
        friends f4 = new friends(5,"Shahid", 1980, "Karachi",R.drawable.c);
        friends f5 = new friends(6,"Zia",1987,"Faisalabad ",R.drawable.a);
        friends f6 = new friends(7,"Badar", 1980, "Rawalpindi",R.drawable.d);
        friends f7 = new friends(8,"Hashim",1987,"Lahore",R.drawable.b);

        friendsList.addAll(Arrays.asList(new friends[]{f0,f1,f2,f3,f4,f5,f6,f7,}));

        recyclerView = findViewById(R.id.myRecyclerView);

        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new myRecyclerViewAdatpter(friendsList);
        recyclerView.setAdapter(adapter);

    }
}