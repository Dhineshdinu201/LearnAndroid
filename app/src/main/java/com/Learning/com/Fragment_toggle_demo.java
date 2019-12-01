package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Fragment_toggle_demo extends Fragment {
    ToggleButton toggleButton;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_toggle_demo, container, false);
        toggleButton=(ToggleButton)view.findViewById(R.id.togglebutton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(toggleButton.isChecked()) {
                    Toast.makeText(getActivity(), "Toggle is on", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "Toggle is off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }



}
