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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_fragment_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2,title3;
    String Code="import android.support.v4.app.Fragment;\n" +
            "import android.support.v4.app.FragmentManager;\n" +
            "import android.support.v4.app.FragmentTransaction;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    Fragment fragment=null;\n" +
            "    Button b1,b2;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        b1=(Button)findViewById(R.id.f1);\n" +
            "        b2=(Button)findViewById(R.id.f2);\n" +
            "        b1.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                fragment=new fragment_one_demo();\n" +
            "                loadFragment(fragment);\n" +
            "            }\n" +
            "        });\n" +
            "        b2.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                fragment=new fragment_two_demo();\n" +
            "                loadFragment(fragment);\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "    public void loadFragment(Fragment fragment){\n" +
            "        FragmentManager manager=getSupportFragmentManager();\n" +
            "        FragmentTransaction transaction=manager.beginTransaction();\n" +
            "        transaction.replace(R.id.fragment,fragment);\n" +
            "        transaction.commit();\n" +
            "    }\n" +
            "}\n";
    String Code2="import android.os.Bundle;\n" +
            "import android.support.annotation.Nullable;\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.LinearLayout;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class Fragment_one_demo extends Fragment {\n" +
            "    TextView text;\n" +
            "    LinearLayout ll;\n" +
            "    @Override\n" +
            "    @Nullable\n" +
            "    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {\n" +
            "        View view = inflater.inflate(R.layout.fragment_textview_demo, container, false);\n" +
            "        ll=(LinearLayout)view.findViewById(R.id.ll);\n" +
            "        ll.setBackgroundResource(R.color.colorPrimaryDark);\n" +
            "        text=(TextView)view.findViewById(R.id.text);\n" +
            "        text.setText(\"Fragment One\");\n" +
            "        return view;\n" +
            "    }\n" +
            "}\n";
    String Code3="import android.os.Bundle;\n" +
            "import android.support.annotation.Nullable;\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.LinearLayout;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class Fragment_two_demo extends Fragment {\n" +
            "    LinearLayout ll;\n" +
            "    TextView text;\n" +
            "    @Override\n" +
            "    @Nullable\n" +
            "    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {\n" +
            "        View view = inflater.inflate(R.layout.fragment_textview_demo, container, false);\n" +
            "        ll=(LinearLayout)view.findViewById(R.id.ll);\n" +
            "        ll.setBackgroundResource(R.color.colorAccent);\n" +
            "        text=(TextView)view.findViewById(R.id.text);\n" +
            "        text.setText(\"Fragment Two\");\n" +
            "        return view;\n" +
            "    }\n" +
            "}\n" +
            "\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.three_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title3=(TextView)view.findViewById(R.id.title3);
        title2.setText("Fragment_one_demo.Java");
        title3.setText("Fragment_two_demo.Java");
        WebView webView2=(WebView)view.findViewById(R.id.webview2);
        WebView webView3=(WebView)view.findViewById(R.id.webview3);
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
                ClipData clip = ClipData.newPlainText("clip", Code2);
                clipboard.setPrimaryClip(clip);
            }
        });
        Button copy3=(Button)view.findViewById(R.id.copy3);
        copy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code3);
                clipboard.setPrimaryClip(clip);
            }
        });


        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code2)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webView2);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code3)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webView3);
        return view;
    }



}

