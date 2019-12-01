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

public class Fragment_recyclerView_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2;
    TextView title2;
    String Code="<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <android.support.v7.widget.RecyclerView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:id=\"@+id/recyclerview\"/>\n" +
            "</LinearLayout>";
    String code2="<android.support.v7.widget.CardView\n" +
            "    android:id=\"@+id/cardview_odd\"\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:card_view=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    card_view:cardCornerRadius=\"6dp\"\n" +
            "    card_view:cardElevation=\"3dp\"\n" +
            "    android:layout_weight=\"1\"\n" +
            "    card_view:cardUseCompatPadding=\"true\">\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:orientation=\"horizontal\">\n" +
            "        <ImageView\n" +
            "            android:id=\"@+id/user\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:src=\"@drawable/user\"/>\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/name\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:textAlignment=\"center\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:text=\"text\"/>\n" +
            "    </LinearLayout>\n" +
            "</android.support.v7.widget.CardView>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("custom_layout_recycler_view.xml");
        Button copy=(Button)view.findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code);
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

