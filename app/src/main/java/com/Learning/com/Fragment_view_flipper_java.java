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

public class Fragment_view_flipper_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Context;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.AdapterViewFlipper;\n" +
            "import android.widget.BaseAdapter;\n" +
            "import android.widget.ImageView;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    AdapterViewFlipper adapterViewFlipper;\n" +
            "    int[] images = {\n" +
            "            R.drawable.img1,\n" +
            "            R.drawable.img2,\n" +
            "            R.drawable.img1,\n" +
            "            R.drawable.img2,\n" +
            "            R.drawable.img1,\n" +
            "\n" +
            "    };\n" +
            "    String[] text = {\n" +
            "            \"ATOMIC ABSROPTION SPECTROSCOPY\",\n" +
            "            \"FT-IR SPECTROSCOPY\",\n" +
            "            \"GASS CHROMATOGRAPHY\",\n" +
            "            \"HIGH PERFORMANCE LIQUID CHROMATOGRAPHY-MASS SPECTROSCOPY\",\n" +
            "            \"UV-VIS SPECTROSCOPY\",\n" +
            "    };\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapterViewFlipper_phy);\n" +
            "        CusAdap cusAdap = new CusAdap(this, images, text);\n" +
            "        adapterViewFlipper.setAdapter(cusAdap);\n" +
            "        adapterViewFlipper.setFlipInterval(3000);\n" +
            "        adapterViewFlipper.setAutoStart(true);\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    class CusAdap extends BaseAdapter {\n" +
            "        Context context;\n" +
            "        int[] images;\n" +
            "        String[] s_text;\n" +
            "        String[] s_head;\n" +
            "        LayoutInflater inflater;\n" +
            "\n" +
            "        public CusAdap(Context applicationContext, int[] images, String[] s_text) {\n" +
            "            this.context = applicationContext;\n" +
            "            this.images = images;\n" +
            "            this.s_text = s_text;\n" +
            "            inflater = (LayoutInflater.from(applicationContext));\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public int getCount() {\n" +
            "            return images.length;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public Object getItem(int position) {\n" +
            "            return null;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public long getItemId(int position) {\n" +
            "            return 0;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public View getView(int position, View view, ViewGroup parent) {\n" +
            "            view = inflater.inflate(R.layout.adapter_list_item, null);\n" +
            "            ImageView image = (ImageView) view.findViewById(R.id.image);\n" +
            "            TextView text = (TextView) view.findViewById(R.id.text_slider);\n" +
            "\n" +
            "            text.setText(s_text[position]);\n" +
            "            image.setImageResource(images[position]);\n" +
            "\n" +
            "            return view;\n" +
            "        }\n" +
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

