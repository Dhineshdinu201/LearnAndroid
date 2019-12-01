package com.Learning.com;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_custom_listview_demo extends Fragment {
    ListView listView;
    String[]names={"Alpha","Beta","CupCake","Donut","Eclair","Fryso","Ginger Bread","HoneyComb","Icecream Sandwich","Jelly Bean","Kitkat","Lolipop","Marshmellow","Noughat","Oreo","Pie"};
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_custom_listview_demo, container, false);
        listView=(ListView)view.findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter(getActivity(),names);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), (String)listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
class CustomAdapter extends ArrayAdapter<String> {
    public final Context context;
    private final String[] names;
    public CustomAdapter(Context context,String[] names) {
        super(context,R.layout.custom_listview_layout, names);
        this.context=context;
        this.names=names;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.custom_listview_layout,null,true);
        TextView name=(TextView)view.findViewById(R.id.text);
        ImageView imageView=(ImageView)view.findViewById(R.id.image);
        name.setText(names[position]);
        imageView.setImageResource(R.drawable.user);
        return view;
    }
}

