package com.Learning.com;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class Fragment_json_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2;
    TextView title2;
    String Code=" <LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "    <Button\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:id=\"@+id/fetch\"\n" +
            "        android:text=\"Fetch\"\n" +
            "        android:textAlignment=\"center\"\n" +
            "        android:background=\"@android:color/holo_blue_dark\"\n" +
            "        android:textColor=\"@android:color/white\"\n" +
            "        android:layout_marginTop=\"100dp\"/>\n" +
            "    <ListView\n" +
            "        android:id=\"@+id/list\"\n" +
            "        android:layout_width=\"fill_parent\"\n" +
            "        android:layout_height=\"wrap_content\" />\n" +
            "\n" +
            "</LinearLayout>";
    String code2="<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/name\"\n" +
            "        android:layout_width=\"fill_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:paddingBottom=\"2dip\"\n" +
            "        android:paddingTop=\"6dip\"\n" +
            "        android:textColor=\"@color/colorPrimaryDark\"\n" +
            "        android:textSize=\"16sp\"\n" +
            "        android:textStyle=\"bold\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/email\"\n" +
            "        android:layout_width=\"fill_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:paddingBottom=\"2dip\"\n" +
            "        android:textColor=\"@color/colorAccent\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/mobile\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:textColor=\"#5d5d5d\"\n" +
            "        android:textStyle=\"bold\" />\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("listitem.xml");
        Button copy1=(Button)view.findViewById(R.id.copy1);
        copy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code);
                clipboard.setPrimaryClip(clip);
            }
        });
        Button copy2=(Button)view.findViewById(R.id.copy2);
        copy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", code2);
                clipboard.setPrimaryClip(clip);
            }
        });
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

