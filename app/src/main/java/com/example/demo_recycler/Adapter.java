package com.example.demo_recycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewhodel> {
    Context context;
    ArrayList<Item> itemArrayList;

    public Adapter(Context context, ArrayList<Item> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public viewhodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item,parent,false);
        return new viewhodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewhodel holder, int position) {
        holder.txtview.setText(itemArrayList.get(position).getTen());
        holder.imgview.setImageResource(itemArrayList.get(position).getHinhanh());

    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public class viewhodel extends RecyclerView.ViewHolder {
        ImageView imgview;
        TextView txtview;
        public viewhodel(@NonNull View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.img);
            txtview = itemView.findViewById(R.id.txt);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(context, ""+itemArrayList.get(getPosition()).getTen(), Toast.LENGTH_SHORT).show();
//
//
//                    Intent intentnew = new Intent(context, ChiTietSanPhamActivity.class);
//                    intentnew.putExtra("thongtinchitietSP",moiNhatArrayList.get(getPosition()));
//                    // set intent một flag để không lỗi
//                    intentnew.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    context.startActivity(intentnew);
//                }
//            });

        }
    }
    public  interface  OncallBack{
            void ItemClick(int i);

    }
}
