package com.example.movie.Listner;

import com.example.movie.model.Banner;

import java.util.List;

public interface IfirebaseLoadDone {
    void onFirebaseLoadSuccess(List<Banner>bannerList);
    void onFireBaseLoadFailed(String message);
}
