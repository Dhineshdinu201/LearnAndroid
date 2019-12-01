package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_expandable_re_view_java  extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2,title3;
    String Code="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.support.v7.widget.LinearLayoutManager;\n" +
            "import android.support.v7.widget.RecyclerView;\n" +
            "import android.support.v7.widget.Toolbar;\n" +
            "import android.view.Menu;\n" +
            "import android.view.MenuItem;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    RecyclerView recycler;\n" +
            "    PeopleAdapter adapter;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        recycler = (RecyclerView) findViewById(R.id.main_recycler);\n" +
            "\n" +
            "        adapter = new PeopleAdapter(this);\n" +
            "        adapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION);\n" +
            "        recycler.setLayoutManager(new LinearLayoutManager(this));\n" +
            "        recycler.setAdapter(adapter);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
            "        super.onCreateOptionsMenu(menu);\n" +
            "\n" +
            "        getMenuInflater().inflate(R.menu.menu_main, menu);\n" +
            "\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onOptionsItemSelected(MenuItem item) {\n" +
            "        switch (item.getItemId()) {\n" +
            "            case R.id.action_expand_all:\n" +
            "                adapter.expandAll();\n" +
            "                return true;\n" +
            "            case R.id.action_collapse_all:\n" +
            "                adapter.collapseAll();\n" +
            "                return true;\n" +
            "            default:\n" +
            "                return super.onOptionsItemSelected(item);\n" +
            "        }\n" +
            "    }\n" +
            "}\n";
    String Code2="import android.content.Context;\n" +
            "import android.support.v7.widget.RecyclerView;\n" +
            "import android.util.SparseIntArray;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.ImageView;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public abstract class ExpandableRecyclerAdapter<T extends ExpandableRecyclerAdapter.ListItem> extends RecyclerView.Adapter<ExpandableRecyclerAdapter.ViewHolder> {\n" +
            "    protected Context mContext;\n" +
            "    protected List<T> allItems = new ArrayList<>();\n" +
            "    protected List<T> visibleItems = new ArrayList<>();\n" +
            "    private List<Integer> indexList = new ArrayList<>();\n" +
            "    private SparseIntArray expandMap = new SparseIntArray();\n" +
            "    private int mode;\n" +
            "\n" +
            "    protected static final int TYPE_HEADER = 1000;\n" +
            "\n" +
            "    private static final int ARROW_ROTATION_DURATION = 150;\n" +
            "\n" +
            "    public static final int MODE_NORMAL = 0;\n" +
            "    public static final int MODE_ACCORDION = 1;\n" +
            "\n" +
            "    public ExpandableRecyclerAdapter(Context context) {\n" +
            "        mContext = context;\n" +
            "    }\n" +
            "\n" +
            "    public static class ListItem {\n" +
            "        public int ItemType;\n" +
            "\n" +
            "        public ListItem(int itemType) {\n" +
            "            ItemType = itemType;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public long getItemId(int i) {\n" +
            "        return i;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getItemCount() {\n" +
            "        return visibleItems == null ? 0 : visibleItems.size();\n" +
            "    }\n" +
            "\n" +
            "    protected View inflate(int resourceID, ViewGroup viewGroup) {\n" +
            "        return LayoutInflater.from(mContext).inflate(resourceID, viewGroup, false);\n" +
            "    }\n" +
            "\n" +
            "    public class ViewHolder extends RecyclerView.ViewHolder {\n" +
            "        public ViewHolder(View view) {\n" +
            "            super(view);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public class HeaderViewHolder extends ViewHolder {\n" +
            "        ImageView arrow;\n" +
            "\n" +
            "        public HeaderViewHolder(View view) {\n" +
            "            super(view);\n" +
            "\n" +
            "            view.setOnClickListener(new View.OnClickListener() {\n" +
            "                @Override\n" +
            "                public void onClick(View v) {\n" +
            "                    toggleExpandedItems(getLayoutPosition(),false);\n" +
            "                /*if(isExpanded(getLayoutPosition())){\n" +
            "                    collapseItems(getLayoutPosition(),false);\n" +
            "                }else {\n" +
            "                    expandItems(getLayoutPosition(),true);\n" +
            "                }*/\n" +
            "                }\n" +
            "            });\n" +
            "        }\n" +
            "\n" +
            "        public HeaderViewHolder(View view, final ImageView arrow) {\n" +
            "            super(view);\n" +
            "\n" +
            "            this.arrow = arrow;\n" +
            "\n" +
            "            arrow.setOnClickListener(new View.OnClickListener() {\n" +
            "                @Override\n" +
            "                public void onClick(View v) {\n" +
            "                    handleClick();\n" +
            "                }\n" +
            "            });\n" +
            "        }\n" +
            "\n" +
            "        protected void handleClick() {\n" +
            "            if (toggleExpandedItems(getLayoutPosition(), false)) {\n" +
            "                openArrow(arrow);\n" +
            "            } else {\n" +
            "                closeArrow(arrow);\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        public void bind(int position) {\n" +
            "            arrow.setRotation(isExpanded(position) ? 90 : 0);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public boolean toggleExpandedItems(int position, boolean notify) {\n" +
            "        if (isExpanded(position)) {\n" +
            "            collapseItems(position, notify);\n" +
            "            return false;\n" +
            "        } else {\n" +
            "            expandItems(position, notify);\n" +
            "\n" +
            "            if (mode == MODE_ACCORDION) {\n" +
            "                collapseAllExcept(position);\n" +
            "            }\n" +
            "\n" +
            "            return true;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void expandItems(int position, boolean notify) {\n" +
            "        int count = 0;\n" +
            "        int index = indexList.get(position);\n" +
            "        int insert = position;\n" +
            "\n" +
            "        for (int i=index+1; i<allItems.size() && allItems.get(i).ItemType != TYPE_HEADER; i++) {\n" +
            "            insert++;\n" +
            "            count++;\n" +
            "            visibleItems.add(insert, allItems.get(i));\n" +
            "            indexList.add(insert, i);\n" +
            "        }\n" +
            "\n" +
            "        notifyItemRangeInserted(position + 1, count);\n" +
            "\n" +
            "        int allItemsPosition = indexList.get(position);\n" +
            "        expandMap.put(allItemsPosition, 1);\n" +
            "\n" +
            "        if (notify) {\n" +
            "            notifyItemChanged(position);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void collapseItems(int position, boolean notify) {\n" +
            "        int count = 0;\n" +
            "        int index = indexList.get(position);\n" +
            "\n" +
            "        for (int i=index+1; i<allItems.size() && allItems.get(i).ItemType != TYPE_HEADER; i++) {\n" +
            "            count++;\n" +
            "            visibleItems.remove(position + 1);\n" +
            "            indexList.remove(position + 1);\n" +
            "        }\n" +
            "\n" +
            "        notifyItemRangeRemoved(position + 1, count);\n" +
            "\n" +
            "        int allItemsPosition = indexList.get(position);\n" +
            "        expandMap.delete(allItemsPosition);\n" +
            "\n" +
            "        if (notify) {\n" +
            "            notifyItemChanged(position);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    protected boolean isExpanded(int position) {\n" +
            "        int allItemsPosition = indexList.get(position);\n" +
            "        return expandMap.get(allItemsPosition, -1) >= 0;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getItemViewType(int position) {\n" +
            "        return visibleItems.get(position).ItemType;\n" +
            "    }\n" +
            "\n" +
            "    public void setItems(List<T> items) {\n" +
            "        allItems = items;\n" +
            "        List<T> visibleItems = new ArrayList<>();\n" +
            "        expandMap.clear();\n" +
            "        indexList.clear();\n" +
            "\n" +
            "        for (int i=0; i<items.size(); i++) {\n" +
            "            if (items.get(i).ItemType == TYPE_HEADER) {\n" +
            "                indexList.add(i);\n" +
            "                visibleItems.add(items.get(i));\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        this.visibleItems = visibleItems;\n" +
            "        notifyDataSetChanged();\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "\n" +
            "    protected void removeItemAt(int visiblePosition) {\n" +
            "        int allItemsPosition = indexList.get(visiblePosition);\n" +
            "\n" +
            "        allItems.remove(allItemsPosition);\n" +
            "        visibleItems.remove(visiblePosition);\n" +
            "\n" +
            "        incrementIndexList(allItemsPosition, visiblePosition, -1);\n" +
            "        incrementExpandMapAfter(allItemsPosition, -1);\n" +
            "\n" +
            "        notifyItemRemoved(visiblePosition);\n" +
            "    }\n" +
            "\n" +
            "    private void incrementExpandMapAfter(int position, int direction) {\n" +
            "        SparseIntArray newExpandMap = new SparseIntArray();\n" +
            "\n" +
            "        for (int i=0; i<expandMap.size(); i++) {\n" +
            "            int index = expandMap.keyAt(i);\n" +
            "            newExpandMap.put(index < position ? index : index + direction, 1);\n" +
            "        }\n" +
            "\n" +
            "        expandMap = newExpandMap;\n" +
            "    }\n" +
            "\n" +
            "    private void incrementIndexList(int allItemsPosition, int visiblePosition, int direction) {\n" +
            "        List<Integer> newIndexList = new ArrayList<>();\n" +
            "\n" +
            "        for (int i=0; i<indexList.size(); i++) {\n" +
            "            if (i == visiblePosition) {\n" +
            "                if (direction > 0) {\n" +
            "                    newIndexList.add(allItemsPosition);\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            int val = indexList.get(i);\n" +
            "            newIndexList.add(val < allItemsPosition ? val : val + direction);\n" +
            "        }\n" +
            "\n" +
            "        indexList = newIndexList;\n" +
            "    }\n" +
            "\n" +
            "    public void collapseAll() {\n" +
            "        collapseAllExcept(-1);\n" +
            "    }\n" +
            "\n" +
            "    public void collapseAllExcept(int position) {\n" +
            "        for (int i=visibleItems.size()-1; i>=0; i--) {\n" +
            "            if (i != position && getItemViewType(i) == TYPE_HEADER) {\n" +
            "                if (isExpanded(i)) {\n" +
            "                    collapseItems(i, true);\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void expandAll() {\n" +
            "        for (int i=visibleItems.size()-1; i>=0; i--) {\n" +
            "            if (getItemViewType(i) == TYPE_HEADER) {\n" +
            "                if (!isExpanded(i)) {\n" +
            "                    expandItems(i, true);\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public static void openArrow(View view) {\n" +
            "        view.animate().setDuration(ARROW_ROTATION_DURATION).rotation(180);\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    public static void closeArrow(View view) {\n" +
            "        view.animate().setDuration(ARROW_ROTATION_DURATION).rotation(0);\n" +
            "    }\n" +
            "\n" +
            "    public int getMode() {\n" +
            "        return mode;\n" +
            "    }\n" +
            "\n" +
            "    public void setMode(int mode) {\n" +
            "        this.mode = mode;\n" +
            "    }\n" +
            "}";
    String Code3="import android.content.Context;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.ImageView;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class PeopleAdapter extends ExpandableRecyclerAdapter<PeopleAdapter.PeopleListItem> {\n" +
            "    public static final int TYPE_PERSON = 1001;\n" +
            "\n" +
            "    public PeopleAdapter(Context context) {\n" +
            "        super(context);\n" +
            "\n" +
            "        setItems(getSampleItems());\n" +
            "    }\n" +
            "\n" +
            "    public static class PeopleListItem extends ExpandableRecyclerAdapter.ListItem {\n" +
            "        public String Text;\n" +
            "\n" +
            "        public PeopleListItem(String group) {\n" +
            "            super(TYPE_HEADER);\n" +
            "\n" +
            "            Text = group;\n" +
            "        }\n" +
            "\n" +
            "        public PeopleListItem(String first, String last) {\n" +
            "            super(TYPE_PERSON);\n" +
            "\n" +
            "            Text = first + \" \" + last;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public class HeaderViewHolder extends ExpandableRecyclerAdapter.HeaderViewHolder {\n" +
            "        TextView name;\n" +
            "\n" +
            "        public HeaderViewHolder(View view) {\n" +
            "            super(view, (ImageView) view.findViewById(R.id.img_arrow));\n" +
            "\n" +
            "            name = (TextView) view.findViewById(R.id.txt_header_name);\n" +
            "        }\n" +
            "\n" +
            "        public void bind(int position) {\n" +
            "            super.bind(position);\n" +
            "\n" +
            "            name.setText(visibleItems.get(position).Text);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public class PersonViewHolder extends ExpandableRecyclerAdapter.ViewHolder {\n" +
            "        EditText name;\n" +
            "\n" +
            "        public PersonViewHolder(View view) {\n" +
            "            super(view);\n" +
            "\n" +
            "            name = (EditText) view.findViewById(R.id.edt_description);\n" +
            "        }\n" +
            "\n" +
            "        public void bind(int position) {\n" +
            "            name.setText(name.getText());\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {\n" +
            "        switch (viewType) {\n" +
            "            case TYPE_HEADER:\n" +
            "                return new HeaderViewHolder(inflate(R.layout.item_header, parent));\n" +
            "            case TYPE_PERSON:\n" +
            "            default:\n" +
            "                return new PersonViewHolder(inflate(R.layout.item_content, parent));\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onBindViewHolder(ExpandableRecyclerAdapter.ViewHolder holder, int position) {\n" +
            "        switch (getItemViewType(position)) {\n" +
            "            case TYPE_HEADER:\n" +
            "                ((HeaderViewHolder) holder).bind(position);\n" +
            "                break;\n" +
            "            case TYPE_PERSON:\n" +
            "            default:\n" +
            "                ((PersonViewHolder) holder).bind(position);\n" +
            "                break;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private List<PeopleListItem> getSampleItems() {\n" +
            "        List<PeopleListItem> items = new ArrayList<>();\n" +
            "        items.add(new PeopleListItem(\"Developer\"));\n" +
            "        items.add(new PeopleListItem(\"\", \"\"));\n" +
            "        items.add(new PeopleListItem(\"Developer\"));\n" +
            "        items.add(new PeopleListItem(\"\", \"\"));\n" +
            "        return items;\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.three_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title3=(TextView)view.findViewById(R.id.title3);
        title2.setText("ExpandableRecyclerAdapter.Java");
        title3.setText("PeopleAdapter.Java");
        WebView webView2=(WebView)view.findViewById(R.id.webview2);
        WebView webView3=(WebView)view.findViewById(R.id.webview3);


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


