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

public class Fragment_expandable_re_view_xml extends Fragment implements CodeView.OnHighlightListener {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    CodeView mCodeView,mcodeview2,mcodeview3;
    TextView title2,title3;
    String Code=" <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <android.support.v7.widget.RecyclerView\n" +
            "        android:id=\"@+id/main_recycler\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\" />\n" +
            "</LinearLayout>";
    String code2="<RelativeLayout   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:orientation=\"horizontal\">\n" +
            "\n" +
            "    <LinearLayout\n" +
            "        android:id=\"@+id/lnr_1\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_centerHorizontal=\"true\">\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/txt_header_address\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:gravity=\"center\"\n" +
            "            android:text=\"Click Menu\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "    </LinearLayout>\n" +
            "\n" +
            "    <ImageView\n" +
            "        android:id=\"@+id/img_arrow\"\n" +
            "        android:layout_width=\"50dp\"\n" +
            "        android:layout_height=\"50dp\"\n" +
            "        android:layout_alignParentRight=\"true\"\n" +
            "        android:src=\"@drawable/downarrow\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/txt_header_name\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_alignParentLeft=\"true\"\n" +
            "        android:layout_alignParentStart=\"true\"\n" +
            "        android:layout_centerVertical=\"true\"\n" +
            "        android:text=\"Hii\"\n" +
            "        android:textStyle=\"bold\" />\n" +
            "</RelativeLayout>";
    String code3="<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <RelativeLayout\n" +
            "        android:id=\"@+id/rcl_header_btn\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:orientation=\"horizontal\">\n" +
            "\n" +
            "        <Button\n" +
            "            style=\"?android:attr/borderlessButtonStyle\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Cancel\" />\n" +
            "\n" +
            "        <Button\n" +
            "            style=\"?android:attr/borderlessButtonStyle\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_alignParentRight=\"true\"\n" +
            "            android:text=\"Save\" />\n" +
            "\n" +
            "    </RelativeLayout>\n" +
            "\n" +
            "    <LinearLayout\n" +
            "        android:id=\"@+id/lnr_parent\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_below=\"@+id/rcl_header_btn\"\n" +
            "        android:gravity=\"center_vertical\"\n" +
            "        android:orientation=\"vertical\">\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/edt_description\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:hint=\"Name\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/edt_address\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:hint=\"Address\" />\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:id=\"@+id/lnr_child_1\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "            <EditText\n" +
            "                android:id=\"@+id/edt_city\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_weight=\"1\"\n" +
            "                android:hint=\"City\" />\n" +
            "\n" +
            "            <EditText\n" +
            "                android:id=\"@+id/edt_state\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_weight=\"1\"\n" +
            "                android:hint=\"State\" />\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:id=\"@+id/lnr_child_2\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "            <EditText\n" +
            "                android:id=\"@+id/edt_zipcode\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_weight=\"1\"\n" +
            "                android:hint=\"Contact\" />\n" +
            "\n" +
            "            <EditText\n" +
            "                android:id=\"@+id/edt_country\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_weight=\"1\"\n" +
            "                android:hint=\"Country\" />\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "    </LinearLayout>\n" +
            "\n" +
            "    <RelativeLayout\n" +
            "        android:id=\"@+id/rcl_bottom\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_below=\"@+id/lnr_parent\">\n" +
            "\n" +
            "        <CheckBox\n" +
            "            android:id=\"@+id/chk_marked\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_alignBaseline=\"@+id/txt_type\" />\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/txt_type\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_alignBaseline=\"@+id/btn_delete\"\n" +
            "            android:layout_toRightOf=\"@+id/chk_marked\"\n" +
            "            android:gravity=\"center\"\n" +
            "            android:text=\"SET AS DEFAULT\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/btn_delete\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_alignParentRight=\"true\"\n" +
            "            android:text=\"DELETE\" />\n" +
            "\n" +
            "    </RelativeLayout>\n" +
            "</RelativeLayout>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.three_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        mcodeview3 = (CodeView)view.findViewById(R.id.codeView3);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("item_header.xml");
        title3=(TextView)view.findViewById(R.id.title3);
        title3.setText("item_content.xml");

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


