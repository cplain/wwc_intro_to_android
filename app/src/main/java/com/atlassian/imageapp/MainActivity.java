package com.atlassian.imageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.atlassian.imageapp.model.Image;
import com.atlassian.imageapp.model.ImageResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String SUBREDDIT_NAME = "Aww";
    private static final int COL_COUNT = 3;

    private final ImageAdapter imageAdapter = new ImageAdapter();

    private Call<ImageResponse> imageRequest;
    private ImgurApi imgurApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView imagesRv = (RecyclerView) findViewById(R.id.images_rv);
        imagesRv.setLayoutManager(new GridLayoutManager(this, COL_COUNT));
        imagesRv.setAdapter(imageAdapter);

        imgurApi = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ImgurApi.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        cancelImageRequest();

        setTitle(R.string.image_loading);
        imageRequest = imgurApi.getImagesFromSubreddit(SUBREDDIT_NAME);
        imageRequest.enqueue(new Callback<ImageResponse>() {
            @Override
            public void onResponse(Call<ImageResponse> call, Response<ImageResponse> response) {
                if (response.isSuccessful()) {
                    showImages(response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<ImageResponse> call, Throwable t) {
                // Beware if you cancel this will also be called
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        cancelImageRequest();
    }

    private void cancelImageRequest() {
        if (imageRequest != null) {
            imageRequest.cancel();
        }
    }

    private void showImages(List<Image> images) {
        setTitle(SUBREDDIT_NAME);
        imageAdapter.setData(images);
    }
}
