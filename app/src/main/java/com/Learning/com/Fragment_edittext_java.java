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

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_edittext_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code= "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "EditText et_text;\n" +
            "Button btn;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        et_text=(EditText)findViewById(R.id.et_text);\n" +
            "\n" +
            "        btn=(Button)findViewById(R.id.btn);\n" +
            "\n" +
            "        btn.setOnClickListener(new View.OnClickListener() {\n" +
            "\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                String text=et_text.getText().toString();\n" +
            "                //it will get the entered text to string.\n" +
            "\n" +
            "                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        Button copy=(Button)view.findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code);
                clipboard.setPrimaryClip(clip);
            }
        });
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}
