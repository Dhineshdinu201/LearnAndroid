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

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class Fragment_encryptanddecrypt_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView;
    String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "   <TextView\n" +
            "       android:layout_width=\"wrap_content\"\n" +
            "       android:layout_height=\"wrap_content\"\n" +
            "       android:text=\"copy and paste the encrypted text to decrypt\"\n" +
            "       android:textStyle=\"bold\"\n" +
            "       android:layout_gravity=\"center\"\n" +
            "       android:layout_marginTop=\"100dp\"\n" +
            "       android:textColor=\"@android:color/black\"/>\n" +
            "    <EditText\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:hint=\"please enter the text here...\"\n" +
            "        android:id=\"@+id/et_text\"\n" +
            "        android:layout_marginTop=\"30dp\"\n" +
            "        android:textColor=\"@android:color/black\"/>\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:textIsSelectable=\"true\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:id=\"@+id/result\"/>\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:textColor=\"@android:color/black\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        android:layout_marginLeft=\"10dp\"\n" +
            "        android:layout_marginTop=\"10dp\"\n" +
            "        android:text=\"Encrypt\"/>\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:orientation=\"horizontal\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:weightSum=\"2\">\n" +
            "        <Button\n" +
            "            android:layout_weight=\"1\"\n" +
            "        android:id=\"@+id/e_with\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginLeft=\"5dp\"\n" +
            "        android:layout_marginRight=\"10dp\"\n" +
            "        android:text=\"with base64\"/>\n" +
            "        <Button\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:id=\"@+id/e_without\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"10dp\"\n" +
            "            android:layout_marginRight=\"5dp\"\n" +
            "            android:text=\"without base64\"/>\n" +
            "    </LinearLayout>\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:textColor=\"@android:color/black\"\n" +
            "        android:layout_marginTop=\"30dp\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        android:layout_marginLeft=\"10dp\"\n" +
            "        android:text=\"Decrypt\"/>\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:orientation=\"horizontal\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:weightSum=\"2\">\n" +
            "        <Button\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:id=\"@+id/d_with\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"5dp\"\n" +
            "            android:layout_marginRight=\"10dp\"\n" +
            "            android:text=\"with base64\"/>\n" +
            "        <Button\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:id=\"@+id/d_without\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"10dp\"\n" +
            "            android:layout_marginRight=\"5dp\"\n" +
            "            android:text=\"without base64\"/>\n" +
            "    </LinearLayout>\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
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
