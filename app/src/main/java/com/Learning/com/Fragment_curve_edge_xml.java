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

public class Fragment_curve_edge_xml  extends Fragment implements CodeView.OnHighlightListener {
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
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/curve\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Curve Edge\"\n" +
            "        android:textColor=\"@android:color/white\"\n" +
            "        android:textAlignment=\"center\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"100dp\"\n" +
            "        android:background=\"@drawable/curve_edge\"/>\n" +
            "\n" +
            "</LinearLayout>";
    String code2="<selector xmlns:android=\"http://schemas.android.com/apk/res/android\" >\n" +
            "    <item android:state_pressed=\"true\" >\n" +
            "        <shape android:shape=\"rectangle\"  >\n" +
            "            <corners android:radius=\"3dip\" />\n" +
            "            <stroke android:width=\"1dip\" android:color=\"#5e7974\" />\n" +
            "            <gradient android:angle=\"-90\" android:startColor=\"#345953\" android:endColor=\"#689a92\"  />\n" +
            "        </shape>\n" +
            "    </item>\n" +
            "    <item android:state_focused=\"true\">\n" +
            "        <shape android:shape=\"rectangle\"  >\n" +
            "            <corners android:radius=\"3dip\" />\n" +
            "            <stroke android:width=\"1dip\" android:color=\"#5e7974\" />\n" +
            "            <solid android:color=\"#58857e\"/>\n" +
            "        </shape>\n" +
            "    </item>\n" +
            "    <item >\n" +
            "        <shape android:shape=\"rectangle\"  >\n" +
            "            <corners android:radius=\"3dip\" />\n" +
            "            <stroke android:width=\"1dip\" android:color=\"#5e7974\" />\n" +
            "            <gradient android:angle=\"-90\" android:startColor=\"#8dbab3\" android:endColor=\"#58857e\" />\n" +
            "        </shape>\n" +
            "    </item>\n" +
            "</selector>";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview_xml, container, false);
        mCodeView = (CodeView)view.findViewById(R.id.codeView);
        mcodeview2 = (CodeView)view.findViewById(R.id.codeView2);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("curve_edge.xml");
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

