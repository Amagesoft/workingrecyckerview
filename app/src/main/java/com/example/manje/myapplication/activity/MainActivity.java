package com.example.manje.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.manje.myapplication.R;
import com.example.manje.myapplication.adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listRV;
    String[] names = {"abc","tyur","adhd","adsd","fdfd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listRV = (RecyclerView)findViewById(R.id.listRV);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        listRV.setLayoutManager(layoutManager);

        CustomAdapter adapter = new CustomAdapter((MainActivity) getApplicationContext(),names);
        listRV.setAdapter(adapter);
    }
}
