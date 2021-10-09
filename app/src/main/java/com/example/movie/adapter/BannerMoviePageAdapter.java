package com.example.movie.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.movie.MovieDetails;
import com.example.movie.R;
import com.example.movie.model.Banner;

import java.util.List;

public class BannerMoviePageAdapter extends PagerAdapter {

    Context context;
    List<Banner> bannerList;

    public BannerMoviePageAdapter(Context context, List<Banner> bannerList) {
        this.context = context;
        this.bannerList = bannerList;
    }

    @Override
    public int getCount() {
        return bannerList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        View view = LayoutInflater.from(context).inflate(R.layout.banner_movie_layout,null);
        ImageView bannerImage= view.findViewById(R.id.banner_image);

        Glide.with(context).load(bannerList.get(position).getImageUrl()).into(bannerImage);

        container.addView(view);
        bannerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(context, MovieDetails.class);
                i.putExtra("movieId",bannerList.get(position).getId());
                i.putExtra("movieName",bannerList.get(position).getMovieName());
                i.putExtra("movieImageUrl",bannerList.get(position).getImageUrl());
                i.putExtra("movieFile",bannerList.get(position).getFileUrl());

                context.startActivity(i);


            }
        });


        return view;



    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
