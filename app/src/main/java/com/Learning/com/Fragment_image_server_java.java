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

public class Fragment_image_server_java extends Fragment {
    TextView Title2;
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.app.ProgressDialog;\n" +
            "import android.content.Intent;\n" +
            "import android.graphics.Bitmap;\n" +
            "import android.app.Activity;\n" +
            "import android.os.AsyncTask;\n" +
            "import android.os.Bundle;\n" +
            "import android.util.Base64;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.ImageView;\n" +
            "import android.net.Uri;\n" +
            "import android.provider.MediaStore;\n" +
            "import android.widget.Toast;\n" +
            "import java.io.ByteArrayOutputStream;\n" +
            "import java.io.IOException;\n" +
            "import java.util.HashMap;\n" +
            "import java.io.InputStreamReader;\n" +
            "import java.io.OutputStream;\n" +
            "import java.util.HashMap;\n" +
            "import java.io.BufferedReader;\n" +
            "import java.net.URLEncoder;\n" +
            "import java.util.Map;\n" +
            "import java.io.BufferedWriter;\n" +
            "import java.io.OutputStreamWriter;\n" +
            "import java.net.URL;\n" +
            "import javax.net.ssl.HttpsURLConnection;\n" +
            "import java.io.UnsupportedEncodingException;\n" +
            "import java.net.HttpURLConnection;\n" +
            "\n" +
            "import okhttp3.OkHttpClient;\n" +
            "import okhttp3.Request;\n" +
            "import okhttp3.Response;\n" +
            "\n" +
            "public class MainActivity extends Activity {\n" +
            "\n" +
            "    Button GetImageFromGalleryButton, UploadImageOnServerButton;\n" +
            "\n" +
            "    ImageView ShowSelectedImage;\n" +
            "\n" +
            "    EditText GetImageName;\n" +
            "\n" +
            "    Bitmap FixBitmap;\n" +
            "\n" +
            "    String ImageTag = \"image_tag\" ;\n" +
            "\n" +
            "    String ImageName = \"image_data\" ;\n" +
            "\n" +
            "    String ServerUploadPath =\"http://192.168.1.7/limstest/index.php/api/upload_payment_documents\" ;\n" +
            "\n" +
            "    ProgressDialog progressDialog ;\n" +
            "\n" +
            "    ByteArrayOutputStream byteArrayOutputStream ;\n" +
            "\n" +
            "    byte[] byteArray ;\n" +
            "\n" +
            "    String ConvertImage ;\n" +
            "\n" +
            "    String GetImageNameFromEditText;\n" +
            "\n" +
            "    HttpURLConnection httpURLConnection ;\n" +
            "\n" +
            "    URL url;\n" +
            "\n" +
            "    OutputStream outputStream;\n" +
            "\n" +
            "    BufferedWriter bufferedWriter ;\n" +
            "\n" +
            "    int RC ;\n" +
            "\n" +
            "    BufferedReader bufferedReader ;\n" +
            "\n" +
            "    StringBuilder stringBuilder;\n" +
            "\n" +
            "    boolean check = true;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        GetImageFromGalleryButton = (Button)findViewById(R.id.button);\n" +
            "\n" +
            "        UploadImageOnServerButton = (Button)findViewById(R.id.button2);\n" +
            "\n" +
            "        ShowSelectedImage = (ImageView)findViewById(R.id.imageView);\n" +
            "\n" +
            "        GetImageName = (EditText)findViewById(R.id.editText);\n" +
            "\n" +
            "\n" +
            "        byteArrayOutputStream = new ByteArrayOutputStream();\n" +
            "\n" +
            "        GetImageFromGalleryButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "\n" +
            "                Intent intent = new Intent();\n" +
            "\n" +
            "                intent.setType(\"image/*\");\n" +
            "\n" +
            "                intent.setAction(Intent.ACTION_GET_CONTENT);\n" +
            "\n" +
            "                startActivityForResult(Intent.createChooser(intent, \"Select Image From Gallery\"), 1);\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "        UploadImageOnServerButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "\n" +
            "                GetImageNameFromEditText = GetImageName.getText().toString();\n" +
            "\n" +
            "                UploadImageToServer();\n" +
            "                Intent intent=new Intent(MainActivity.this,MainActivity.class);\n" +
            "                startActivity(intent);\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onActivityResult(int RC, int RQC, Intent I) {\n" +
            "\n" +
            "        super.onActivityResult(RC, RQC, I);\n" +
            "\n" +
            "        if (RC == 1 && RQC == RESULT_OK && I != null && I.getData() != null) {\n" +
            "\n" +
            "            Uri uri = I.getData();\n" +
            "\n" +
            "            try {\n" +
            "\n" +
            "                FixBitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);\n" +
            "\n" +
            "                ShowSelectedImage.setImageBitmap(FixBitmap);\n" +
            "\n" +
            "            } catch (IOException e) {\n" +
            "\n" +
            "                e.printStackTrace();\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void UploadImageToServer(){\n" +
            "        try {\n" +
            "\n" +
            "            FixBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);\n" +
            "\n" +
            "            byteArray = byteArrayOutputStream.toByteArray();\n" +
            "\n" +
            "            ConvertImage = Base64.encodeToString(byteArray, Base64.DEFAULT);\n" +
            "\n" +
            "            class AsyncTaskUploadClass extends AsyncTask<Void, Void, String> {\n" +
            "\n" +
            "                @Override\n" +
            "                protected void onPreExecute() {\n" +
            "\n" +
            "                    super.onPreExecute();\n" +
            "\n" +
            "                    progressDialog = ProgressDialog.show(MainActivity.this, \"Image is Uploading\", \"Please Wait\", false, false);\n" +
            "                }\n" +
            "\n" +
            "                @Override\n" +
            "                protected void onPostExecute(String string1) {\n" +
            "\n" +
            "                    super.onPostExecute(string1);\n" +
            "                    Log.i(\"postexe\",\"******\"+string1);\n" +
            "\n" +
            "                    progressDialog.dismiss();\n" +
            "\n" +
            "                    Toast.makeText(MainActivity.this, string1 + \"response\", Toast.LENGTH_LONG).show();\n" +
            "                }\n" +
            "\n" +
            "                @Override\n" +
            "                protected String doInBackground(Void... params) {\n" +
            "\n" +
            "                    ImageProcessClass imageProcessClass = new ImageProcessClass();\n" +
            "\n" +
            "                    HashMap<String, String> HashMapParams = new HashMap<String, String>();\n" +
            "\n" +
            "                    HashMapParams.put(ImageTag, GetImageNameFromEditText);\n" +
            "\n" +
            "                    HashMapParams.put(ImageName, \"data:image/jpeg;base64,\"+ConvertImage);\n" +
            "                    Log.i(\"base64\",\"************\"+ConvertImage);\n" +
            "                    OkHttpClient client=new OkHttpClient();\n" +
            "                    Request request=new Request.Builder()\n" +
            "                            .url(ServerUploadPath)\n" +
            "                            .build();\n" +
            "                    try {\n" +
            "                        Response response=client.newCall(request).execute();\n" +
            "                        Log.i(\"res1\",\"+++++++\"+response);\n" +
            "                        Log.i(\"res2\",\"********\"+response.body().string());\n" +
            "                    } catch (IOException e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "\n" +
            "\n" +
            "                    String FinalData = imageProcessClass.ImageHttpRequest(ServerUploadPath, HashMapParams);\n" +
            "\n" +
            "                    return FinalData;\n" +
            "                }\n" +
            "            }\n" +
            "            AsyncTaskUploadClass AsyncTaskUploadClassOBJ = new AsyncTaskUploadClass();\n" +
            "            AsyncTaskUploadClassOBJ.execute();\n" +
            "        }catch (NullPointerException e){\n" +
            "            Toast.makeText(this, \"Please select the image\", Toast.LENGTH_SHORT).show();\n" +
            "            e.printStackTrace();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public class ImageProcessClass{\n" +
            "\n" +
            "        public String ImageHttpRequest(String requestURL,HashMap<String, String> PData) {\n" +
            "\n" +
            "            StringBuilder stringBuilder = new StringBuilder();\n" +
            "\n" +
            "            try {\n" +
            "                url = new URL(requestURL);\n" +
            "\n" +
            "                httpURLConnection = (HttpURLConnection) url.openConnection();\n" +
            "\n" +
            "                httpURLConnection.setReadTimeout(20000);\n" +
            "\n" +
            "                httpURLConnection.setConnectTimeout(20000);\n" +
            "\n" +
            "                httpURLConnection.setRequestMethod(\"POST\");\n" +
            "\n" +
            "                httpURLConnection.setDoInput(true);\n" +
            "\n" +
            "                httpURLConnection.setDoOutput(true);\n" +
            "\n" +
            "                outputStream = httpURLConnection.getOutputStream();\n" +
            "\n" +
            "                bufferedWriter = new BufferedWriter(\n" +
            "\n" +
            "                        new OutputStreamWriter(outputStream, \"UTF-8\"));\n" +
            "\n" +
            "                bufferedWriter.write(bufferedWriterDataFN(PData));\n" +
            "\n" +
            "                bufferedWriter.flush();\n" +
            "\n" +
            "                bufferedWriter.close();\n" +
            "\n" +
            "                outputStream.close();\n" +
            "\n" +
            "                RC = httpURLConnection.getResponseCode();\n" +
            "\n" +
            "                if (RC == HttpsURLConnection.HTTP_OK) {\n" +
            "\n" +
            "                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));\n" +
            "\n" +
            "                    stringBuilder = new StringBuilder();\n" +
            "\n" +
            "                    String RC2;\n" +
            "\n" +
            "                    while ((RC2 = bufferedReader.readLine()) != null){\n" +
            "\n" +
            "                        stringBuilder.append(RC2);\n" +
            "                    }\n" +
            "                }\n" +
            "\n" +
            "            } catch (Exception e) {\n" +
            "                e.printStackTrace();\n" +
            "            }\n" +
            "            return stringBuilder.toString();\n" +
            "        }\n" +
            "\n" +
            "        private String bufferedWriterDataFN(HashMap<String, String> HashMapParams) throws UnsupportedEncodingException {\n" +
            "\n" +
            "            stringBuilder = new StringBuilder();\n" +
            "\n" +
            "            for (Map.Entry<String, String> KEY : HashMapParams.entrySet()) {\n" +
            "                if (check)\n" +
            "                    check = false;\n" +
            "                else\n" +
            "                    stringBuilder.append(\"&\");\n" +
            "\n" +
            "                stringBuilder.append(URLEncoder.encode(KEY.getKey(), \"UTF-8\"));\n" +
            "\n" +
            "                stringBuilder.append(\"=\");\n" +
            "\n" +
            "                stringBuilder.append(URLEncoder.encode(KEY.getValue(), \"UTF-8\"));\n" +
            "            }\n" +
            "\n" +
            "            return stringBuilder.toString();\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "}\n"
            ;
    String code2="public class URL {\n" +
            "\n" +
            "        private static final String ROOT_URL = \"http://192.168.101.1/MyApi/Api.php?apicall=\";\n" +
            "        public static final String UPLOAD_URL = ROOT_URL + \"uploadpic\";\n" +
            "        public static final String GET_PICS_URL = ROOT_URL + \"getpics\";\n" +
            "\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        WebView webview2 = (WebView)view.findViewById(R.id.webview2);
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
                ClipData clip = ClipData.newPlainText("clip", code2);
                clipboard.setPrimaryClip(clip);
            }
        });
        Title2=(TextView)view.findViewById(R.id.title2);
        Title2.setText("SecondActivity.Java");
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(code2)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview2);
        return view;
    }



}


