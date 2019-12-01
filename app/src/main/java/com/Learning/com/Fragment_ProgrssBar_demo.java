package com.Learning.com;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Fragment_ProgrssBar_demo extends Fragment {
    ProgressBar circle,horizontal;
    Button start,stop;
    int progressbarstatus=0;
    boolean value=false;
    boolean runningbefore=false;
    Handler progressbarHandler;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_progressbar_demo, container, false);
        start=(Button)view.findViewById(R.id.start);
        stop=(Button)view.findViewById(R.id.stop);
        circle=(ProgressBar)view.findViewById(R.id.pb_circle);
        horizontal=(ProgressBar)view.findViewById(R.id.pb_hr);
        horizontal.setMax(100);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=false;
                if(!runningbefore){
                    progressOperation();
                }else {
                    Toast.makeText(getActivity(), "Already Running...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=true;
                runningbefore=false;
            }
        });
return view;
    }
    private void progressOperation(){
        progressbarHandler=new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressbarstatus < 100 && !value) {
                    runningbefore = true;
                    progressbarstatus=progressbarstatus+1;
                    try {
                        Thread.sleep(150);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    progressbarHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            horizontal.setProgress(progressbarstatus);
                        }
                    });
                }
                if(progressbarstatus==100){
                    try {
                        Thread.sleep(1000);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    horizontal.setProgress(0);
                    progressbarstatus=0;
                }
                runningbefore=false;
            }


        }).start();
    }

}
