package com.example.demo_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.demo_recycler.until.Const;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity  {
    LinearLayoutManager layoutManager;
    GridLayoutManager gridLayoutManager;
    RecyclerView recyclerView;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
//        getdata();
    }
    private void init() {
        recyclerView = findViewById(R.id.recyc);
        btn1 = findViewById(R.id.btn1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
//        gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
//      GetLine();
        ArrayList<Item> itemArrayList  = new ArrayList<>();
        itemArrayList.add(new Item(R.drawable.ic_launcher_background,"Dat"));
        itemArrayList.add(new Item(R.drawable.ic_launcher_foreground,"Bui"));
        itemArrayList.add(new Item(R.drawable.ic_launcher_background,"Thanh"));
        itemArrayList.add(new Item(R.drawable.ic_launcher_background,"Dat"));
        itemArrayList.add(new Item(R.drawable.ic_launcher_foreground,"Bui"));
        itemArrayList.add(new Item(R.drawable.ic_launcher_background,"Thanh"));
        Adapter adapter = new Adapter(this,itemArrayList);
        recyclerView.setAdapter(adapter);




    }

//    private void GetLine() {
//        DividerItemDecoration itemDecoration =  new DividerItemDecoration(this, layoutManager.getOrientation());
//        recyclerView.addItemDecoration(itemDecoration);
//    }
}
