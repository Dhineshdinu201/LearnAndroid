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

public class Fragment_Recycler_view_Java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2;
    String Code="import android.content.Context;\n" +
            "import android.os.Bundle;;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.support.v7.widget.LinearLayoutManager;\n" +
            "import android.support.v7.widget.RecyclerView;\n" +
            "\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    RecyclerView recyclerView;\n" +
            "    Context context;\n" +
            "    private List<Ver> vers;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);\n" +
            "        recyclerView.setHasFixedSize(true);\n" +
            "        LinearLayoutManager layoutManager=new LinearLayoutManager(context);\n" +
            "        recyclerView.setLayoutManager(layoutManager);\n" +
            "        data();\n" +
            "        adapter();\n" +
            "\n" +
            "    }\n" +
            "    private void data(){\n" +
            "        vers=new ArrayList<>();\n" +
            "        for(int i=0;i<=5;i++){\n" +
            "            vers.add(new Ver(\"Android\",R.drawable.ic_launcher_background));\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "    private void adapter(){\n" +
            "        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(vers);\n" +
            "        recyclerView.setAdapter(recyclerViewAdapter);\n" +
            "    }\n" +
            "}\n" +
            "class Ver{\n" +
            "    String name;\n" +
            "    int logo;\n" +
            "    Ver(String name,int logo){\n" +
            "        this.name=name;\n" +
            "        this.logo=logo;\n" +
            "    }\n" +
            "}\n";
    String Code2="import android.support.v7.widget.CardView;\n" +
            "import android.support.v7.widget.RecyclerView;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.ImageView;\n" +
            "import android.widget.TextView;\n" +
            "import java.util.List;\n" +
            "\n" +
            "public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder> {\n" +
            "    List<Ver> vers;\n" +
            "    RecyclerViewAdapter(List<Ver>vers) {\n" +
            "\n" +
            "        this.vers = vers;\n" +
            "    }\n" +
            "    public static class Viewholder extends RecyclerView.ViewHolder{\n" +
            "        CardView cardView;\n" +
            "        TextView textView;\n" +
            "        ImageView imageView;\n" +
            "        Viewholder(View itemView){\n" +
            "            super(itemView);\n" +
            "            cardView=(CardView)itemView.findViewById(R.id.cardview_odd);\n" +
            "            textView=(TextView)itemView.findViewById(R.id.name);\n" +
            "            imageView=(ImageView)itemView.findViewById(R.id.user);\n" +
            "\n" +
            "\n" +
            "        }\n" +
            "    }\n" +
            "    @Override\n" +
            "    public RecyclerViewAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {\n" +
            "        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_recycler_view,parent,false);\n" +
            "        Viewholder viewholder=new Viewholder(view);\n" +
            "        return viewholder;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onBindViewHolder(RecyclerViewAdapter.Viewholder holder, int position) {\n" +
            "        holder.textView.setText(vers.get(position).name);\n" +
            "        holder.imageView.setImageResource(vers.get(position).logo);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getItemCount() {\n" +
            "        return vers.size();\n" +
            "    }\n" +
            "}\n" +
            "\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("RecyclerViewAdapter.Java");
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

