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

public class Fragment_SearchView_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2;
    String Code="import android.content.Context;\n" +
            "import android.os.Bundle;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.widget.ListView;\n" +
            "import android.widget.SearchView;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {\n" +
            "\n" +
            "    // Declare Variables\n" +
            "    ListView list;\n" +
            "    ListViewAdapter adapter;\n" +
            "    SearchView editsearch;\n" +
            "    String[] versionNameList;\n" +
            "    ArrayList<VersionNames> arraylist = new ArrayList<VersionNames>();\n" +
            "\n" +
            "    @Override\n" +
            "    public void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        // Generate sample data\n" +
            "\n" +
            "        versionNameList = new String[]{\"Alpha\", \"Beta\", \"CupCake\",\n" +
            "                \"Donut\", \"Eclair\", \"Fryso\", \"GingerBread\", \"HoneyCombs\",\n" +
            "                \"IceCreamSandwich\",\"JellyBean\",\"Kitkat\",\"Lollipop\",\"MarshMellow\",\"Noughat\",\"Oreo\",\"Pie\"};\n" +
            "\n" +
            "        // Locate the ListView in listview_main.xml\n" +
            "        list = (ListView) findViewById(R.id.listview);\n" +
            "\n" +
            "        for (int i = 0; i < versionNameList.length; i++) {\n" +
            "            VersionNames versionNames = new VersionNames(versionNameList[i]);\n" +
            "            // Binds all strings into an array\n" +
            "            arraylist.add(versionNames);\n" +
            "        }\n" +
            "\n" +
            "        // Pass results to ListViewAdapter Class\n" +
            "        adapter = new ListViewAdapter(this, arraylist);\n" +
            "\n" +
            "        // Binds the Adapter to the ListView\n" +
            "        list.setAdapter(adapter);\n" +
            "\n" +
            "        // Locate the EditText in listview_main.xml\n" +
            "        editsearch = (SearchView) findViewById(R.id.search);\n" +
            "        editsearch.setOnQueryTextListener(this);\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onQueryTextSubmit(String query) {\n" +
            "\n" +
            "        return false;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onQueryTextChange(String newText) {\n" +
            "        String text = newText;\n" +
            "        adapter.filter(text);\n" +
            "        return false;\n" +
            "    }\n" +
            "}\n" +
            "class VersionNames {\n" +
            "    private String versionNames;\n" +
            "\n" +
            "    public VersionNames(String versionNames) {\n" +
            "        this.versionNames = versionNames;\n" +
            "    }\n" +
            "\n" +
            "    public String getVersionNames() {\n" +
            "        return this.versionNames;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "}";
    String Code2="import android.content.Context;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.BaseAdapter;\n" +
            "import android.widget.TextView;\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "import java.util.Locale;\n" +
            "\n" +
            "public class ListViewAdapter extends BaseAdapter {\n" +
            "\n" +
            "    // Declare Variables\n" +
            "\n" +
            "    Context mContext;\n" +
            "    LayoutInflater inflater;\n" +
            "    private List<VersionNames> versionNamesList = null;\n" +
            "    private ArrayList<VersionNames> arraylist;\n" +
            "\n" +
            "    public ListViewAdapter(Context context, List<VersionNames> versionNamesList) {\n" +
            "        mContext = context;\n" +
            "        this.versionNamesList = versionNamesList;\n" +
            "        inflater = LayoutInflater.from(mContext);\n" +
            "        this.arraylist = new ArrayList<VersionNames>();\n" +
            "        this.arraylist.addAll(versionNamesList);\n" +
            "    }\n" +
            "\n" +
            "    public class ViewHolder {\n" +
            "        TextView name;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getCount() {\n" +
            "        return versionNamesList.size();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public VersionNames getItem(int position) {\n" +
            "        return versionNamesList.get(position);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public long getItemId(int position) {\n" +
            "        return position;\n" +
            "    }\n" +
            "\n" +
            "    public View getView(final int position, View view, ViewGroup parent) {\n" +
            "        final ViewHolder holder;\n" +
            "        if (view == null) {\n" +
            "            holder = new ViewHolder();\n" +
            "            view = inflater.inflate(R.layout.listview_items, null);\n" +
            "            // Locate the TextViews in listview_item.xml\n" +
            "            holder.name = (TextView) view.findViewById(R.id.name);\n" +
            "            view.setTag(holder);\n" +
            "        } else {\n" +
            "            holder = (ViewHolder) view.getTag();\n" +
            "        }\n" +
            "        // Set the results into TextViews\n" +
            "        holder.name.setText(versionNamesList.get(position).getVersionNames());\n" +
            "        return view;\n" +
            "    }\n" +
            "\n" +
            "    // Filter Class\n" +
            "    public void filter(String charText) {\n" +
            "        charText = charText.toLowerCase(Locale.getDefault());\n" +
            "        versionNamesList.clear();\n" +
            "        if (charText.length() == 0) {\n" +
            "            versionNamesList.addAll(arraylist);\n" +
            "        } else {\n" +
            "            for (VersionNames wp : arraylist) {\n" +
            "                if (wp.getVersionNames().toLowerCase(Locale.getDefault()).contains(charText)) {\n" +
            "                    versionNamesList.add(wp);\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "        notifyDataSetChanged();\n" +
            "    }\n" +
            "\n" +
            "}";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("ListViewAdapter.Java");
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



