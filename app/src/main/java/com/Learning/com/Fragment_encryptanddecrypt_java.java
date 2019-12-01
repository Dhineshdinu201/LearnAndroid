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

public class Fragment_encryptanddecrypt_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "import id.pahlevikun.droidcrypt.DroidCrypt;\n" +
            "import id.pahlevikun.droidcrypt.model.Data;\n" +
            "import id.pahlevikun.droidcrypt.type.Algorithm;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "TextView result;\n" +
            "Button e_with,e_without,d_with,d_without;\n" +
            "EditText e_text;\n" +
            "String key=\"KEY_IN_STRING\";\n" +
            "Data encrypted=null,decrypted=null;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        result=(TextView)findViewById(R.id.result);\n" +
            "        e_with=(Button)findViewById(R.id.e_with);\n" +
            "        e_without=(Button)findViewById(R.id.e_without);\n" +
            "        d_with=(Button)findViewById(R.id.d_with);\n" +
            "        d_without=(Button)findViewById(R.id.d_without);\n" +
            "        e_text=(EditText)findViewById(R.id.et_text);\n" +
            "        e_with.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                try {\n" +
            "                    DroidCrypt droidCrypt = new DroidCrypt(MainActivity.this);\n" +
            "                    encrypted = droidCrypt.startEncryptWithBase64(key, Algorithm.MD5.getType(), e_text.getText().toString());\n" +
            "                    result.setText(encrypted.getTextInString());\n" +
            "                }catch (Exception e){\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "        e_without.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                try {\n" +
            "                    DroidCrypt droidCrypt = new DroidCrypt(MainActivity.this);\n" +
            "                    encrypted = droidCrypt.startEncryptWithoutBase64(key, Algorithm.MD5.getType(), e_text.getText().toString());\n" +
            "                    result.setText(encrypted.getTextInString());\n" +
            "                }catch (Exception e){\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "        d_with.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                try {\n" +
            "                    DroidCrypt droidCrypt = new DroidCrypt(MainActivity.this);\n" +
            "                    decrypted = droidCrypt.startDecryptWithBase64(key, Algorithm.MD5.getType(), encrypted);\n" +
            "                    result.setText(decrypted.getTextInString());\n" +
            "                }catch (Exception e){\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        d_without.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                try {\n" +
            "                    DroidCrypt droidCrypt = new DroidCrypt(MainActivity.this);\n" +
            "                    decrypted = droidCrypt.startDecryptWithoutBase64(key, Algorithm.MD5.getType(), encrypted);\n" +
            "                    result.setText(decrypted.getTextInString());\n" +
            "                }catch (Exception e){\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
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

