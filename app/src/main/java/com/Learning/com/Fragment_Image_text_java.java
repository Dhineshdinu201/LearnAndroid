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

public class Fragment_Image_text_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="\n" +
            "import android.Manifest;\n" +
            "import android.content.Context;\n" +
            "import android.content.Intent;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.graphics.Bitmap;\n" +
            "import android.graphics.BitmapFactory;\n" +
            "import android.net.Uri;\n" +
            "import android.os.Bundle;\n" +
            "import android.os.Environment;\n" +
            "import android.provider.MediaStore;\n" +
            "import android.support.annotation.NonNull;\n" +
            "import android.support.v4.app.ActivityCompat;\n" +
            "import android.support.v4.content.FileProvider;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.util.Log;\n" +
            "import android.util.SparseArray;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.google.android.gms.vision.Frame;\n" +
            "import com.google.android.gms.vision.text.Text;\n" +
            "import com.google.android.gms.vision.text.TextBlock;\n" +
            "import com.google.android.gms.vision.text.TextRecognizer;\n" +
            "\n" +
            "import java.io.File;\n" +
            "import java.io.FileNotFoundException;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    private static final String LOG_TAG = \"Text API\";\n" +
            "    private static final int PHOTO_REQUEST = 10;\n" +
            "    private TextView scanResults;\n" +
            "    private Uri imageUri;\n" +
            "    private TextRecognizer detector;\n" +
            "    private static final int REQUEST_WRITE_PERMISSION = 20;\n" +
            "    private static final String SAVED_INSTANCE_URI = \"uri\";\n" +
            "    private static final String SAVED_INSTANCE_RESULT = \"result\";\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        Button button = (Button) findViewById(R.id.button);\n" +
            "        scanResults = (TextView) findViewById(R.id.results);\n" +
            "\n" +
            "        if (savedInstanceState != null) {\n" +
            "            imageUri = Uri.parse(savedInstanceState.getString(SAVED_INSTANCE_URI));\n" +
            "            scanResults.setText(savedInstanceState.getString(SAVED_INSTANCE_RESULT));\n" +
            "        }\n" +
            "        detector = new TextRecognizer.Builder(getApplicationContext()).build();\n" +
            "        button.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                ActivityCompat.requestPermissions(MainActivity.this, new\n" +
            "                        String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_WRITE_PERMISSION);\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
            "        super.onRequestPermissionsResult(requestCode, permissions, grantResults);\n" +
            "        switch (requestCode) {\n" +
            "            case REQUEST_WRITE_PERMISSION:\n" +
            "                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                    takePicture();\n" +
            "                } else {\n" +
            "                    Toast.makeText(MainActivity.this, \"Permission Denied!\", Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onActivityResult(int requestCode, int resultCode, Intent data) {\n" +
            "        if (requestCode == PHOTO_REQUEST && resultCode == RESULT_OK) {\n" +
            "            launchMediaScanIntent();\n" +
            "            try {\n" +
            "                Bitmap bitmap = decodeBitmapUri(this, imageUri);\n" +
            "                if (detector.isOperational() && bitmap != null) {\n" +
            "                    Frame frame = new Frame.Builder().setBitmap(bitmap).build();\n" +
            "                    SparseArray<TextBlock> textBlocks = detector.detect(frame);\n" +
            "                    String blocks = \"\";\n" +
            "                    String lines = \"\";\n" +
            "                    String words = \"\";\n" +
            "                    for (int index = 0; index < textBlocks.size(); index++) {\n" +
            "                        //extract scanned text blocks here\n" +
            "                        TextBlock tBlock = textBlocks.valueAt(index);\n" +
            "                        blocks = blocks + tBlock.getValue() + \"\\n\" + \"\\n\";\n" +
            "                        for (Text line : tBlock.getComponents()) {\n" +
            "                            //extract scanned text lines here\n" +
            "                            lines = lines + line.getValue() + \"\\n\";\n" +
            "                            for (Text element : line.getComponents()) {\n" +
            "                                //extract scanned text words here\n" +
            "                                words = words + element.getValue() + \", \";\n" +
            "                            }\n" +
            "                        }\n" +
            "                    }\n" +
            "                    if (textBlocks.size() == 0) {\n" +
            "                        scanResults.setText(\"Scan Failed: Found nothing to scan\");\n" +
            "                    } else {\n" +
            "\n" +
            "                        scanResults.setText(scanResults.getText() + \"Words: \" + \"\\n\");\n" +
            "                        scanResults.setText(scanResults.getText() + words + \"\\n\");\n" +
            "                        \n" +
            "                    }\n" +
            "                } else {\n" +
            "                    scanResults.setText(\"Could not set up the detector!\");\n" +
            "                }\n" +
            "            } catch (Exception e) {\n" +
            "                Toast.makeText(this, \"Failed to load Image\", Toast.LENGTH_SHORT)\n" +
            "                        .show();\n" +
            "                Log.e(LOG_TAG, e.toString());\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private void takePicture() {\n" +
            "        scanResults.setText(\"\");\n" +
            "        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
            "        File photo = new File(Environment.getExternalStorageDirectory(), \"picture.jpg\");\n" +
            "        imageUri = FileProvider.getUriForFile(MainActivity.this,\n" +
            "                BuildConfig.APPLICATION_ID + \".provider\", photo);\n" +
            "        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);\n" +
            "        startActivityForResult(intent, PHOTO_REQUEST);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onSaveInstanceState(Bundle outState) {\n" +
            "        if (imageUri != null) {\n" +
            "            outState.putString(SAVED_INSTANCE_URI, imageUri.toString());\n" +
            "            outState.putString(SAVED_INSTANCE_RESULT, scanResults.getText().toString());\n" +
            "        }\n" +
            "        super.onSaveInstanceState(outState);\n" +
            "    }\n" +
            "\n" +
            "    private void launchMediaScanIntent() {\n" +
            "        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);\n" +
            "        mediaScanIntent.setData(imageUri);\n" +
            "        this.sendBroadcast(mediaScanIntent);\n" +
            "    }\n" +
            "\n" +
            "    private Bitmap decodeBitmapUri(Context ctx, Uri uri) throws FileNotFoundException {\n" +
            "        int targetW = 600;\n" +
            "        int targetH = 600;\n" +
            "        BitmapFactory.Options bmOptions = new BitmapFactory.Options();\n" +
            "        bmOptions.inJustDecodeBounds = true;\n" +
            "        BitmapFactory.decodeStream(ctx.getContentResolver().openInputStream(uri), null, bmOptions);\n" +
            "        int photoW = bmOptions.outWidth;\n" +
            "        int photoH = bmOptions.outHeight;\n" +
            "\n" +
            "        int scaleFactor = Math.min(photoW / targetW, photoH / targetH);\n" +
            "        bmOptions.inJustDecodeBounds = false;\n" +
            "        bmOptions.inSampleSize = scaleFactor;\n" +
            "\n" +
            "        return BitmapFactory.decodeStream(ctx.getContentResolver()\n" +
            "                .openInputStream(uri), null, bmOptions);\n" +
            "    }\n" +
            "}"
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

