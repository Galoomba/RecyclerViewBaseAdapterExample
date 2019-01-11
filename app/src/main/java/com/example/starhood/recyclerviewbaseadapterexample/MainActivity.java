package com.example.starhood.recyclerviewbaseadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.baseadapter.BaseAdapter;
import com.example.baseadapter.OnRecyclerViewItemClickListener;
import com.example.baseadapter.RecyclerViewView;
import com.example.starhood.recyclerviewbaseadapterexample.POJO.DataClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnRecyclerViewItemClickListener<DataClass>{

    private ArrayList<DataClass> data=new ArrayList<>();
    private String moocDisckSting ="dummy disc Flowers are also called the bloom or blossom of a plant. Flowers have petals. Inside the part of the flower that has petals are the parts which produce pollen and seeds. In all plants";
    private BaseAdapter<DataClass> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i =0;i<10;i++){
            DataClass buffer = new DataClass("mooc "+i,moocDisckSting,"1474  Hawks Nest Lane,Saint Louis,MO,Missouri","www.dummy-website.com");
            data.add(buffer);
        }
        RecyclerView recyclerView = findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);


        adapter = new BaseAdapter<>(data, this, R.layout.list_item);


        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onClick(DataClass pos) {
        Toast.makeText(getApplicationContext(),"onClick on " +pos.getTitle(),Toast.LENGTH_SHORT).show();
        adapter.delete(0);
    }

    @Override
    public void onLongPress(DataClass pos) {
        Toast.makeText(getApplicationContext(),"onLongClick on "+ pos.getTitle(),Toast.LENGTH_SHORT).show();
        adapter.insert( new DataClass("mooc 11",moocDisckSting,"1474  Hawks Nest Lane,Saint Louis,MO,Missouri","www.dummy-website.com"));

    }

}
