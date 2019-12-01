package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.PatternLockViewListener;
import com.andrognito.patternlockview.utils.PatternLockUtils;

import java.util.List;

public class Fragment_patternLockView_demo extends Fragment {
    PatternLockView patternLockView;
    RadioGroup radioGroup;
    String savedpattern="";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_pattern_lockview_demo, container, false);
        radioGroup=(RadioGroup)view.findViewById(R.id.radiogroup);
        patternLockView=(PatternLockView)view.findViewById(R.id.lockview);
        patternLockView.addPatternLockListener(new PatternLockViewListener() {
            @Override
            public void onStarted() {

            }

            @Override
            public void onProgress(List<PatternLockView.Dot> progressPattern) {

            }

            @Override
            public void onComplete(List<PatternLockView.Dot> pattern) {
                if(radioGroup.getCheckedRadioButtonId()==R.id.set){
                    savedpattern= PatternLockUtils.patternToString(patternLockView,pattern);
                    Toast.makeText(getActivity(), "patten saved", Toast.LENGTH_SHORT).show();
                }else {
                    if (PatternLockUtils.patternToString(patternLockView, pattern).equals(savedpattern))
                    {
                        Toast.makeText(getActivity(), "correct pattern", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getActivity(), "Incorrect pattern", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onCleared() {

            }
        });
        return view;
    }
}
