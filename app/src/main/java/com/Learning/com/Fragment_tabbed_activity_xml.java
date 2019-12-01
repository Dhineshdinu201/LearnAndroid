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

public class Fragment_tabbed_activity_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2;
    TextView title2;
    String Code=" <android.support.design.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:id=\"@+id/main_content\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:fitsSystemWindows=\"true\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <android.support.design.widget.AppBarLayout\n" +
            "        android:id=\"@+id/appbar\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:paddingTop=\"@dimen/appbar_padding_top\"\n" +
            "        android:theme=\"@style/AppTheme.AppBarOverlay\">\n" +
            "\n" +
            "        <android.support.v7.widget.Toolbar\n" +
            "            android:id=\"@+id/toolbar\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"?attr/actionBarSize\"\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:background=\"?attr/colorPrimary\"\n" +
            "            app:layout_scrollFlags=\"scroll|enterAlways\"\n" +
            "            app:popupTheme=\"@style/AppTheme.PopupOverlay\"\n" +
            "            app:title=\"@string/app_name\">\n" +
            "\n" +
            "        </android.support.v7.widget.Toolbar>\n" +
            "\n" +
            "    </android.support.design.widget.AppBarLayout>\n" +
            "\n" +
            "    <android.support.v4.view.ViewPager\n" +
            "        android:id=\"@+id/container\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\" />\n" +
            "\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:id=\"@+id/fab\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"end|bottom\"\n" +
            "        android:layout_margin=\"@dimen/fab_margin\"\n" +
            "        app:srcCompat=\"@android:drawable/ic_dialog_email\" />\n" +
            "\n" +
            "</android.support.design.widget.CoordinatorLayout>";
    String code2="<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:id=\"@+id/constraintLayout\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    tools:context=\".MainActivity$PlaceholderFragment\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/section_label\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginStart=\"@dimen/activity_horizontal_margin\"\n" +
            "        android:layout_marginTop=\"@dimen/activity_vertical_margin\"\n" +
            "        android:layout_marginEnd=\"@dimen/activity_horizontal_margin\"\n" +
            "        android:layout_marginBottom=\"@dimen/activity_vertical_margin\"\n" +
            "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "        app:layout_constraintTop_toTopOf=\"@+id/constraintLayout\"\n" +
            "        tools:layout_constraintLeft_creator=\"1\"\n" +
            "        tools:layout_constraintTop_creator=\"1\" />\n" +
            "\n" +
            "</android.support.constraint.ConstraintLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("fragment_main.xml");
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


