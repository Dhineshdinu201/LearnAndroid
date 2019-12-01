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

public class Fragment_bottom_navigation_xml  extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2;
    TextView title2;
    String Code="  extends Fragment implements CodeView.OnHighlightListener {\n" +
            "private ProgressDialog mProgressDialog;\n" +
            "private int themePos = 0;\n" +
            "        CodeView mCodeView,mcodeview2;\n" +
            "        TextView title2;\n" +
            "        String Code=\" <LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
            "                \"    xmlns:app=\\\"http://schemas.android.com/apk/res-auto\\\"\\n\" +\n" +
            "                \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
            "                \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
            "                \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
            "                \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
            "                \"    tools:context=\\\".MainActivity\\\">\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"   <ListView\\n\" +\n" +
            "                \"       android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
            "                \"       android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
            "                \"       android:id=\\\"@+id/listview\\\"></ListView>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"</LinearLayout>\";\n" +
            "        String code2=\"<LinearLayout\\n\" +\n" +
            "                \"    xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\" android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
            "                \"    android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
            "                \"    android:orientation=\\\"horizontal\\\">\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <ImageView\\n\" +\n" +
            "                \"        android:id=\\\"@+id/image\\\"\\n\" +\n" +
            "                \"        android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
            "                \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
            "                \"        android:layout_marginLeft=\\\"10dp\\\"\\n\" +\n" +
            "                \"        android:src=\\\"@drawable/user\\\"/>\\n\" +\n" +
            "                \"    <TextView\\n\" +\n" +
            "                \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
            "                \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
            "                \"        android:id=\\\"@+id/text\\\"\\n\" +\n" +
            "                \"        android:textAlignment=\\\"center\\\"\\n\" +\n" +
            "                \"        android:textColor=\\\"@android:color/black\\\"\\n\" +\n" +
            "                \"        android:layout_gravity=\\\"center\\\"\\n\" +\n" +
            "                \"        android:text=\\\"name\\\"/>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"</LinearLayout>\";\n" +
            "\n" +
            "@Override\n" +
            "@Nullable\n" +
            "public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {\n" +
            "        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);\n" +
            "        mCodeView = (CodeView)view.findViewById(R.id.codeView);\n" +
            "        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);\n" +
            "        title2=(TextView)view.findViewById(R.id.title2);\n" +
            "        title2.setText(\"custom_listview_layout.xml\");\n" +
            "\n" +
            "        mCodeView.setOnHighlightListener(this)\n" +
            "        .setOnHighlightListener(this)\n" +
            "        .setTheme(Theme.DARCULA)\n" +
            "        .setCode(Code)\n" +
            "        .setLanguage(Language.XML)\n" +
            "        .setWrapLine(true)\n" +
            "        .setFontSize(12)\n" +
            "        .setZoomEnabled(false)\n" +
            "        .setShowLineNumber(false)\n" +
            "        .apply();\n" +
            "        mcodeview2.setOnHighlightListener(this)\n" +
            "        .setOnHighlightListener(this)\n" +
            "        .setTheme(Theme.DARCULA)\n" +
            "        .setCode(code2)\n" +
            "        .setLanguage(Language.XML)\n" +
            "        .setWrapLine(true)\n" +
            "        .setFontSize(12)\n" +
            "        .setZoomEnabled(false)\n" +
            "        .setShowLineNumber(false)\n" +
            "        .apply();\n" +
            "        return view;\n" +
            "        }\n" +
            "\n" +
            "\n" +
            "@Override\n" +
            "public void onStartCodeHighlight() {\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "@Override\n" +
            "public void onFinishCodeHighlight() {\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "@Override\n" +
            "public void onLanguageDetected(Language language, int i) {\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "@Override\n" +
            "public void onFontSizeChanged(int i) {\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "@Override\n" +
            "public void onLineClicked(int i, String s) {\n" +
            "\n" +
            "        }\n" +
            "        }\n" +
            "\n";
    String code2="<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "\n" +
            "    <item\n" +
            "        android:id=\"@+id/navigation_home\"\n" +
            "        android:icon=\"@drawable/ic_home_black_24dp\"\n" +
            "        android:title=\"@string/title_home\" />\n" +
            "\n" +
            "    <item\n" +
            "        android:id=\"@+id/navigation_dashboard\"\n" +
            "        android:icon=\"@drawable/ic_dashboard_black_24dp\"\n" +
            "        android:title=\"@string/title_dashboard\" />\n" +
            "\n" +
            "    <item\n" +
            "        android:id=\"@+id/navigation_notifications\"\n" +
            "        android:icon=\"@drawable/ic_notifications_black_24dp\"\n" +
            "        android:title=\"@string/title_notifications\" />\n" +
            "\n" +
            "</menu>\n";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("Menu/navigation.xml");
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


