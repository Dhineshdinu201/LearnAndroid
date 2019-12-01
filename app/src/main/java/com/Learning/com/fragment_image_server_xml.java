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

public class fragment_image_server_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2;
    TextView title2;
    String Code=" <RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "android:layout_width=\"match_parent\"\n" +
            "android:layout_height=\"match_parent\"\n" +
            "android:background=\"#FFF9C4\"\n" +
            "tools:context=\".MainActivity\">\n" +
            "\n" +
            "<Button\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:text=\"CLICK HERE TO SELECT IMAGE FROM GALLERY\"\n" +
            "    android:id=\"@+id/button\"\n" +
            "    android:layout_alignParentTop=\"true\"\n" +
            "    android:layout_alignParentLeft=\"true\"\n" +
            "    android:layout_alignParentStart=\"true\" />\n" +
            "\n" +
            "<Button\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:text=\"CLICK HERE TO UPLOAD SELECTED IMAGE ON SERVER \"\n" +
            "    android:id=\"@+id/button2\"\n" +
            "    android:layout_alignParentBottom=\"true\"\n" +
            "    android:layout_alignParentLeft=\"true\"\n" +
            "    android:layout_alignParentStart=\"true\" />\n" +
            "\n" +
            "<EditText\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:id=\"@+id/editText\"\n" +
            "    android:layout_above=\"@+id/button2\"\n" +
            "    android:layout_centerHorizontal=\"true\"\n" +
            "    android:hint=\"Enter Image Name Here\"\n" +
            "    android:gravity=\"center\"\n" +
            "    />\n" +
            "\n" +
            "<ImageView\n" +
            "    android:layout_width=\"fill_parent\"\n" +
            "    android:layout_height=\"270dp\"\n" +
            "    android:id=\"@+id/imageView\"\n" +
            "    android:layout_below=\"@+id/button\"\n" +
            "    android:layout_alignParentLeft=\"true\"\n" +
            "    android:layout_alignParentStart=\"true\"\n" +
            "    android:layout_above=\"@+id/editText\" />\n" +
            "\n" +
            "</RelativeLayout>";
    String code2="<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    xmlns:card_view=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "    <android.support.v7.widget.CardView\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:elevation=\"6dp\"\n" +
            "    android:layout_marginLeft=\"5dp\"\n" +
            "    android:layout_marginTop=\"15dp\"\n" +
            "    android:layout_marginBottom=\"1dp\"\n" +
            "    android:layout_marginRight=\"1dp\"\n" +
            "    card_view:cardCornerRadius=\"3dp\">\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:orientation=\"vertical\">\n" +
            "            <LinearLayout\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:orientation=\"horizontal\"\n" +
            "                android:weightSum=\"2\">\n" +
            "                <TextView\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:id=\"@+id/date\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:text=\"Date:23/09/19\"\n" +
            "                    android:layout_marginLeft=\"10dp\"\n" +
            "                    android:background=\"@android:color/white\"\n" +
            "                    android:textColor=\"@android:color/black\"/>\n" +
            "                <TextView\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:id=\"@+id/mode\"\n" +
            "                    android:text=\"Mode:Cash Payment\"\n" +
            "                    android:textAlignment=\"textEnd\"\n" +
            "                    android:background=\"@android:color/white\"\n" +
            "                    android:layout_marginRight=\"10dp\"\n" +
            "                    android:textColor=\"@android:color/black\"/>\n" +
            "            </LinearLayout>\n" +
            "            <LinearLayout\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:orientation=\"horizontal\"\n" +
            "                android:weightSum=\"2\">\n" +
            "                <TextView\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:id=\"@+id/ref\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:text=\"Reference:RCT 154\"\n" +
            "                    android:layout_marginLeft=\"10dp\"\n" +
            "                    android:background=\"@android:color/white\"\n" +
            "                    android:textColor=\"@android:color/black\"/>\n" +
            "                <TextView\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:id=\"@+id/value\"\n" +
            "                    android:text=\"Value:15000\"\n" +
            "                    android:textAlignment=\"textEnd\"\n" +
            "                    android:background=\"@android:color/white\"\n" +
            "                    android:layout_marginRight=\"10dp\"\n" +
            "                    android:textColor=\"@android:color/black\"/>\n" +
            "            </LinearLayout>\n" +
            "            <LinearLayout\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:orientation=\"horizontal\"\n" +
            "                android:weightSum=\"2\">\n" +
            "\n" +
            "                <TextView\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:id=\"@+id/status\"\n" +
            "                    android:text=\"Status:Active\"\n" +
            "\n" +
            "                    android:background=\"@android:color/white\"\n" +
            "                    android:layout_marginRight=\"10dp\"\n" +
            "                    android:textColor=\"@android:color/black\"/>\n" +
            "                <TextView\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:id=\"@+id/view\"\n" +
            "                    android:layout_weight=\"1\"\n" +
            "                    android:drawableTop=\"@drawable/eye\"\n" +
            "                    android:text=\"View Image\"\n" +
            "                    android:textAlignment=\"center\"\n" +
            "                    android:layout_gravity=\"right\"\n" +
            "                    android:layout_marginLeft=\"10dp\"\n" +
            "                    android:background=\"@android:color/white\"\n" +
            "                    android:textColor=\"@android:color/holo_blue_dark\"/>\n" +
            "            </LinearLayout>\n" +
            "            <TextView\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:text=\"Remarks:A1800277\"\n" +
            "\n" +
            "                android:layout_marginLeft=\"10dp\"\n" +
            "                android:textColor=\"@android:color/black\"\n" +
            "                android:id=\"@+id/remarks\"/>\n" +
            "        </LinearLayout>\n" +
            "    </android.support.v7.widget.CardView>\n" +
            "\n" +
            "</LinearLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("activity_second.xml");

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

