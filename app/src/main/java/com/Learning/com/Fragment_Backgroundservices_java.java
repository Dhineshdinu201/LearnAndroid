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

public class Fragment_Backgroundservices_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2;
    String Code="import android.content.Intent;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "Button start,stop;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        start=(Button)findViewById(R.id.start);\n" +
            "        stop=(Button)findViewById(R.id.stop);\n" +
            "        start.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                startService(new Intent(getBaseContext(),MyBackgroundService.class));\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "        stop.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                stopService(new Intent(getBaseContext(),MyBackgroundService.class));\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";
    String Code2="import android.app.Service;\n" +
            "import android.content.Intent;\n" +
            "import android.media.MediaPlayer;\n" +
            "import android.os.IBinder;\n" +
            "import android.provider.Settings;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MyBackgroundService extends Service {\n" +
            "    private MediaPlayer mediaPlayer;\n" +
            "    public MyBackgroundService() {\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public IBinder onBind(Intent intent) {\n" +
            "        // TODO: Return the communication channel to the service.\n" +
            "        throw new UnsupportedOperationException(\"Not yet implemented\");\n" +
            "    }\n" +
            "    @Override\n" +
            "    public void onCreate() {\n" +
            "        Toast.makeText(this, \"Invoke background service onCreate method.\", Toast.LENGTH_LONG).show();\n" +
            "        super.onCreate();\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public int onStartCommand(Intent intent, int flags, int startId) {\n" +
            "        mediaPlayer=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);\n" +
            "        mediaPlayer.setLooping(true);\n" +
            "        mediaPlayer.start();\n" +
            "        Toast.makeText(this, \"Invoke background service onStartCommand method.\", Toast.LENGTH_LONG).show();\n" +
            "        return START_STICKY;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onDestroy() {\n" +
            "        super.onDestroy();\n" +
            "        Toast.makeText(this, \"Invoke background service onDestroy method.\", Toast.LENGTH_LONG).show();\n" +
            "        mediaPlayer.stop();\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("MyBackgroundService.Java");
        WebView webView2=(WebView)view.findViewById(R.id.webview2);
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
                ClipData clip = ClipData.newPlainText("clip", Code2);
                clipboard.setPrimaryClip(clip);
            }
        });
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code2)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webView2);
        return view;
    }



}


