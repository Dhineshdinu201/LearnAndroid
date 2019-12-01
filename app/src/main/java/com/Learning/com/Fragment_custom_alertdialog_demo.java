package com.Learning.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_custom_alertdialog_demo extends Fragment {
    Button button;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_custom_alertdialog_demo, container, false);
        button=(Button)view.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
        return view;
    }
    public void show(){
        Activity activity = null;
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        Button close;

        final AlertDialog alertDialog = dialogBuilder.create();
        LayoutInflater factory = LayoutInflater.from(getActivity());
        final View vi = factory.inflate(R.layout.custom_layout_alertdialog, null);
        close=(Button)vi.findViewById(R.id.back);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.cancel();
            }
        });







        alertDialog.setView(vi);
        alertDialog.show();
        alertDialog.setCancelable(false);


    }
}
