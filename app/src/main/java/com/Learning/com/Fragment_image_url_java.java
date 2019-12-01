package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_image_url_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.app.Activity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.ImageView;\n" +
            "\n" +
            "import com.master.glideimageview.GlideImageView;\n" +
            "\n" +
            "public class MainActivity extends Activity {\n" +
            "    GlideImageView glideImageView;\n" +
            "    @Override\n" +
            "    public void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        glideImageView = (GlideImageView) findViewById(R.id.glide_image_view);\n" +
            "        glideImageView.loadImageUrl(\"https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Pizigani_1367_Chart_10MB.jpg/800px-Pizigani_1367_Chart_10MB.jpg\");\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "}\n"
            ;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}

