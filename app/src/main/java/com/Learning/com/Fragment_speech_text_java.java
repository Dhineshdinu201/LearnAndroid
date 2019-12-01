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

public class Fragment_speech_text_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.Manifest;\n" +
            "import android.content.ActivityNotFoundException;\n" +
            "import android.content.Intent;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.net.Uri;\n" +
            "import android.os.Build;\n" +
            "import android.provider.Settings;\n" +
            "import android.speech.RecognitionListener;\n" +
            "import android.speech.RecognizerIntent;\n" +
            "import android.speech.SpeechRecognizer;\n" +
            "import android.support.v4.content.ContextCompat;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.MotionEvent;\n" +
            "import android.view.View;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.ImageButton;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.Locale;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "ImageButton button;\n" +
            "    EditText editText;\n" +
            "    private final int REQ_CODE_SPEECH_INPUT = 100;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "         editText = findViewById(R.id.editText);\n" +
            "        button=(ImageButton)findViewById(R.id.button);\n" +
            "\n" +
            "       button.setOnClickListener(new View.OnClickListener() {\n" +
            "           @Override\n" +
            "           public void onClick(View v) {\n" +
            "               promptSpeechInput();\n" +
            "           }\n" +
            "       });\n" +
            "        checkPermission();\n" +
            "    }\n" +
            "\n" +
            "    private void checkPermission() {\n" +
            "        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
            "            if (!(ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED)) {\n" +
            "                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS,\n" +
            "                        Uri.parse(\"package:\" + getPackageName()));\n" +
            "                startActivity(intent);\n" +
            "                finish();\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "    private void promptSpeechInput() {\n" +
            "        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);\n" +
            "        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,\n" +
            "                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);\n" +
            "        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());\n" +
            "        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,\n" +
            "                getString(R.string.speech_prompt));\n" +
            "        try {\n" +
            "            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);\n" +
            "        } catch (ActivityNotFoundException a) {\n" +
            "            Toast.makeText(getApplicationContext(),\n" +
            "                    getString(R.string.speech_not_supported),\n" +
            "                    Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    \n" +
            "    @Override\n" +
            "    protected void onActivityResult(int requestCode, int resultCode, Intent data) {\n" +
            "        super.onActivityResult(requestCode, resultCode, data);\n" +
            "\n" +
            "        switch (requestCode) {\n" +
            "            case REQ_CODE_SPEECH_INPUT: {\n" +
            "                if (resultCode == RESULT_OK && null != data) {\n" +
            "\n" +
            "                    ArrayList<String> result = data\n" +
            "                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);\n" +
            "                    editText.setText(result.get(0));\n" +
            "                }\n" +
            "                break;\n" +
            "            }\n" +
            "\n" +
            "        }\n" +
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



