package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment_simple_and_custom_toast_demo extends Fragment {
    Button s_toast,c_toast;
    LayoutInflater layoutInflater;
    View toastLayout;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_simple_and_custom_toast_demo, container, false);

        s_toast=(Button)view.findViewById(R.id.s_toast);
        c_toast=(Button)view.findViewById(R.id.c_toast);
        layoutInflater=getLayoutInflater();
        toastLayout=layoutInflater.inflate(R.layout.custom_layout_toast,(ViewGroup)view.findViewById(R.id.cl));
        s_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This is a Simple Toast", Toast.LENGTH_SHORT).show();
            }
        });
        c_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast();

            }
        });
        return view;
    }
    public void toast(){
        Toast t= Toast.makeText(getActivity(),"Toast:Gravity.TOP",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.setView(toastLayout);
        t.show();
    }
}
