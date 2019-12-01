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

public class Fragment_bottomNavigation_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.os.Bundle;\n" +
            "import android.support.annotation.NonNull;\n" +
            "import android.support.design.widget.BottomNavigationView;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.view.MenuItem;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class BottomNavigation extends AppCompatActivity {\n" +
            "\n" +
            "    private TextView mTextMessage;\n" +
            "\n" +
            "    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener\n" +
            "            = new BottomNavigationView.OnNavigationItemSelectedListener() {\n" +
            "\n" +
            "        @Override\n" +
            "        public boolean onNavigationItemSelected(@NonNull MenuItem item) {\n" +
            "            switch (item.getItemId()) {\n" +
            "                case R.id.navigation_home:\n" +
            "                    mTextMessage.setText(R.string.title_home);\n" +
            "                    return true;\n" +
            "                case R.id.navigation_dashboard:\n" +
            "                    mTextMessage.setText(R.string.title_dashboard);\n" +
            "                    return true;\n" +
            "                case R.id.navigation_notifications:\n" +
            "                    mTextMessage.setText(R.string.title_notifications);\n" +
            "                    return true;\n" +
            "                case R.id.demo:\n" +
            "                    mTextMessage.setText(\"Demo\");\n" +
            "                    return true;\n" +
            "            }\n" +
            "            return false;\n" +
            "        }\n" +
            "    };\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_bottom_navigation);\n" +
            "\n" +
            "        mTextMessage = (TextView) findViewById(R.id.message);\n" +
            "        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);\n" +
            "        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);\n" +
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

