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

public class Fragment_custom_listView_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Context;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.AdapterView;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.ImageView;\n" +
            "import android.widget.ListView;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "ListView listView;\n" +
            "String[]names={\"Alpha\",\"Beta\",\"CupCake\",\"Donut\",\"Eclair\",\"Fryso\",\"Ginger Bread\",\"HoneyComb\",\"Icecream Sandwich\",\"Jelly Bean\",\"Kitkat\",\"Lolipop\",\"Marshmellow\",\"Noughat\",\"Oreo\",\"Pie\"};\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        listView=(ListView)findViewById(R.id.listview);\n" +
            "        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,names);\n" +
            "        listView.setAdapter(customAdapter);\n" +
            "        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
            "            @Override\n" +
            "            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {\n" +
            "                Toast.makeText(MainActivity.this, (String)listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "}\n" +
            "class CustomAdapter extends ArrayAdapter<String>{\n" +
            "public final Context context;\n" +
            "private final String[] names;\n" +
            "    public CustomAdapter(Context context,String[] names) {\n" +
            "        super(context,R.layout.custom_listview_layout, names);\n" +
            "        this.context=context;\n" +
            "        this.names=names;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public View getView(int position, View convertView,  ViewGroup parent) {\n" +
            "\n" +
            "        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
            "        View view=inflater.inflate(R.layout.custom_listview_layout,null,true);\n" +
            "        TextView name=(TextView)view.findViewById(R.id.text);\n" +
            "        ImageView imageView=(ImageView)view.findViewById(R.id.image);\n" +
            "        name.setText(names[position]);\n" +
            "        imageView.setImageResource(R.drawable.user);\n" +
            "        return view;\n" +
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