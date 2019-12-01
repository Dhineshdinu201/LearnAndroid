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

public class Fragment_simple_and_custom_toast_xml extends Fragment implements CodeView.OnHighlightListener {
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
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"100dp\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:text=\"Click the below buttton to view the custom alert dialog\"/>\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btn\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:background=\"@android:color/holo_green_dark\"\n" +
            "        android:text=\"Click!\"\n" +
            "        android:textAlignment=\"center\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:textColor=\"@android:color/white\"\n" +
            "        android:textStyle=\"bold\"/>\n" +
            "\n" +
            "\n" +
            "</LinearLayout>";
    String code2="<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:text=\" Custom Alert\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:id=\"@+id/text\"\n" +
            "        android:textStyle=\"normal|bold\"\n" +
            "        android:textSize=\"18sp\"\n" +
            "        android:textAlignment=\"center\"\n" +
            "        android:layout_marginLeft=\"10dp\"\n" +
            "        android:layout_marginRight=\"10dp\"\n" +
            "        android:layout_marginTop=\"12dp\" />\n" +
            "\n" +
            "    <ImageButton\n" +
            "        android:layout_width=\"100dp\"\n" +
            "        android:layout_height=\"100dp\"\n" +
            "        app:srcCompat=\"@drawable/ic_launcher_background\"\n" +
            "        android:id=\"@+id/image\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginLeft=\"5dp\"\n" +
            "        android:layout_marginTop=\"5dp\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/back\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"close\"\n" +
            "        android:layout_marginTop=\"23dp\"\n" +
            "        android:paddingRight=\"5dp\"\n" +
            "        style=\"@style/Widget.AppCompat.Button.Colored\" />\n" +
            "\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("custom_layout_alertdialog.xml");

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
