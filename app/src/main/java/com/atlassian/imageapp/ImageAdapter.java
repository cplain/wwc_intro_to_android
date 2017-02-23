package com.atlassian.imageapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.atlassian.imageapp.ImageAdapter.ImageViewHolder;
import com.atlassian.imageapp.model.Image;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    private final List<Image> imageList = new ArrayList<>();

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.view_image_item, parent, false);
        return new ImageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.bind(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public void setData(List<Image> newImages) {
        imageList.clear();
        imageList.addAll(newImages);
        notifyDataSetChanged();
    }

    static class ImageViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageIv;
        private final TextView titleTv;

        ImageViewHolder(View itemView) {
            super(itemView);
            imageIv = (ImageView) itemView.findViewById(R.id.image_iv);
            titleTv = (TextView) itemView.findViewById(R.id.title_tv);
        }

        void bind(Image image) {
            titleTv.setText(image.getTitle());

            Glide.with(imageIv.getContext())
                    .load(image.getLink())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imageIv);
        }
    }
}
