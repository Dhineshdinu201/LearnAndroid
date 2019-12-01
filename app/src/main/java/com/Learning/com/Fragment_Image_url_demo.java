package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.master.glideimageview.GlideImageView;

public class Fragment_Image_url_demo extends Fragment {
    GlideImageView glideImageView;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_image_url_demo, container, false);
        glideImageView = (GlideImageView) view.findViewById(R.id.glide_image_view);
        glideImageView.loadImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Pizigani_1367_Chart_10MB.jpg/800px-Pizigani_1367_Chart_10MB.jpg");
        return view;
    }
}