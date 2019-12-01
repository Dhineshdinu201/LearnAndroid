package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragment_edittext_demo extends Fragment {
    EditText et_text;
    Button btn;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_edittext_demo, container, false);
        et_text=(EditText)view.findViewById(R.id.et_text);
        btn=(Button)view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=et_text.getText().toString();  //it will get the entered text to string.
                Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
