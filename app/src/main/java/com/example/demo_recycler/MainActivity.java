package com.example.demo_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.demo_recycler.until.Const;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity  {
    LinearLayoutManager layoutManager;
    GridLayoutManager gridLayoutManager;
    RecyclerView recyclerView;
    Button btn1;
    ArrayList<Item> itemArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        Toast.makeText(MainActivity.this, ""+position+"  "+itemArrayList.get(position).getTen(), Toast.LENGTH_SHORT).show();

                    }

                    @Override public void onLongItemClick(View view, int position) {

                    }
                })
        );


//        getdata();
    }
    private void init() {

        recyclerView = findViewById(R.id.recyc);
        btn1 = findViewById(R.id.btn1);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

//        gridLayoutManager = new GridLayoutManager(this,3);

        recyclerView.setLayoutManager(layoutManager);
//      GetLine();

        itemArrayList = new ArrayList<>();
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
