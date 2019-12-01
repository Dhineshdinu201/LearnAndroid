package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_ImageView_ref extends Fragment {
    TextView text,head;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_textview_ref, container, false);
        text=(TextView)view.findViewById(R.id.text);
        head=(TextView)view.findViewById(R.id.head);
        head.setText("Create activity & Paste image in drawable folder");

        text.setText("Click-->File-->New-->Activity-->EmptyActivity\n" +
                "Click-->app-->res-->drawable-->paste as drawable\n"+
                "(Image Format allowed are *.png/.jpg)");

        return view;
    }



}

