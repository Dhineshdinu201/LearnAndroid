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

public class Fragment_animation_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2,mcodeview3,mcodeview4,mcodeview5,mcodeview6,mcodeview7,mcodeview8,mcodeview9,mcodeview10,mcodeview11,mcodeview12,mcodeview13;
    TextView title2,title3,title4,title5,title6,title7,title8,title9,title10,title11,title12,title13;
    String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "    <Button\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"fragment1\"\n" +
            "        android:id=\"@+id/f1\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"80dp\"/>\n" +
            "    <Button\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"fragment2\"\n" +
            "        android:id=\"@+id/f2\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"10dp\"/>\n" +
            "    <fragment\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:id=\"@+id/fragment\"\n" +
            "        tools:layout=\"@layout/fragment_one\"\n" +
            "        android:name=\"com.learning.fragment.fragment_one_demo\"/>\n" +
            "</LinearLayout>";
    String code2="<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "    <alpha android:fromAlpha=\"0.0\"\n" +
            "        android:toAlpha=\"1.0\"\n" +
            "        android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "        android:duration=\"600\"\n" +
            "        android:repeatMode=\"reverse\"\n" +
            "        android:repeatCount=\"infinite\"/>\n" +
            "</set>";
    String code3="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\"\n" +
            "    android:interpolator=\"@android:anim/bounce_interpolator\">\n" +
            "\n" +
            "    <scale\n" +
            "        android:duration=\"500\"\n" +
            "        android:fromXScale=\"1.0\"\n" +
            "        android:fromYScale=\"0.0\"\n" +
            "        android:toXScale=\"1.0\"\n" +
            "        android:toYScale=\"1.0\" />\n" +
            "\n" +
            "</set>";
    String code4="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\" >\n" +
            "\n" +
            "    <alpha\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromAlpha=\"0.0\"\n" +
            "        android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "        android:toAlpha=\"1.0\" />\n" +
            "\n" +
            "</set>";
    String code5="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\" >\n" +
            "\n" +
            "    <alpha\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromAlpha=\"1.0\"\n" +
            "        android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "        android:toAlpha=\"0.0\" />\n" +
            "\n" +
            "</set>";
    String code6="<set\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:interpolator=\"@android:anim/linear_interpolator\"\n" +
            "    android:fillAfter=\"true\">\n" +
            "\n" +
            "    <translate\n" +
            "        android:fromXDelta=\"0%p\"\n" +
            "        android:toXDelta=\"75%p\"\n" +
            "        android:duration=\"800\" />\n" +
            "</set>";
    String code7="<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "    <rotate android:fromDegrees=\"0\"\n" +
            "        android:toDegrees=\"360\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:duration=\"600\"\n" +
            "        android:repeatMode=\"restart\"\n" +
            "        android:repeatCount=\"infinite\"\n" +
            "        android:interpolator=\"@android:anim/cycle_interpolator\"/>\n" +
            "\n" +
            "</set>";
    String code8="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\"\n" +
            "    android:interpolator=\"@android:anim/linear_interpolator\" >\n" +
            "\n" +
            "\n" +
            "    <!-- Move -->\n" +
            "    <translate\n" +
            "        android:duration=\"800\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromXDelta=\"0%p\"\n" +
            "        android:startOffset=\"300\"\n" +
            "        android:toXDelta=\"75%p\" />\n" +
            "    <translate\n" +
            "        android:duration=\"800\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromYDelta=\"0%p\"\n" +
            "        android:startOffset=\"1100\"\n" +
            "        android:toYDelta=\"70%p\" />\n" +
            "    <translate\n" +
            "        android:duration=\"800\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromXDelta=\"0%p\"\n" +
            "        android:startOffset=\"1900\"\n" +
            "        android:toXDelta=\"-75%p\" />\n" +
            "    <translate\n" +
            "        android:duration=\"800\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromYDelta=\"0%p\"\n" +
            "        android:startOffset=\"2700\"\n" +
            "        android:toYDelta=\"-70%p\" />\n" +
            "\n" +
            "    <!-- Rotate 360 degrees -->\n" +
            "    <rotate\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromDegrees=\"0\"\n" +
            "        android:interpolator=\"@android:anim/cycle_interpolator\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:startOffset=\"3800\"\n" +
            "        android:repeatCount=\"infinite\"\n" +
            "        android:repeatMode=\"restart\"\n" +
            "        android:toDegrees=\"360\" />\n" +
            "\n" +
            "</set>";
    String code9="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\">\n" +
            "\n" +
            "    <scale\n" +
            "        android:duration=\"500\"\n" +
            "        android:fromXScale=\"1.0\"\n" +
            "        android:fromYScale=\"0.0\"\n" +
            "        android:toXScale=\"1.0\"\n" +
            "        android:toYScale=\"1.0\" />\n" +
            "\n" +
            "</set>";
    String code10="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\" >\n" +
            "\n" +
            "    <scale\n" +
            "        android:duration=\"500\"\n" +
            "        android:fromXScale=\"1.0\"\n" +
            "        android:fromYScale=\"1.0\"\n" +
            "        android:interpolator=\"@android:anim/linear_interpolator\"\n" +
            "        android:toXScale=\"1.0\"\n" +
            "        android:toYScale=\"0.0\" />\n" +
            "\n" +
            "</set>";
    String code11="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\"\n" +
            "    android:interpolator=\"@android:anim/linear_interpolator\" >\n" +
            "\n" +
            "\n" +
            "    <!-- Move -->\n" +
            "    <scale\n" +
            "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "        android:duration=\"4000\"\n" +
            "        android:fromXScale=\"1\"\n" +
            "        android:fromYScale=\"1\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:toXScale=\"4\"\n" +
            "        android:toYScale=\"4\" >\n" +
            "    </scale>\n" +
            "\n" +
            "    <!-- Rotate 180 degrees -->\n" +
            "    <rotate\n" +
            "        android:duration=\"500\"\n" +
            "        android:fromDegrees=\"0\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:repeatCount=\"infinite\"\n" +
            "        android:repeatMode=\"restart\"\n" +
            "        android:toDegrees=\"360\" />\n" +
            "\n" +
            "</set>";
    String code12="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\" >\n" +
            "\n" +
            "    <scale\n" +
            "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromXScale=\"1\"\n" +
            "        android:fromYScale=\"1\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:toXScale=\"3\"\n" +
            "        android:toYScale=\"3\" >\n" +
            "    </scale>\n" +
            "\n" +
            "</set>";
    String code13="<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\" >\n" +
            "\n" +
            "    <scale\n" +
            "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromXScale=\"1.0\"\n" +
            "        android:fromYScale=\"1.0\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:toXScale=\"0.5\"\n" +
            "        android:toYScale=\"0.5\" >\n" +
            "    </scale>\n" +
            "\n" +
            "</set>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.anim_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        mcodeview3 = (CodeView)view.findViewById(R.id.codeView3);
        mcodeview4 = (CodeView)view.findViewById(R.id.codeView4);
        mcodeview5 = (CodeView)view.findViewById(R.id.codeView5);
        mcodeview6 = (CodeView)view.findViewById(R.id.codeView6);
        mcodeview7 = (CodeView)view.findViewById(R.id.codeView7);
        mcodeview8 = (CodeView)view.findViewById(R.id.codeView8);
        mcodeview9 = (CodeView)view.findViewById(R.id.codeView9);
        mcodeview10 = (CodeView)view.findViewById(R.id.codeView10);
        mcodeview11 = (CodeView)view.findViewById(R.id.codeView11);
        mcodeview12 = (CodeView)view.findViewById(R.id.codeView12);
        mcodeview13 = (CodeView)view.findViewById(R.id.codeView13);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("anim/anim_blink.xml");
        title3=(TextView)view.findViewById(R.id.title3);
        title3.setText("anim/anim_bounce.xml");
        title4=(TextView)view.findViewById(R.id.title4);
        title4.setText("anim/anim_fade_in.xml");
        title5=(TextView)view.findViewById(R.id.title5);
        title5.setText("anim/anim_fade_out.xml");
        title6=(TextView)view.findViewById(R.id.title6);
        title6.setText("anim/anim_move.xml");
        title7=(TextView)view.findViewById(R.id.title7);
        title7.setText("anim/anim_rotate.xml");
        title8=(TextView)view.findViewById(R.id.title8);
        title8.setText("anim/anim_sequential.xml");
        title9=(TextView)view.findViewById(R.id.title9);
        title9.setText("anim/anim_slide_down.xml");
        title10=(TextView)view.findViewById(R.id.title10);
        title10.setText("anim/anim_slide_up.xml");
        title11=(TextView)view.findViewById(R.id.title11);
        title11.setText("anim/anim_together.xml");
        title12=(TextView)view.findViewById(R.id.title12);
        title12.setText("anim/zoom_in.xml");
        title13=(TextView)view.findViewById(R.id.title13);
        title13.setText("anim/zoom_out.xml");

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
        mcodeview3.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code4)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview4.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code5)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview5.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code6)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview6.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code7)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview7.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code8)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview8.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code9)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview9.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code10)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview10.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code11)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview11.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code12)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview12.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code13)
                .setLanguage(Language.XML)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(false)
                .setShowLineNumber(false)
                .apply();
        mcodeview13.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.DARCULA)
                .setCode(code3)
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


