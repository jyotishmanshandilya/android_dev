package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<recyclerItem> recyclerItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerItems = new ArrayList<>();
        for(int i=0; i<=10; i++){
            recyclerItem recycleritem = new recyclerItem(
                    "Lorem ipsum dummy text"
            );
            recyclerItems.add(recycleritem);
        }

        adapter = new DataAdapter(recyclerItems, this);

        recyclerView.setAdapter(adapter);
    }
}