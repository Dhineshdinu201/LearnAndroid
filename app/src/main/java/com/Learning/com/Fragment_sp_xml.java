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

public class Fragment_sp_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView;
    String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:card_view=\"http://schemas.android.com/tools\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "\n" +
            "                <EditText\n" +
            "                    android:id=\"@+id/et_userid\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_marginTop=\"100dp\"\n" +
            "                    android:hint=\"  Enter User Id\"\n" +
            "                    android:inputType=\"text\"\n" +
            "                    android:textAlignment=\"center\"\n" +
            "                    android:focusable=\"true\"\n" +
            "                    android:backgroundTint=\"@android:color/darker_gray\"\n" +
            "                    android:focusableInTouchMode=\"true\" />\n" +
            "\n" +
            "\n" +
            "                <EditText\n" +
            "                    android:id=\"@+id/et_password\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_marginTop=\"15dp\"\n" +
            "                    android:backgroundTint=\"@android:color/darker_gray\"\n" +
            "                    android:focusable=\"true\"\n" +
            "                    android:focusableInTouchMode=\"true\"\n" +
            "                    android:hint=\"  Enter Password\"\n" +
            "                    android:inputType=\"textPassword\"\n" +
            "                    android:textAlignment=\"center\" />\n" +
            "            <LinearLayout\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:orientation=\"horizontal\"\n" +
            "                android:weightSum=\"2\">\n" +
            "                <CheckBox\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:text=\"Remember id and password\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:id=\"@+id/check\"/>\n" +
            "            </LinearLayout>\n" +
            "\n" +
            "                <Button\n" +
            "                    android:id=\"@+id/btn_submit\"\n" +
            "                    android:layout_width=\"wrap_content\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:padding=\"10dp\"\n" +
            "                    android:layout_marginBottom=\"10dp\"\n" +
            "                    android:text=\"Submit\"\n" +
            "                    android:layout_marginLeft=\"5dp\"\n" +
            "                    android:layout_marginTop=\"20dp\"\n" +
            "                    android:layout_gravity=\"center\"/>\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "\n";

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
