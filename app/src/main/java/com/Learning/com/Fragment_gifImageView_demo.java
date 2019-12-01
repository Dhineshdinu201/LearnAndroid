package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class Fragment_gifImageView_demo extends Fragment {
    GifImageView loading;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_gifimageview_demo, container, false);
        loading=(GifImageView)view.findViewById(R.id.loading);
        loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Gif ImageView", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
