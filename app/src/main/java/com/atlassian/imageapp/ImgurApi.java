package com.atlassian.imageapp;

import com.atlassian.imageapp.model.ImageResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

import static com.atlassian.imageapp.BuildConfig.CLIENT_ID;

public interface ImgurApi {

    @GET("3/gallery/r/{subreddit}")
    @Headers("Authorization: " + CLIENT_ID)
    Call<ImageResponse> getImagesFromSubreddit(@Path("subreddit") String subredditName);
}
