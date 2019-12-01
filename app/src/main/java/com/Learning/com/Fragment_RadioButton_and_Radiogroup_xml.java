package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class Fragment_RadioButton_and_Radiogroup_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView;
    String Code="<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <RadioGroup\n" +
            "        android:id=\"@+id/rdgrp\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"100dp\"\n" +
            "        android:layout_gravity=\"center\">\n" +
            "        <RadioButton\n" +
            "            android:id=\"@+id/rb1\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Noughat\"/>\n" +
            "        <RadioButton\n" +
            "            android:id=\"@+id/rb2\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Oreo\"/>\n" +
            "        <RadioButton\n" +
            "            android:id=\"@+id/rb3\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Pie\"/>\n" +
            "\n" +
            "    </RadioGroup>\n" +
            "\n" +
            "\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);

        mCodeView.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(Code)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        return view;
    }


    @Override
    public void onStartCodeHighlight() {

    }

    @Override
    public void onFinishCodeHighlight() {

    }

    @Override
    public void onLanguageDetected(Language language, int i) {

    }

    @Override
    public void onFontSizeChanged(int i) {

    }

    @Override
    public void onLineClicked(int i, String s) {

    }
}

