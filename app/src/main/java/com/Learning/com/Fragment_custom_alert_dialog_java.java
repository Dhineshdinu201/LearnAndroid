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

public class Fragment_custom_alert_dialog_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.app.Activity;\n" +
            "import android.app.AlertDialog;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.util.Log;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ListView;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "Button button;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        button=(Button)findViewById(R.id.btn);\n" +
            "        button.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "    public void show(){\n" +
            "        Activity activity = null;\n" +
            "        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);\n" +
            "        Button close;\n" +
            "\n" +
            "        final AlertDialog alertDialog = dialogBuilder.create();\n" +
            "        LayoutInflater factory = LayoutInflater.from(this);\n" +
            "        final View vi = factory.inflate(R.layout.custom_layout_alertdialog, null);\n" +
            "        close=(Button)vi.findViewById(R.id.back);\n" +
            "        close.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "             alertDialog.cancel();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "        alertDialog.setView(vi);\n" +
            "        alertDialog.show();\n" +
            "        alertDialog.setCancelable(false);\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "}\n";
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