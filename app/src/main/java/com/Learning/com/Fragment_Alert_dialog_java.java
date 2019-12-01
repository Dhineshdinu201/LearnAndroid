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

public class Fragment_Alert_dialog_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Context;\n" +
            "import android.content.DialogInterface;\n" +
            "import android.content.Intent;\n" +
            "import android.support.v7.app.AlertDialog;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    Button click_alert;\n" +
            "    Context context = this;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        click_alert = (Button) findViewById(R.id.click_alert);\n" +
            "        click_alert.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                final AlertDialog.Builder builder = new AlertDialog.Builder(context);\n" +
            "                builder.setCancelable(false);\n" +
            "                builder.setTitle(\"Exit\");\n" +
            "                builder.setMessage(\"Are you want to Logout?\");\n" +
            "                builder.setPositiveButton(\"YES\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int which) {\n" +
            "\n" +
            "                        Toast.makeText(context, \"Alert yes clicked\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                });\n" +
            "                builder.setNegativeButton(\"NO\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int which) {\n" +
            "                        dialog.dismiss();\n" +
            "                    }\n" +
            "                });\n" +
            "                builder.create().show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n"
            ;
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

