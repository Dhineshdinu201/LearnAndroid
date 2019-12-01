package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class Fragment_fragment_xml  extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2,mcodeview3;
    TextView title2,title3;
    String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "    <Button\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"fragment1\"\n" +
            "        android:id=\"@+id/f1\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"80dp\"/>\n" +
            "    <Button\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"fragment2\"\n" +
            "        android:id=\"@+id/f2\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"10dp\"/>\n" +
            "    <fragment\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:id=\"@+id/fragment\"\n" +
            "        tools:layout=\"@layout/fragment_one\"\n" +
            "        android:name=\"com.learning.fragment.fragment_one_demo\"/>\n" +
            "</LinearLayout>";
    String code2="<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:background=\"@android:color/white\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/text\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"100dp\"\n" +
            "        android:layout_marginLeft=\"20dp\"\n" +
            "        android:textColor=\"@android:color/black\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        android:textIsSelectable=\"true\"\n" +
            "        android:textSize=\"20sp\"\n" +
            "        android:text=\"This is a TextView\"/>\n" +
            "\n" +
            "</LinearLayout>";
    String code3="<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:background=\"@color/colorPrimary\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/text\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"100dp\"\n" +
            "        android:layout_marginLeft=\"20dp\"\n" +
            "        android:textColor=\"@android:color/black\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        android:textIsSelectable=\"true\"\n" +
            "        android:textSize=\"20sp\"\n" +
            "        android:text=\"This is a TextView\"/>\n" +
            "\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.three_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        mcodeview3 = (CodeView)view.findViewById(R.id.codeView3);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("fragment_one.xml");
        title3=(TextView)view.findViewById(R.id.title3);
        title3.setText("fragment_two.xml");

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
        mcodeview2.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code2)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview3.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code3)
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

