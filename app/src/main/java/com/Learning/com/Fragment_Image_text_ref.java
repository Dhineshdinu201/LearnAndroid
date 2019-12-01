package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Image_text_ref extends Fragment {
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
        textg = (TextView) view.findViewById(R.id.text_gradle);
        headg = (TextView) view.findViewById(R.id.head_gradle);
        content_g = (TextView) view.findViewById(R.id.content_gradle);
        textg.setVisibility(View.VISIBLE);
        headg.setVisibility(View.VISIBLE);
        content_g.setVisibility(View.VISIBLE);


        head.setText("Implementation Guide");

        text.setText("Click-->Gradle Scripts-->build.gradle(Module:app)-->dependencies-->(implementation)\n" +
                "After Implementation sync now to implement the content");
        content.setText("implementation 'com.google.android.gms:play-services-vision:11.4.0'");


        head_m.setText("Manifest Guide");

        text_m.setText("Click-->app-->Manifest-->(add permission)\n" +
                "Add Permission before application tag:-(top of <application)\n"+
                "Add meta-data tag and provider-tag");
        content_m.setText("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    package=\"com.example.textscannner\" >\n" +
                "\n" +
                "    <uses-feature\n" +
                "        android:name=\"android.hardware.camera\"\n" +
                "        android:required=\"true\" />\n" +
                "\n" +
                "    <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\" />\n" +
                "\n" +
                "    <application\n" +
                "        android:allowBackup=\"true\"\n" +
                "        android:icon=\"@mipmap/ic_launcher\"\n" +
                "        android:label=\"@string/app_name\"\n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                "        android:supportsRtl=\"true\"\n" +
                "        android:theme=\"@style/AppTheme\" >\n" +
                "\n" +
                "        <meta-data\n" +
                "            android:name=\"com.google.android.gms.vision.DEPENDENCIES\"\n" +
                "            android:value=\"ocr\" />\n" +
                "\n" +
                "        <activity android:name=\".MainActivity\" >\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "\n" +
                "        <provider\n" +
                "            android:name=\"android.support.v4.content.FileProvider\"\n" +
                "            android:authorities=\"${applicationId}.provider\"\n" +
                "            android:exported=\"false\"\n" +
                "            android:grantUriPermissions=\"true\" >\n" +
                "            <meta-data\n" +
                "                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n" +
                "                android:resource=\"@xml/provider_paths\" />\n" +
                "        </provider>\n" +
                "    </application>\n" +
                "\n" +
                "</manifest>");



        headg.setText("Create Directory");

        textg.setText("Click-->res-->New-->Directory-->Create Directory(xml)\n"+
                "create providerpaths.xml at xml directory and Paste the below code ");
        content_g.setText("<paths>\n" +
                "    <external-path\n" +
                "        name=\"external_files\"\n" +
                "        path=\".\"/>\n" +
                "</paths>");

        return view;
    }
}
