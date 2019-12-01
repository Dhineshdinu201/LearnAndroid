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

public class Fragment_gridview_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2;
    String Code="import android.app.KeyguardManager;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.hardware.fingerprint.FingerprintManager;\n" +
            "import android.Manifest;\n" +
            "import android.os.Build;\n" +
            "import android.os.Bundle;\n" +
            "import android.security.keystore.KeyGenParameterSpec;\n" +
            "import android.security.keystore.KeyPermanentlyInvalidatedException;\n" +
            "import android.security.keystore.KeyProperties;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.support.v4.app.ActivityCompat;\n" +
            "import android.widget.TextView;\n" +
            "import java.io.IOException;\n" +
            "import java.security.InvalidAlgorithmParameterException;\n" +
            "import java.security.InvalidKeyException;\n" +
            "import java.security.KeyStore;\n" +
            "import java.security.KeyStoreException;\n" +
            "import java.security.NoSuchAlgorithmException;\n" +
            "import java.security.NoSuchProviderException;\n" +
            "import java.security.UnrecoverableKeyException;\n" +
            "import java.security.cert.CertificateException;\n" +
            "import javax.crypto.Cipher;\n" +
            "import javax.crypto.KeyGenerator;\n" +
            "import javax.crypto.NoSuchPaddingException;\n" +
            "import javax.crypto.SecretKey;\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    // Declare a string variable for the key we’re going to use in our fingerprint authentication\n" +
            "    private static final String KEY_NAME = \"yourKey\";\n" +
            "    private Cipher cipher;\n" +
            "    private KeyStore keyStore;\n" +
            "    private KeyGenerator keyGenerator;\n" +
            "    private TextView textView;\n" +
            "    private FingerprintManager.CryptoObject cryptoObject;\n" +
            "    private FingerprintManager fingerprintManager;\n" +
            "    private KeyguardManager keyguardManager;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        // If you’ve set your app’s minSdkVersion to anything lower than 23, then you’ll need to verify that the device is running Marshmallow\n" +
            "        // or higher before executing any fingerprint-related code\n" +
            "        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
            "            //Get an instance of KeyguardManager and FingerprintManager//\n" +
            "            keyguardManager =\n" +
            "                    (KeyguardManager) getSystemService(KEYGUARD_SERVICE);\n" +
            "            fingerprintManager =\n" +
            "                    (FingerprintManager) getSystemService(FINGERPRINT_SERVICE);\n" +
            "\n" +
            "            textView = (TextView) findViewById(R.id.textview);\n" +
            "\n" +
            "            //Check whether the device has a fingerprint sensor//\n" +
            "            if (!fingerprintManager.isHardwareDetected()) {\n" +
            "                // If a fingerprint sensor isn’t available, then inform the user that they’ll be unable to use your app’s fingerprint functionality//\n" +
            "                textView.setText(\"Your device doesn't support fingerprint authentication\");\n" +
            "            }\n" +
            "            //Check whether the user has granted your app the USE_FINGERPRINT permission//\n" +
            "            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED) {\n" +
            "                // If your app doesn't have this permission, then display the following text//\n" +
            "                textView.setText(\"Please enable the fingerprint permission\");\n" +
            "            }\n" +
            "\n" +
            "            //Check that the user has registered at least one fingerprint//\n" +
            "            if (!fingerprintManager.hasEnrolledFingerprints()) {\n" +
            "                // If the user hasn’t configured any fingerprints, then display the following message//\n" +
            "                textView.setText(\"No fingerprint configured. Please register at least one fingerprint in your device's Settings\");\n" +
            "            }\n" +
            "\n" +
            "            //Check that the lockscreen is secured//\n" +
            "            if (!keyguardManager.isKeyguardSecure()) {\n" +
            "                // If the user hasn’t secured their lockscreen with a PIN password or pattern, then display the following text//\n" +
            "                textView.setText(\"Please enable lockscreen security in your device's Settings\");\n" +
            "            } else {\n" +
            "                try {\n" +
            "\n" +
            "                    generateKey();\n" +
            "                } catch (FingerprintException e) {\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "\n" +
            "                if (initCipher()) {\n" +
            "                    //If the cipher is initialized successfully, then create a CryptoObject instance//\n" +
            "                    cryptoObject = new FingerprintManager.CryptoObject(cipher);\n" +
            "\n" +
            "                    // Here, I’m referencing the FingerprintHandler class that we’ll create in the next section. This class will be responsible\n" +
            "                    // for starting the authentication process (via the startAuth method) and processing the authentication process events//\n" +
            "                    FingerprintHandler helper = new FingerprintHandler(this);\n" +
            "                    helper.startAuth(fingerprintManager, cryptoObject);\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "//Create the generateKey method that we’ll use to gain access to the Android keystore and generate the encryption key//\n" +
            "\n" +
            "    private void generateKey() throws FingerprintException {\n" +
            "        try {\n" +
            "            // Obtain a reference to the Keystore using the standard Android keystore container identifier (“AndroidKeystore”)//\n" +
            "            keyStore = KeyStore.getInstance(\"AndroidKeyStore\");\n" +
            "\n" +
            "            //Generate the key//\n" +
            "            keyGenerator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, \"AndroidKeyStore\");\n" +
            "\n" +
            "            //Initialize an empty KeyStore//\n" +
            "            keyStore.load(null);\n" +
            "\n" +
            "            //Initialize the KeyGenerator//\n" +
            "            keyGenerator.init(new\n" +
            "\n" +
            "                    //Specify the operation(s) this key can be used for//\n" +
            "                    KeyGenParameterSpec.Builder(KEY_NAME,\n" +
            "                    KeyProperties.PURPOSE_ENCRYPT |\n" +
            "                            KeyProperties.PURPOSE_DECRYPT)\n" +
            "                    .setBlockModes(KeyProperties.BLOCK_MODE_CBC)\n" +
            "\n" +
            "                    //Configure this key so that the user has to confirm their identity with a fingerprint each time they want to use it//\n" +
            "                    .setUserAuthenticationRequired(true)\n" +
            "                    .setEncryptionPaddings(\n" +
            "                            KeyProperties.ENCRYPTION_PADDING_PKCS7)\n" +
            "                    .build());\n" +
            "\n" +
            "            //Generate the key//\n" +
            "            keyGenerator.generateKey();\n" +
            "\n" +
            "        } catch (KeyStoreException\n" +
            "                | NoSuchAlgorithmException\n" +
            "                | NoSuchProviderException\n" +
            "                | InvalidAlgorithmParameterException\n" +
            "                | CertificateException\n" +
            "                | IOException exc) {\n" +
            "            exc.printStackTrace();\n" +
            "            throw new FingerprintException(exc);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    //Create a new method that we’ll use to initialize our cipher//\n" +
            "    public boolean initCipher() {\n" +
            "        try {\n" +
            "            //Obtain a cipher instance and configure it with the properties required for fingerprint authentication//\n" +
            "            cipher = Cipher.getInstance(\n" +
            "                    KeyProperties.KEY_ALGORITHM_AES + \"/\"\n" +
            "                            + KeyProperties.BLOCK_MODE_CBC + \"/\"\n" +
            "                            + KeyProperties.ENCRYPTION_PADDING_PKCS7);\n" +
            "        } catch (NoSuchAlgorithmException |\n" +
            "                NoSuchPaddingException e) {\n" +
            "            throw new RuntimeException(\"Failed to get Cipher\", e);\n" +
            "        }\n" +
            "\n" +
            "        try {\n" +
            "            keyStore.load(null);\n" +
            "            SecretKey key = (SecretKey) keyStore.getKey(KEY_NAME,\n" +
            "                    null);\n" +
            "            cipher.init(Cipher.ENCRYPT_MODE, key);\n" +
            "            //Return true if the cipher has been initialized successfully//\n" +
            "            return true;\n" +
            "        } catch (KeyPermanentlyInvalidatedException e) {\n" +
            "\n" +
            "            //Return false if cipher initialization failed//\n" +
            "            return false;\n" +
            "        } catch (KeyStoreException | CertificateException\n" +
            "                | UnrecoverableKeyException | IOException\n" +
            "                | NoSuchAlgorithmException | InvalidKeyException e) {\n" +
            "            throw new RuntimeException(\"Failed to init Cipher\", e);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private class FingerprintException extends Exception {\n" +
            "        public FingerprintException(Exception e) {\n" +
            "            super(e);\n" +
            "        }\n" +
            "    }\n" +
            "}";
    String Code2="import android.content.Context;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.BaseAdapter;\n" +
            "import android.widget.GridView;\n" +
            "import android.widget.ImageView;\n" +
            "\n" +
            "public class ImageAdapter extends BaseAdapter {\n" +
            "    private Context mContext;\n" +
            "\n" +
            "    // Keep all Images in array\n" +
            "    public Integer[] mThumbIds = {\n" +
            "            R.drawable.pic_1, R.drawable.pic_2,\n" +
            "            R.drawable.pic_3, R.drawable.pic_1, R.drawable.pic_2,\n" +
            "            R.drawable.pic_3\n" +
            "    };\n" +
            "\n" +
            "    // Constructor\n" +
            "    public ImageAdapter(Context c){\n" +
            "        mContext = c;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getCount() {\n" +
            "        return mThumbIds.length;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public Object getItem(int position) {\n" +
            "        return mThumbIds[position];\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public long getItemId(int position) {\n" +
            "        return 0;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public View getView(int position, View convertView, ViewGroup parent) {\n" +
            "        ImageView imageView = new ImageView(mContext);\n" +
            "        imageView.setImageResource(mThumbIds[position]);\n" +
            "        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);\n" +
            "        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));\n" +
            "        return imageView;\n" +
            "    }\n" +
            "\n" +
            "}";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("ImageAdapter.Java");
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




