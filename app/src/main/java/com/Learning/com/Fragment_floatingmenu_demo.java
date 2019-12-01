package com.Learning.com;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;


public class Fragment_floatingmenu_demo extends Fragment {
    FloatingActionMenu menu;
    FloatingActionButton b2,b3,b4,b5;
    TextView textView;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_floatingmenu_demo, container, false);
        textView=(TextView)view.findViewById(R.id.text);
        textView.setText("Click the below menu");
        menu = (FloatingActionMenu) view.findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);
        menu.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean opened) {
                Vibrator vibrator = (Vibrator)getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                if (opened) {
                    if (vibrator != null) {
                        vibrator.vibrate(50);
                    }
                } else {
                    if (vibrator != null) {
                        vibrator.vibrate(50);
                    }
                }
            }
        });

        b2 = (FloatingActionButton) view.findViewById(R.id.b2);
        b3 = (FloatingActionButton) view.findViewById(R.id.b3);
        b4 = (FloatingActionButton) view.findViewById(R.id.b4);
        b5 = (FloatingActionButton) view.findViewById(R.id.b5);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("button2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("button3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("button4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("button5");
            }
        });


        //**********************bottom nav click listener************************

        return view;
    }
}
