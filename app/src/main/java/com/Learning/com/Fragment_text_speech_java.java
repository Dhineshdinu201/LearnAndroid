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

public class Fragment_text_speech_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.speech.tts.TextToSpeech;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "import java.util.Locale;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    String text;\n" +
            "    TextToSpeech tts;\n" +
            "    TextView text_view;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        text_view=(TextView)findViewById(R.id.text_view);\n" +
            "        tts = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {\n" +
            "            @Override\n" +
            "            public void onInit(int status) {\n" +
            "                // TODO Auto-generated method stub\n" +
            "                if (status == TextToSpeech.SUCCESS) {\n" +
            "                    int result = tts.setLanguage(Locale.US);\n" +
            "                    if (result == TextToSpeech.LANG_MISSING_DATA ||\n" +
            "                            result == TextToSpeech.LANG_NOT_SUPPORTED) {\n" +
            "                        Log.e(\"error\", \"This Language is not supported\");\n" +
            "                    } else {\n" +
            "                        ConvertTextToSpeech();\n" +
            "                    }\n" +
            "                } else\n" +
            "                    Log.e(\"error\", \"Initilization Failed!\");\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onPause() {\n" +
            "        // TODO Auto-generated method stub\n" +
            "\n" +
            "        if (tts != null) {\n" +
            "\n" +
            "            tts.stop();\n" +
            "            tts.shutdown();\n" +
            "        }\n" +
            "        super.onPause();\n" +
            "    }\n" +
            "\n" +
            "    public void onClick(View v) {\n" +
            "\n" +
            "        ConvertTextToSpeech();\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    private void ConvertTextToSpeech() {\n" +
            "        // TODO Auto-generated method stub\n" +
            "        text = \"Hi developers\";\n" +
            "        if (text == null || \"\".equals(text)) {\n" +
            "            text = \"Content not available\";\n" +
            "            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);\n" +
            "        } else\n" +
            "            tts.speak(text + \"is saved\", TextToSpeech.QUEUE_FLUSH, null);\n" +
            "\n" +
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

