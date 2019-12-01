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

public class Fragment_custom_listView_xml extends Fragment implements CodeView.OnHighlightListener {
private ProgressDialog mProgressDialog;
private int themePos = 0;
        CodeView mCodeView,mcodeview2;
        TextView title2;
        String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "   <ListView\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"match_parent\"\n" +
                "       android:id=\"@+id/listview\"></ListView>\n" +
                "\n" +
                "</LinearLayout>";
        String code2="<LinearLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:orientation=\"horizontal\">\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/image\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginLeft=\"10dp\"\n" +
                "        android:src=\"@drawable/user\"/>\n" +
                "    <TextView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/text\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textColor=\"@android:color/black\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:text=\"name\"/>\n" +
                "\n" +
                "</LinearLayout>";

@Override
@Nullable
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("custom_listview_layout.xml");

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

