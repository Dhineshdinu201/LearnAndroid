package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fragment_Expandable_Listview_demo  extends Fragment {
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_expandable_listview_demo, container, false);
        ExpandableListView expandableListView;
        HashMap<String, List<String>> listChild;
        List<String>listHeader;
        ExpandableAdapter expandable_engg_adapter;
        expandableListView=(ExpandableListView)view.findViewById(R.id.expListView_phy);
        listChild=ExpandableListData.getData();
        listHeader=new ArrayList<String>(listChild.keySet());
        expandable_engg_adapter=new ExpandableAdapter(getActivity(),listHeader,listChild);
        expandableListView.setAdapter(expandable_engg_adapter);
        return view;
    }
}
