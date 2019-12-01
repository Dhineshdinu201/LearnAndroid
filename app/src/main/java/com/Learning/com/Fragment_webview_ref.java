package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_webview_ref extends Fragment {
    TextView text,head;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_textview_ref, container, false);
        text=(TextView)view.findViewById(R.id.text);
        head=(TextView)view.findViewById(R.id.head);
        head.setText("Manifest Guide");

        text.setText("Click-->app-->Manifest-->(add permission)\n" +
                "Add Permission before application tag:-(top of <application)"+
       " <uses-permission android:name=\"android.permission.INTERNET\" />\n");

        return view;
    }


}
