package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewSmurfs;
    private List<SmurfsModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewSmurfs = findViewById(R.id.recyclerview);
        recyclerViewSmurfs.setHasFixedSize(true);

        models.addAll(SmurfsDatabase.getListData());

        recyclerViewSmurfs.setLayoutManager(new LinearLayoutManager(this));
        SmurfsRecyclerAdapter adapter = new SmurfsRecyclerAdapter(models);

        adapter.setOnItemClickCallback(new SmurfsRecyclerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(SmurfsModel data) {
                details(data);

            }
        });

        recyclerViewSmurfs.setAdapter(adapter);

    }

    void details(SmurfsModel data){
        Intent intent = new Intent(MainActivity.this, SmurfDetails.class);
        intent.putExtra(SmurfDetails.photo, data.getPhoto());
        intent.putExtra(SmurfDetails.name, data.getName());
        intent.putExtra(SmurfDetails.summary, data.getSummary());

        startActivity(intent);


    }
}