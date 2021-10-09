package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView movieImage;
        TextView movieName;
        Button playButton;
        String mName,mImage,mId,mFileUrl;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        movieImage = findViewById(R.id.movie_image);
        movieName= findViewById(R.id.movie_name);
        playButton=findViewById(R.id.play_button);

        // get data From Intent

        mId= getIntent().getStringExtra("movieId");
        mName= getIntent().getStringExtra("movieName");
        mImage= getIntent().getStringExtra("movieImageUrl");
        mFileUrl= getIntent().getStringExtra("movieFile");

        //Set data to Movie Details

        Glide.with(this).load(mImage).into(movieImage);
        movieName.setText(mName);

        //set Video Player

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MovieDetails.this,VideoPlayer.class);
                i.putExtra("url",mFileUrl);
               startActivity(i);

            }
        });


    }
}