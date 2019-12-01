package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Fragment_AutoCompleteTextView_demo extends Fragment {
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;
    String[] values={"Alpha","Beta","Cupcake","Donut","Eclair"};
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_auto_complete_textview_demo, container, false);
        autoCompleteTextView=(AutoCompleteTextView)view.findViewById(R.id.a_textview);
        textView=(TextView)view.findViewById(R.id.text_hint);
        textView.setText("Hints: Alpha,Beta,Cupcake,Donut,Eclair");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,values);
        autoCompleteTextView.setAdapter(adapter);
        return view;
    }
}
