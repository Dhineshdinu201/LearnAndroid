package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class Fragment_MultiAutoCompleteTextView_demo extends Fragment {
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String[] values={"Alpha","Beta","Cupcake","Eclair"};
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_multi_autocomplete_textview, container, false);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView)view.findViewById(R.id.mul_aut);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,values);
        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        return view;
    }
}
