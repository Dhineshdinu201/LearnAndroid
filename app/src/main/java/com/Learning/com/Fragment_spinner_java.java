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

public class Fragment_spinner_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.AdapterView;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.Spinner;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "Spinner spinner;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        spinner=(Spinner)findViewById(R.id.spinner);\n" +
            "        String[]dept={\"Alpha\",\"Beta\",\"Cupcake\",\"Donut\",\"Eclair\"};\n" +
            "        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,dept);\n" +
            "        spinner.setAdapter(adapter);\n" +
            "        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {\n" +
            "            @Override\n" +
            "            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {\n" +
            "                switch (position){\n" +
            "                    case 0:\n" +
            "                        Toast.makeText(MainActivity.this, \"Alpha\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case 1:\n" +
            "                        Toast.makeText(MainActivity.this, \"Beta\", Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "                        break;\n" +
            "                    case 2:\n" +
            "                        Toast.makeText(MainActivity.this, \"Cupcake\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case 3:\n" +
            "                        Toast.makeText(MainActivity.this, \"Donut\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case 4:\n" +
            "                        Toast.makeText(MainActivity.this, \"Eclair\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onNothingSelected(AdapterView<?> parent) {\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
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



