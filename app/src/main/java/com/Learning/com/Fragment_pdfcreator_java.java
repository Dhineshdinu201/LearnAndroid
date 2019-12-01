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

public class Fragment_pdfcreator_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.Manifest;\n" +
            "import android.content.DialogInterface;\n" +
            "import android.content.Intent;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.net.Uri;\n" +
            "import android.os.Build;\n" +
            "import android.os.Bundle;\n" +
            "import android.os.Environment;\n" +
            "import android.support.v4.app.ActivityCompat;\n" +
            "import android.support.v7.app.AlertDialog;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.itextpdf.text.Document;\n" +
            "import com.itextpdf.text.DocumentException;\n" +
            "import com.itextpdf.text.Paragraph;\n" +
            "import com.itextpdf.text.pdf.PdfWriter;\n" +
            "\n" +
            "import java.io.File;\n" +
            "import java.io.FileNotFoundException;\n" +
            "import java.io.FileOutputStream;\n" +
            "import java.io.OutputStream;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    private static final String TAG = \"PdfCreatorActivity\";\n" +
            "    private EditText mContentEditText;\n" +
            "    private Button mCreateButton;\n" +
            "    private File pdfFile;\n" +
            "    final private int REQUEST_CODE_ASK_PERMISSIONS = 111;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        mContentEditText = (EditText) findViewById(R.id.edit_text_content);\n" +
            "        mCreateButton = (Button) findViewById(R.id.button_create);\n" +
            "        mCreateButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if (mContentEditText.getText().toString().isEmpty()) {\n" +
            "                    mContentEditText.setError(\"Body is empty\");\n" +
            "                    mContentEditText.requestFocus();\n" +
            "                    return;\n" +
            "                }\n" +
            "                try {\n" +
            "                    createPdfWrapper();\n" +
            "                } catch (FileNotFoundException e) {\n" +
            "                    e.printStackTrace();\n" +
            "                } catch (DocumentException e) {\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    private void createPdfWrapper() throws FileNotFoundException, DocumentException {\n" +
            "\n" +
            "        int hasWriteStoragePermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);\n" +
            "        if (hasWriteStoragePermission != PackageManager.PERMISSION_GRANTED) {\n" +
            "\n" +
            "            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
            "                if (!shouldShowRequestPermissionRationale(Manifest.permission.WRITE_CONTACTS)) {\n" +
            "                    showMessageOKCancel(\"You need to allow access to Storage\",\n" +
            "                            new DialogInterface.OnClickListener() {\n" +
            "                                @Override\n" +
            "                                public void onClick(DialogInterface dialog, int which) {\n" +
            "                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
            "                                        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},\n" +
            "                                                REQUEST_CODE_ASK_PERMISSIONS);\n" +
            "                                    }\n" +
            "                                }\n" +
            "                            });\n" +
            "                    return;\n" +
            "                }\n" +
            "\n" +
            "                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},\n" +
            "                        REQUEST_CODE_ASK_PERMISSIONS);\n" +
            "            }\n" +
            "            return;\n" +
            "        } else {\n" +
            "            createPdf();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {\n" +
            "        switch (requestCode) {\n" +
            "            case REQUEST_CODE_ASK_PERMISSIONS:\n" +
            "                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                    // Permission Granted\n" +
            "                    try {\n" +
            "                        createPdfWrapper();\n" +
            "                    } catch (FileNotFoundException e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    } catch (DocumentException e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "                } else {\n" +
            "                    // Permission Denied\n" +
            "                    Toast.makeText(this, \"WRITE_EXTERNAL Permission Denied\", Toast.LENGTH_SHORT)\n" +
            "                            .show();\n" +
            "                }\n" +
            "                break;\n" +
            "            default:\n" +
            "                super.onRequestPermissionsResult(requestCode, permissions, grantResults);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {\n" +
            "        new AlertDialog.Builder(this)\n" +
            "                .setMessage(message)\n" +
            "                .setPositiveButton(\"OK\", okListener)\n" +
            "                .setNegativeButton(\"Cancel\", null)\n" +
            "                .create()\n" +
            "                .show();\n" +
            "    }\n" +
            "\n" +
            "    private void createPdf() throws FileNotFoundException, DocumentException {\n" +
            "\n" +
            "        File docsFolder = new File(Environment.getExternalStorageDirectory() + \"/Documents\");\n" +
            "        if (!docsFolder.exists()) {\n" +
            "            docsFolder.mkdir();\n" +
            "            Log.i(TAG, \"Created a new directory for PDF\");\n" +
            "        }\n" +
            "\n" +
            "        pdfFile = new File(docsFolder.getAbsolutePath(), \"HelloWorld.pdf\");\n" +
            "        OutputStream output = new FileOutputStream(pdfFile);\n" +
            "        Document document = new Document();\n" +
            "        PdfWriter.getInstance(document, output);\n" +
            "        document.open();\n" +
            "        document.add(new Paragraph(mContentEditText.getText().toString()));\n" +
            "\n" +
            "        document.close();\n" +
            "        previewPdf();\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    private void previewPdf() {\n" +
            "\n" +
            "        PackageManager packageManager = getPackageManager();\n" +
            "        Intent testIntent = new Intent(Intent.ACTION_VIEW);\n" +
            "        testIntent.setType(\"application/pdf\");\n" +
            "        List list = packageManager.queryIntentActivities(testIntent, PackageManager.MATCH_DEFAULT_ONLY);\n" +
            "        if (list.size() > 0) {\n" +
            "            Intent intent = new Intent();\n" +
            "            intent.setAction(Intent.ACTION_VIEW);\n" +
            "            Uri uri = Uri.fromFile(pdfFile);\n" +
            "            intent.setDataAndType(uri, \"application/pdf\");\n" +
            "            startActivity(intent);\n" +
            "\n" +
            "\n" +
            "        } else {\n" +
            "\n" +
            "            Toast.makeText(this, \"Download a PDF Viewer to see the generated PDF\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n" +
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




