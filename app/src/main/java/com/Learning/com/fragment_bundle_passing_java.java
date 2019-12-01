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

public class fragment_bundle_passing_java  extends Fragment {
    TextView Title2;
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Intent;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "Button btn;\n" +
            "EditText et_text;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        et_text=(EditText)findViewById(R.id.et_text);\n" +
            "        btn=(Button)findViewById(R.id.submit);\n" +
            "        btn.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                String text=et_text.getText().toString();\n" +
            "                Intent intent=new Intent(Bundle_passing_demo.this,SecondActivity.class);\n" +
            "                intent.putExtra(\"text_sent\",text);\n" +
            "                startActivity(intent);\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "    }\n"
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
            "        try {\n" +
            "            String textt = getIntent().getStringExtra(\"text_sent\");\n" +
            "            text.setText(textt);\n" +
            "        }catch (NullPointerException e){\n" +
            "            e.printStackTrace();\n" +
            "        }catch (Exception e){\n" +
            "            e.printStackTrace();\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        WebView webview2 = (WebView)view.findViewById(R.id.webview2);
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
        Title2=(TextView)view.findViewById(R.id.title2);
        Title2.setText("SecondActivity.Java");
        Codeview.with(getActivity().getApplicationContext())
                .withCode(code2)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview2);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}

