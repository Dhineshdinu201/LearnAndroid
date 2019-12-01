package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Fragment_gridview_demo extends Fragment {
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_gridview_xml, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.grid_view);

        gridView.setAdapter(new ImageAdapter(getActivity()));
        return view;
    }
}
