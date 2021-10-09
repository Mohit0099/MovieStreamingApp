package com.example.movie.model;

public class Banner {
    Integer id;
    String MovieName;
    String imageUrl;
    String fileUrl;


public Banner(){

}

    public Banner(Integer id, String movieName, String imageUrl, String fileUrl) {
        this.id = id;
        this.MovieName = movieName;
        this.imageUrl = imageUrl;
        this.fileUrl = fileUrl;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
