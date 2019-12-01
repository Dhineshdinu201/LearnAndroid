package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_fingerprint_ref extends Fragment {
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
        text.setVisibility(View.GONE);
        head.setVisibility(View.GONE);
        content.setVisibility(View.GONE);


//
//        head.setText("Implementation Guide");
//
//        text.setText("Click-->Gradle Scripts-->build.gradle(Module:app)-->dependencies-->(implementation)\n"+
//                "After Implementation sync now to implement the content \n"+
//                "Paste the Gif Image in drawable folder with .gif extension");
//        content.setText("implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.+''");


        head_m.setText("Manifest Guide");

        text_m.setText("Click-->app-->Manifest-->(add permission)\n"+
                "Add Permission before application tag:-(top of <application)");
        content_m.setText("   <uses-feature android:name=\"android.hardware.fingerprint\"\n" +
                "        android:required=\"true\"/>\n" +
                "    <uses-permission android:name=\"android.permission.USE_FINGERPRINT\" />");

        return view;
    }



}




