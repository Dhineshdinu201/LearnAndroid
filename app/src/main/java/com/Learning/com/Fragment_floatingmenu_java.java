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

public class Fragment_floatingmenu_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Context;\n" +
            "import android.os.Vibrator;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "import com.github.clans.fab.FloatingActionButton;\n" +
            "import com.github.clans.fab.FloatingActionMenu;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    FloatingActionMenu menu;\n" +
            "    FloatingActionButton b2,b3,b4,b5;\n" +
            "    TextView textView;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        textView=(TextView)findViewById(R.id.text);\n" +
            "        textView.setText(\"Click the below menu\");\n" +
            "        menu = (FloatingActionMenu) findViewById(R.id.menu);\n" +
            "        menu.setClosedOnTouchOutside(true);\n" +
            "        menu.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {\n" +
            "            @Override\n" +
            "            public void onMenuToggle(boolean opened) {\n" +
            "                Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);\n" +
            "                if (opened) {\n" +
            "                    if (vibrator != null) {\n" +
            "                        vibrator.vibrate(50);\n" +
            "                    }\n" +
            "                } else {\n" +
            "                    if (vibrator != null) {\n" +
            "                        vibrator.vibrate(50);\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        b2 = (FloatingActionButton) findViewById(R.id.b2);\n" +
            "        b3 = (FloatingActionButton) findViewById(R.id.b3);\n" +
            "        b4 = (FloatingActionButton) findViewById(R.id.b4);\n" +
            "        b5 = (FloatingActionButton) findViewById(R.id.b5);\n" +
            "\n" +
            "        b2.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "            textView.setText(\"button2\");\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        b3.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                textView.setText(\"button3\");\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        b4.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                textView.setText(\"button4\");\n" +
            "            }\n" +
            "        });\n" +
            "        b5.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                textView.setText(\"button5\");\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "        //**********************bottom nav click listener************************\n" +
            "\n" +
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



