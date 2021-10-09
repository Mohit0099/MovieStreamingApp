package com.example.movie.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movie.MovieDetails;
import com.example.movie.R;
import com.example.movie.model.CategoryItem;

import java.util.List;

public class ItemRecyclerAdapter extends RecyclerView.Adapter<ItemRecyclerAdapter.ItemViewHolder> {

    public ItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    Context context;
    List<CategoryItem> categoryItemList;


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.cat_recycler_row_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder,int position) {

          //here we fetch image from server so we use glide library
        Glide.with(context).load(categoryItemList.get(position).getImageUrl()).into(holder.imageView);

     holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(context, MovieDetails.class);
                i.putExtra("movieId",categoryItemList.get(holder.getAdapterPosition()).getId());
                i.putExtra("movieName",categoryItemList.get(holder.getAdapterPosition()).getMovieName());
                i.putExtra("movieImageUrl",categoryItemList.get(holder.getAdapterPosition()).getImageUrl());
                i.putExtra("movieFile",categoryItemList.get(holder.getAdapterPosition()).getFileUrl());

                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }


    public static  final  class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_image);

        }
    }
}
