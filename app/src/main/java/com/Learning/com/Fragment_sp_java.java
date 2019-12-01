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

public class Fragment_sp_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Context;\n" +
            "import android.content.SharedPreferences;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.text.TextUtils;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.CheckBox;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    EditText et_userid, et_password;\n" +
            "    private SharedPreferences mpref;\n" +
            "    private static final String PREF_NAME = \"SP_NAME\";\n" +
            "    CheckBox checkBox;\n" +
            "    String userid, password;\n" +
            "    Button Login, forgot_password, cancel, forgot;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        et_userid = (EditText) findViewById(R.id.et_userid);\n" +
            "        et_password = (EditText) findViewById(R.id.et_password);\n" +
            "        Login = (Button) findViewById(R.id.btn_submit);\n" +
            "        checkBox=(CheckBox)findViewById(R.id.check);\n" +
            "        checkBox.setChecked(true);\n" +
            "        mpref = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);\n" +
            "        userid=mpref.getString(\"USERID\",\"\");\n" +
            "        et_userid.setText(userid);\n" +
            "        password=mpref.getString(\"PASSWORD\",\"\");\n" +
            "        et_password.setText(password);\n" +
            "        Login.setOnClickListener(new View.OnClickListener() {\n" +
            "\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Log.i(\"userid\", \"+++++++\" + userid + password);\n" +
            "                if (checkBox.isChecked() == true) {\n" +
            "                    userid = et_userid.getText().toString();\n" +
            "                    password = et_password.getText().toString();\n" +
            "                    if (TextUtils.isEmpty(userid) || TextUtils.isEmpty(password)) {\n" +
            "                        Toast.makeText(MainActivity.this, \"All Fields Must Be filled\", Toast.LENGTH_SHORT).show();\n" +
            "                    } else {\n" +
            "                        SharedPreferences.Editor editor = mpref.edit();\n" +
            "                        editor.putString(\"USERID\", userid);\n" +
            "                        editor.putString(\"PASSWORD\", password);\n" +
            "                        editor.apply();\n" +
            "                        Toast.makeText(MainActivity.this, \"Values Stored\", Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "\n" +
            "                    }\n" +
            "                }\n" +
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
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}

