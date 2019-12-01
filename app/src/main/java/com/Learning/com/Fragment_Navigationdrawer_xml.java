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

public class Fragment_Navigationdrawer_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2,mcodeview3,mcodeview4,mcodeview5,mcodeview6;
    TextView title2,title3,title4,title5,title6;
    String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:background=\"@android:color/white\"\n" +
            "    android:padding=\"12dp\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "\n" +
            "    <EditText\n" +
            "        android:id=\"@+id/editText\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_centerVertical=\"true\"\n" +
            "        android:layout_marginTop=\"100dp\"\n" +
            "        android:hint=\"You will see input here\"\n" +
            "        android:textAppearance=\"@style/Base.TextAppearance.AppCompat.Large\" />\n" +
            "\n" +
            "\n" +
            "    <ImageButton\n" +
            "        android:id=\"@+id/button\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"30dp\"\n" +
            "        android:background=\"@drawable/button_background\" />\n" +
            "\n" +
            "</LinearLayout>";
    String code2="<resources>\n" +
            "\n" +
            "    <color name=\"colorPrimary\">#5aa184</color>\n" +
            "    <color name=\"colorPrimaryDark\">#487b66</color>\n" +
            "    <color name=\"colorAccent\">#2b644c</color>\n" +
            "\n" +
            "    <color name=\"colorButton\">#3d5f51</color>\n" +
            "    <color name=\"colorButtonActive\">#1bea95</color>\n" +
            "</resources>\n";
    String code3="<resources>\n" +
            "    <string name=\"app_name\">SpeechToText</string>\n" +
            "    <string name=\"speech_prompt\">Say something&#8230;</string>\n" +
            "    <string name=\"speech_not_supported\">Sorry! Your device doesn\\'t support speech input</string>\n" +
            "    <string name=\"tap_on_mic\">Tap on mic to speak</string>\n" +
            "</resources>\n";
    String code4="<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "\n" +
            "    <item>\n" +
            "        <shape android:shape=\"oval\">\n" +
            "            <solid android:color=\"@color/colorButtonActive\" />\n" +
            "        </shape>\n" +
            "    </item>\n" +
            "\n" +
            "    <item\n" +
            "        android:bottom=\"20dp\"\n" +
            "        android:drawable=\"@drawable/icon_record\"\n" +
            "        android:left=\"20dp\"\n" +
            "        android:right=\"20dp\"\n" +
            "        android:top=\"20dp\" />\n" +
            "\n" +
            "</layer-list>";
    String code5="<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    tools:showIn=\"navigation_view\">\n" +
            "\n" +
            "    <group android:checkableBehavior=\"single\">\n" +
            "        <item\n" +
            "            android:id=\"@+id/nav_camera\"\n" +
            "            android:icon=\"@drawable/ic_menu_camera\"\n" +
            "            android:title=\"Import\" />\n" +
            "        <item\n" +
            "            android:id=\"@+id/nav_gallery\"\n" +
            "            android:icon=\"@drawable/ic_menu_gallery\"\n" +
            "            android:title=\"Gallery\" />\n" +
            "        <item\n" +
            "            android:id=\"@+id/nav_slideshow\"\n" +
            "            android:icon=\"@drawable/ic_menu_slideshow\"\n" +
            "            android:title=\"Slideshow\" />\n" +
            "        <item\n" +
            "            android:id=\"@+id/nav_manage\"\n" +
            "            android:icon=\"@drawable/ic_menu_manage\"\n" +
            "            android:title=\"Tools\" />\n" +
            "    </group>\n" +
            "\n" +
            "    <item android:title=\"Communicate\">\n" +
            "        <menu>\n" +
            "            <item\n" +
            "                android:id=\"@+id/nav_share\"\n" +
            "                android:icon=\"@drawable/ic_menu_share\"\n" +
            "                android:title=\"Share\" />\n" +
            "            <item\n" +
            "                android:id=\"@+id/nav_send\"\n" +
            "                android:icon=\"@drawable/ic_menu_send\"\n" +
            "                android:title=\"Send\" />\n" +
            "        </menu>\n" +
            "    </item>\n" +
            "\n" +
            "</menu>\n";
    String code6="<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\">\n" +
            "    <item\n" +
            "        android:id=\"@+id/action_settings\"\n" +
            "        android:orderInCategory=\"100\"\n" +
            "        android:title=\"@string/action_settings\"\n" +
            "        app:showAsAction=\"never\" />\n" +
            "</menu>\n";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.six_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        mcodeview3 = (CodeView)view.findViewById(R.id.codeView3);
        mcodeview4 = (CodeView)view.findViewById(R.id.codeView4);
        mcodeview5 = (CodeView)view.findViewById(R.id.codeView5);
        mcodeview6 = (CodeView)view.findViewById(R.id.codeView6);
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
        Button copy3=(Button)view.findViewById(R.id.copy3);
        copy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", code3);
                clipboard.setPrimaryClip(clip);
            }
        });
        Button copy4=(Button)view.findViewById(R.id.copy4);
        copy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", code4);
                clipboard.setPrimaryClip(clip);
            }
        });
        Button copy5=(Button)view.findViewById(R.id.copy5);
        copy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", code5);
                clipboard.setPrimaryClip(clip);
            }
        });
        Button copy6=(Button)view.findViewById(R.id.copy6);
        copy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", code6);
                clipboard.setPrimaryClip(clip);
            }
        });
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("appbar_main.xml");
        title3=(TextView)view.findViewById(R.id.title3);
        title3.setText("content_maing.xml");
        title4=(TextView)view.findViewById(R.id.title4);
        title4.setText("nav_header_main.xml");
        title5=(TextView)view.findViewById(R.id.title5);
        title5.setText("Menu/activity_main_drawer.xml");
        title6=(TextView)view.findViewById(R.id.title6);
        title6.setText("Menu/main.xml");


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
        mcodeview4.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code4)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview5.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code5)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview6.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code6)
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



