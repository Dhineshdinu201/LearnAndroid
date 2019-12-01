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

public class Fragment_Image_text_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView;
    String Code="<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <ImageView\n" +
            "        android:id=\"@+id/imageView\"\n" +
            "        android:layout_width=\"200dp\"\n" +
            "        android:layout_height=\"200dp\"\n" +
            "        android:layout_marginTop=\"16dp\"\n" +
            "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
            "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
            "        app:srcCompat=\"@mipmap/ic_launcher\"\n" +
            "        tools:layout_constraintLeft_creator=\"1\"\n" +
            "        tools:layout_constraintRight_creator=\"1\"/>\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginBottom=\"8dp\"\n" +
            "        android:text=\"Scan Text\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
            "        tools:layout_constraintLeft_creator=\"1\"\n" +
            "        tools:layout_constraintRight_creator=\"1\"\n" +
            "        />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/textView\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"40dp\"\n" +
            "        android:text=\"Scan Results:\"\n" +
            "        android:textAllCaps=\"false\"\n" +
            "        android:textStyle=\"normal|bold\"\n" +
            "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
            "        app:layout_constraintTop_toBottomOf=\"@+id/imageView\"\n" +
            "        tools:layout_constraintLeft_creator=\"1\"\n" +
            "        tools:layout_constraintRight_creator=\"1\"/>\n" +
            "\n" +
            "    <ScrollView\n" +
            "        android:layout_width=\"0dp\"\n" +
            "        android:layout_height=\"0dp\"\n" +
            "        android:layout_marginTop=\"8dp\"\n" +
            "        android:paddingLeft=\"5dp\"\n" +
            "        android:paddingRight=\"5dp\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintHorizontal_bias=\"1.0\"\n" +
            "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
            "        app:layout_constraintTop_toBottomOf=\"@+id/textView\"\n" +
            "        tools:layout_constraintTop_creator=\"1\"\n" +
            "        tools:layout_constraintRight_creator=\"1\"\n" +
            "        tools:layout_constraintBottom_creator=\"1\"\n" +
            "        tools:layout_constraintLeft_creator=\"1\">\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:orientation=\"vertical\">\n" +
            "\n" +
            "            <TextView\n" +
            "                android:id=\"@+id/results\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginTop=\"8dp\"\n" +
            "                app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "                app:layout_constraintRight_toRightOf=\"parent\"\n" +
            "                tools:layout_constraintLeft_creator=\"1\"\n" +
            "                tools:layout_constraintRight_creator=\"1\"\n" +
            "                tools:layout_constraintTop_creator=\"1\"/>\n" +
            "        </LinearLayout>\n" +
            "    </ScrollView>\n" +
            "\n" +
            "</android.support.constraint.ConstraintLayout>";

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
