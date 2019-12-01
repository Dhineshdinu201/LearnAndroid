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

public class Fragment_AdvancedWebView_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.annotation.SuppressLint;\n" +
            "import android.content.Intent;\n" +
            "import android.graphics.Bitmap;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import im.delight.android.webview.AdvancedWebView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity implements AdvancedWebView.Listener {\n" +
            "\n" +
            "    private AdvancedWebView mWebView;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        mWebView = (AdvancedWebView) findViewById(R.id.webview);\n" +
            "        mWebView.setListener(this, this);\n" +
            "        mWebView.loadUrl(\"http://www.google.com/\");\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @SuppressLint(\"NewApi\")\n" +
            "    @Override\n" +
            "    protected void onResume() {\n" +
            "        super.onResume();\n" +
            "        mWebView.onResume();\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @SuppressLint(\"NewApi\")\n" +
            "    @Override\n" +
            "    protected void onPause() {\n" +
            "        mWebView.onPause();\n" +
            "\n" +
            "        super.onPause();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onDestroy() {\n" +
            "        mWebView.onDestroy();\n" +
            "\n" +
            "        super.onDestroy();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {\n" +
            "        super.onActivityResult(requestCode, resultCode, intent);\n" +
            "        mWebView.onActivityResult(requestCode, resultCode, intent);\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onBackPressed() {\n" +
            "        if (!mWebView.onBackPressed()) { return; }\n" +
            "\n" +
            "        super.onBackPressed();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onPageStarted(String url, Bitmap favicon) {\n" +
            "        Toast.makeText(MainActivity.this, \"Loading...\", Toast.LENGTH_SHORT).show();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onPageFinished(String url) {\n" +
            "        Toast.makeText(MainActivity.this, \"Loading Finished...\", Toast.LENGTH_SHORT).show();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onPageError(int errorCode, String description, String failingUrl) {\n" +
            "        Toast.makeText(MainActivity.this, \"An Error Occured During Loading\", Toast.LENGTH_SHORT).show();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) { }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onExternalPageRequest(String url) { }\n" +
            "\n" +
            "}";
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



