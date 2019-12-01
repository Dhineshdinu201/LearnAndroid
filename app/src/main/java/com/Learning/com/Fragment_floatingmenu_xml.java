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

public class Fragment_floatingmenu_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView;
    String Code="<android.support.design.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\"\n" +
            "    android:weightSum=\"2\">\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:orientation=\"vertical\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/text\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Hello World!\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"100dp\"/>\n" +
            "    </LinearLayout>\n" +
            "    <com.github.clans.fab.FloatingActionMenu\n" +
            "        android:id=\"@+id/menu\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:fitsSystemWindows=\"true\"\n" +
            "        android:padding=\"11dp\"\n" +
            "        app:layout_anchorGravity=\"bottom|end\"\n" +
            "        app:menu_animationDelayPerItem=\"55\"\n" +
            "        app:menu_backgroundColor=\"@android:color/transparent\"\n" +
            "        app:menu_buttonSpacing=\"0dp\"\n" +
            "        app:menu_colorNormal=\"@android:color/holo_red_dark\"\n" +
            "        app:menu_colorPressed=\"@android:color/holo_red_light\"\n" +
            "        app:menu_colorRipple=\"@android:color/holo_red_light\"\n" +
            "        app:menu_fab_size=\"normal\"\n" +
            "        app:menu_icon=\"@drawable/menu\"\n" +
            "        app:menu_labels_colorNormal=\"#333\"\n" +
            "        app:menu_labels_colorPressed=\"#444\"\n" +
            "        app:menu_labels_textColor=\"@android:color/white\"\n" +
            "        app:menu_labels_textSize=\"15sp\"\n" +
            "        app:fab_label=\"Select Lab\"\n" +
            "        >\n" +
            "        <!--replace menu with your own inage-->\n" +
            "        <!--replace arrow with your own inage-->\n" +
            "\n" +
            "        <com.github.clans.fab.FloatingActionButton\n" +
            "            android:id=\"@+id/b2\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fitsSystemWindows=\"true\"\n" +
            "            android:scaleType=\"fitCenter\"\n" +
            "            android:src=\"@drawable/arrow\"\n" +
            "            android:background=\"@android:color/holo_green_dark\"\n" +
            "            android:tint=\"@android:color/holo_green_dark\"\n" +
            "            app:fab_label=\"btn2\" />\n" +
            "        <com.github.clans.fab.FloatingActionButton\n" +
            "            android:id=\"@+id/b3\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fitsSystemWindows=\"true\"\n" +
            "            android:src=\"@drawable/arrow\"\n" +
            "            android:scaleType=\"fitCenter\"\n" +
            "            android:background=\"@android:color/transparent\"\n" +
            "            app:fab_label=\"btn3\" />\n" +
            "        <com.github.clans.fab.FloatingActionButton\n" +
            "            android:id=\"@+id/b4\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fitsSystemWindows=\"true\"\n" +
            "            android:scaleType=\"fitCenter\"\n" +
            "            android:src=\"@drawable/arrow\"\n" +
            "            app:fab_label=\"btn4\" />\n" +
            "        <com.github.clans.fab.FloatingActionButton\n" +
            "            android:id=\"@+id/b5\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fitsSystemWindows=\"true\"\n" +
            "            android:background=\"@android:color/transparent\"\n" +
            "            android:scaleType=\"fitCenter\"\n" +
            "            android:src=\"@drawable/arrow\"\n" +
            "            app:fab_label=\"btn5\" />\n" +
            "\n" +
            "    </com.github.clans.fab.FloatingActionMenu>\n" +
            "\n" +
            "</android.support.design.widget.CoordinatorLayout>";

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



