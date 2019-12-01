package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_image_server_ref extends Fragment {
    TextView text,head,content,text_m,head_m,content_m;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.implementation_ref, container, false);
        text=(TextView)view.findViewById(R.id.text_implementation);
        head=(TextView)view.findViewById(R.id.head_implementation);
        content=(TextView)view.findViewById(R.id.content_implementation);
        text_m=(TextView)view.findViewById(R.id.text_manifest);
        head_m=(TextView)view.findViewById(R.id.head_manifest);
        content_m=(TextView)view.findViewById(R.id.content_manifest);
        text_m.setVisibility(View.VISIBLE);
        head_m.setVisibility(View.VISIBLE);
        content_m.setVisibility(View.VISIBLE);



        head.setText("Implementation Guide");

        text.setText("Click-->Gradle Scripts-->build.gradle(Module:app)-->dependencies-->(implementation)\n"+
                "After Implementation sync now to implement the content");
        content.setText("    implementation 'com.android.support:recyclerview-v7:27.0.0'\n" +
                "    implementation 'com.android.support:cardview-v7:28.0.0'\n" +
                "    implementation 'com.squareup.okhttp3:okhttp:3.9.1'\n" +
                "    implementation 'org.apache.commons:commons-lang3:3.5'");


        head_m.setText("Manifest Guide");

        text_m.setText("Click-->app-->Manifest-->(add permission)\n"+
                "Add Permission before application tag:-(top of <application)");
        content_m.setText("<uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\" />\n" +
                "    <uses-permission android:name=\"android.permission.INTERNET\" />\n" +
                "    <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>\n" +
                "    <uses-permission android:name=\"android.permission.ACCESS_WIFI_STATE\" />");

        return view;
    }



}


