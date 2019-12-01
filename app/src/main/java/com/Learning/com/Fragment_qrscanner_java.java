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

public class Fragment_qrscanner_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.Manifest;\n" +
            "import android.app.Activity;\n" +
            "import android.content.DialogInterface;\n" +
            "import android.content.Intent;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.support.annotation.NonNull;\n" +
            "import android.support.v4.app.ActivityCompat;\n" +
            "import android.support.v4.content.ContextCompat;\n" +
            "import android.support.v7.app.AlertDialog;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.blikoon.qrcodescanner.QrCodeActivity;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity{\n" +
            "\n" +
            "    Button  btnScanBarcode;\n" +
            "    int CAMERA_PERMISSION_CODE=24;\n" +
            "    private static final int REQUEST_CODE_QR_SCAN=101;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        btnScanBarcode=(Button)findViewById(R.id.btnScanBarcode);\n" +
            "        btnScanBarcode.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if(canOpenCamera()){\n" +
            "                    openCamera();\n" +
            "                }else {\n" +
            "                    requestCameraPermission();\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "    private void openCamera(){\n" +
            "        Intent intent=new Intent(MainActivity.this, QrCodeActivity.class);\n" +
            "        startActivityForResult(intent,REQUEST_CODE_QR_SCAN);\n" +
            "    }\n" +
            "    private boolean canOpenCamera(){\n" +
            "        int result= ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA);\n" +
            "        if(result==PackageManager.PERMISSION_GRANTED){\n" +
            "            return true;\n" +
            "        }\n" +
            "        return false;\n" +
            "    }\n" +
            "    private void requestCameraPermission(){\n" +
            "        if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)){\n" +
            "            Toast.makeText(this, \"Accept Permission to open camera\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},CAMERA_PERMISSION_CODE);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
            "        if(requestCode==CAMERA_PERMISSION_CODE){\n" +
            "            if(grantResults.length>0&&grantResults[0]== PackageManager.PERMISSION_GRANTED){\n" +
            "                openCamera();\n" +
            "            }else {\n" +
            "                Toast.makeText(this, \"User Denied Permisssion\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "    protected void onActivityResult(int req_code,int resultcode,Intent data){\n" +
            "        if(resultcode!= Activity.RESULT_OK){\n" +
            "            if(data==null){\n" +
            "                return;\n" +
            "            }\n" +
            "            String result=data.getStringExtra(\"com.blikoon.qrcodescanner.error_decoding_image\");\n" +
            "            if(result!=null){\n" +
            "                AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();\n" +
            "                alertDialog.setTitle(\"Scan Error\");;\n" +
            "                alertDialog.setMessage(\"QR couldn't able to scan\");\n" +
            "                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, \"OK\",\n" +
            "                        new DialogInterface.OnClickListener() {\n" +
            "                            @Override\n" +
            "                            public void onClick(DialogInterface dialog, int which) {\n" +
            "                                dialog.dismiss();\n" +
            "                            }\n" +
            "                        });\n" +
            "                alertDialog.show();\n" +
            "            }\n" +
            "            return;\n" +
            "        }\n" +
            "        if(req_code==REQUEST_CODE_QR_SCAN){\n" +
            "            if(data==null)\n" +
            "                return;\n" +
            "            String result=data.getStringExtra(\"com.blikoon.qrcodescanner.got_qr_scan_relult\");\n" +
            "\n" +
            "                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();\n" +
            "                alertDialog.setTitle(\"Scan Result\");\n" +
            "                alertDialog.setMessage(result);\n" +
            "                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, \"OK\",\n" +
            "                        new DialogInterface.OnClickListener() {\n" +
            "                            @Override\n" +
            "                            public void onClick(DialogInterface dialog, int which) {\n" +
            "                                dialog.dismiss();\n" +
            "                            }\n" +
            "                        });\n" +
            "                alertDialog.show();\n" +
            "        }\n" +
            "    }\n" +
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



