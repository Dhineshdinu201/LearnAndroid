package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Fragment_one_demo extends Fragment {
    TextView text;
    LinearLayout ll;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_textview_demo, container, false);
        ll=(LinearLayout)view.findViewById(R.id.ll);
        ll.setBackgroundResource(R.color.colorPrimaryDark);
        text=(TextView)view.findViewById(R.id.text);
        text.setText("Fragment One");
        return view;
    }
}
