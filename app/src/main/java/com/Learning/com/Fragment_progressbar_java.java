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

public class Fragment_progressbar_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.os.Handler;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ProgressBar;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    ProgressBar circle,horizontal;\n" +
            "    Button start,stop;\n" +
            "    int progressbarstatus=0;\n" +
            "    boolean value=false;\n" +
            "    boolean runningbefore=false;\n" +
            "    Handler progressbarHandler;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(final Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        start=(Button)findViewById(R.id.start);\n" +
            "        stop=(Button)findViewById(R.id.stop);\n" +
            "        circle=(ProgressBar)findViewById(R.id.pb_circle);\n" +
            "        horizontal=(ProgressBar)findViewById(R.id.pb_hr);\n" +
            "        horizontal.setMax(100);\n" +
            "        start.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                value=false;\n" +
            "                if(!runningbefore){\n" +
            "                    progressOperation();\n" +
            "                }else {\n" +
            "                    Toast.makeText(MainActivity.this, \"Already Running...\", Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "        stop.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                value=true;\n" +
            "                runningbefore=false;\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "    private void progressOperation(){\n" +
            "        progressbarHandler=new Handler();\n" +
            "        new Thread(new Runnable() {\n" +
            "            @Override\n" +
            "            public void run() {\n" +
            "                while (progressbarstatus < 100 && !value) {\n" +
            "                    runningbefore = true;\n" +
            "                    progressbarstatus=progressbarstatus+1;\n" +
            "                    try {\n" +
            "                        Thread.sleep(150);\n" +
            "\n" +
            "                    } catch (InterruptedException e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "\n" +
            "                    progressbarHandler.post(new Runnable() {\n" +
            "                        @Override\n" +
            "                        public void run() {\n" +
            "                            horizontal.setProgress(progressbarstatus);\n" +
            "                        }\n" +
            "                    });\n" +
            "                }\n" +
            "                if(progressbarstatus==100){\n" +
            "                    try {\n" +
            "                        Thread.sleep(1000);\n" +
            "\n" +
            "                    }catch (InterruptedException e){\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "                    horizontal.setProgress(0);\n" +
            "                    progressbarstatus=0;\n" +
            "                }\n" +
            "                runningbefore=false;\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "        }).start();\n" +
            "    }\n" +
            "\n" +
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

