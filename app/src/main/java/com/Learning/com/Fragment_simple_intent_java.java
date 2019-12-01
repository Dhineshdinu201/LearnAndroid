package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_simple_intent_java  extends Fragment {
    TextView Title2;
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Intent;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    Button clickbutton;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        clickbutton=(Button)findViewById(R.id.click);\n" +
            "        clickbutton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Intent intent=new Intent(SimpleIntent_demo.this,SecondActivity.class);\n" +
            "                //SecondActivity(replace with your activity...\n" +
            "                startActivity(intent);\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n"
            ;
    String code2="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class SecondActivity extends AppCompatActivity {\n" +
            "TextView text;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_second);\n" +
            "        text=(TextView)findViewById(R.id.text);\n" +
            "\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        WebView webview2 = (WebView)view.findViewById(R.id.webview2);
        Title2=(TextView)view.findViewById(R.id.title2);
        Title2.setText("SecondActivity.Java");
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(code2)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview2);
        return view;
    }



}

