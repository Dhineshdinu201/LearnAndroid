package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Fragment_datepicker_demo extends Fragment {
    DatePicker datePicker;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_datepicker_demo, container, false);
        datePicker=(DatePicker)view.findViewById(R.id.date_picker);
        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),new DatePicker.OnDateChangedListener() {

            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String[] date = {""};
                date[0] =dayOfMonth+"-"+monthOfYear+"-"+year;
                String s_date=date[0];
                Toast.makeText(getActivity(), s_date, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
