package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class Fragment_ImageView_demo extends Fragment {
    ImageView imageView;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_imageview_demo, container, false);
        imageView=(ImageView)view.findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ImageView Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}