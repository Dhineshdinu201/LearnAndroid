package com.Learning.com;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_bottom_navigation_ref extends Fragment {
    TextView text,head;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_textview_ref, container, false);
        text=(TextView)view.findViewById(R.id.text);
        head=(TextView)view.findViewById(R.id.head);
        head.setText("Create Activity");

        text.setText("Click-->File-->New-->Activity-->BottomNavigationActivity");

        return view;
    }



}
