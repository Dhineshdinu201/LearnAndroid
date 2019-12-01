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

public class Fragment_expandable_listview_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2,title3;
    String Code="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.ExpandableListView;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.HashMap;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        ExpandableListView expandableListView;\n" +
            "        HashMap<String, List<String>> listChild;\n" +
            "        List<String>listHeader;\n" +
            "        ExpandableAdapter expandable_engg_adapter;\n" +
            "        expandableListView=(ExpandableListView)findViewById(R.id.expListView_phy);\n" +
            "        listChild=ExpandableListData.getData();\n" +
            "        listHeader=new ArrayList<String>(listChild.keySet());\n" +
            "        expandable_engg_adapter=new ExpandableAdapter(this,listHeader,listChild);\n" +
            "        expandableListView.setAdapter(expandable_engg_adapter);\n" +
            "\n" +
            "    }\n" +
            "}\n";
    String Code2="import java.util.ArrayList;\n" +
            "import java.util.HashMap;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class ExpandableListData {\n" +
            "    public static HashMap<String , List<String>> getData(){\n" +
            "        HashMap<String,List<String>> expandableListDetail=new HashMap<String, List<String>>();\n" +
            "\n" +
            "        List<String> BikeList = new ArrayList<>();\n" +
            "        BikeList.add(\"\\u2022\\tYamaha\");\n" +
            "        BikeList.add(\"\\u2022\\tHonda\");\n" +
            "        BikeList.add(\"\\u2022\\tBajaj\");\n" +
            "        BikeList.add(\"\\u2022\\tKTM\");\n" +
            "        BikeList.add(\"\\u2022\\tKawasaki\");\n" +
            "        BikeList.add(\"\\u2022\\tDucati\");\n" +
            "        BikeList.add(\"\\u2022\\tRoyal Enfield\");\n" +
            "        BikeList.add(\"\\u2022\\tSuzuki\");\n" +
            "        BikeList.add(\"\\u2022\\tBeneli\");\n" +
            "\n" +
            "        List<String> CarList = new ArrayList<>();\n" +
            "        CarList.add(\"\\u2022\\tAudi\");\n" +
            "        CarList.add(\"\\u2022\\tTata\");\n" +
            "        CarList.add(\"\\u2022\\tDatsun \");\n" +
            "        CarList.add(\"\\u2022\\tMaruthi\");\n" +
            "        CarList.add(\"\\u2022\\tRenault \");\n" +
            "        CarList.add(\"\\u2022\\tFord\");\n" +
            "\n" +
            "\n" +
            "        expandableListDetail.put(\"Bike Products\",BikeList);\n" +
            "        expandableListDetail.put(\"Car Products\",CarList);\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "        return expandableListDetail;\n" +
            "    }\n" +
            "}\n" +
            "\n";
    String Code3="import android.content.Context;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.BaseExpandableListAdapter;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "import java.util.HashMap;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class ExpandableAdapter extends BaseExpandableListAdapter {\n" +
            "    private Context context;\n" +
            "    private HashMap<String, List<String>> childtitles;\n" +
            "    List<String>headertitles;\n" +
            "    public ExpandableAdapter(Context context,List<String>headertitles,HashMap<String,List<String>>childtitles){\n" +
            "        this.context=context;\n" +
            "        this.childtitles=childtitles;\n" +
            "        this.headertitles=headertitles;\n" +
            "    }\n" +
            "    @Override\n" +
            "    public int getGroupCount() {\n" +
            "        return headertitles.size();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getChildrenCount(int groupPosition) {\n" +
            "        return this.childtitles.get(this.headertitles.get(groupPosition)).size();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public Object getGroup(int groupPosition) {\n" +
            "        return this.headertitles.get(groupPosition);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public Object getChild(int groupPosition, int childPosition) {\n" +
            "        return this.childtitles.get(this.headertitles.get(groupPosition)).get(childPosition);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public long getGroupId(int groupPosition) {\n" +
            "        return groupPosition;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public long getChildId(int groupPosition, int childPosition) {\n" +
            "        return childPosition;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean hasStableIds() {\n" +
            "        return false;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {\n" +
            "        String listTitle=(String)getGroup(groupPosition);\n" +
            "        if(convertView==null) {\n" +
            "            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
            "            convertView = layoutInflater.inflate(R.layout.exp_group_header, null);\n" +
            "        }\n" +
            "        TextView listTitleTextView=(TextView)convertView.findViewById(R.id.title);\n" +
            "        listTitleTextView.setText(listTitle);\n" +
            "\n" +
            "        return convertView;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {\n" +
            "        final String expandedListText=(String)getChild(groupPosition,childPosition);\n" +
            "        if(convertView==null) {\n" +
            "            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
            "            convertView = layoutInflater.inflate(R.layout.exp_child_item, null);\n" +
            "        }\n" +
            "        TextView expandedListTextView=(TextView)convertView.findViewById(R.id.childitem);\n" +
            "        expandedListTextView.setText(expandedListText);\n" +
            "\n" +
            "        return convertView;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean isChildSelectable(int groupPosition, int childPosition) {\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.three_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title3=(TextView)view.findViewById(R.id.title3);
        title2.setText("ExpandableListData.Java");
        title3.setText("ExpandableAdapter.Java");
        WebView webView2=(WebView)view.findViewById(R.id.webview2);
        WebView webView3=(WebView)view.findViewById(R.id.webview3);
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
        Button copy3=(Button)view.findViewById(R.id.copy3);
        copy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code3);
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
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code3)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webView3);
        return view;
    }



}


