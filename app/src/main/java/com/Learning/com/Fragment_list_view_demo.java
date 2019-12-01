package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment_list_view_demo extends Fragment {
    ListView listView;
    List<String> list;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_listview_demo, container, false);
        listView=(ListView)view.findViewById(R.id.listview);
        list=new ArrayList<>();
        list.add("android");
        list.add("byte");
        list.add("catch");
        list.add("date picker");
        list.add("error");
        list.add("for");
        list.add("github");
        list.add("hacking");
        list.add("info");
        list.add("json");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "title" + ""+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}

