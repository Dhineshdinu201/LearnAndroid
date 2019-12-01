package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Speech_text_ref extends Fragment {
    TextView text, head, content, text_m, head_m, content_m,textg,headg,content_g;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.implementation_ref, container, false);
        text = (TextView) view.findViewById(R.id.text_implementation);
        head = (TextView) view.findViewById(R.id.head_implementation);
        content = (TextView) view.findViewById(R.id.content_implementation);
        text_m = (TextView) view.findViewById(R.id.text_manifest);
        head_m = (TextView) view.findViewById(R.id.head_manifest);
        content_m = (TextView) view.findViewById(R.id.content_manifest);
        text_m.setVisibility(View.VISIBLE);
        head_m.setVisibility(View.VISIBLE);
        content_m.setVisibility(View.VISIBLE);
        head.setVisibility(View.GONE);
        text.setVisibility(View.GONE);
        content.setVisibility(View.GONE);
//        textg = (TextView) view.findViewById(R.id.text_gradle);
////        headg = (TextView) view.findViewById(R.id.head_gradle);
////        content_g = (TextView) view.findViewById(R.id.content_gradle);
////        textg.setVisibility(View.VISIBLE);
////        headg.setVisibility(View.VISIBLE);
////        content_g.setVisibility(View.VISIBLE);


        head.setText("Implementation Guide");

        text.setText("Click-->Gradle Scripts-->build.gradle(Module:app)-->dependencies-->(implementation)\n" +
                "After Implementation sync now to implement the content");
        content.setText("implementation 'com.github.blikoon:QRCodeScanner:0.1.2'");


        head_m.setText("Manifest Guide");

        text_m.setText("Click-->app-->Manifest-->(add permission)\n" +
                "Add Permission before application tag:-(top of <application)");
        content_m.setText("<uses-permission android:name=\"android.permission.RECORD_AUDIO\" />");


//        headg.setText("build.gradle(Project:(your app name)");
//
//        textg.setText("Click-->Gradle Scripts-->build.gradle(Project:(your app name)-->allprojects-->repositories\n" +
//                "After Implementation sync now to implement the content");
//        content_g.setText("  google()\n" +
//                "        jcenter()\n" +
//                "        maven {\n" +
//                "            url 'https://jitpack.io'\n" +
//                "        }\n" +
//                "        ");

        return view;
    }
}
