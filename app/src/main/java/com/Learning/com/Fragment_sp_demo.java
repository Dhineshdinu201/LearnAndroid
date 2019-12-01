package com.Learning.com;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Fragment_sp_demo extends Fragment {
    EditText et_userid, et_password;
    private SharedPreferences mpref;
    private static final String PREF_NAME = "SP_NAME";
    CheckBox checkBox;
    String userid, password;
    Button Login, forgot_password, cancel, forgot;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_sp_demo, container, false);
        et_userid = (EditText) view.findViewById(R.id.et_userid);
        et_password = (EditText) view.findViewById(R.id.et_password);
        Login = (Button) view.findViewById(R.id.btn_submit);
        checkBox=(CheckBox)view.findViewById(R.id.check);
        checkBox.setChecked(true);
        mpref = getActivity().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        userid=mpref.getString("USERID","");
        et_userid.setText(userid);
        password=mpref.getString("PASSWORD","");
        et_password.setText(password);
        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("userid", "+++++++" + userid + password);
                if (checkBox.isChecked() == true) {
                    userid = et_userid.getText().toString();
                    password = et_password.getText().toString();
                    if (TextUtils.isEmpty(userid) || TextUtils.isEmpty(password)) {
                        Toast.makeText(getActivity(), "All Fields Must Be filled", Toast.LENGTH_SHORT).show();
                    } else {
                        SharedPreferences.Editor editor = mpref.edit();
                        editor.putString("USERID", userid);
                        editor.putString("PASSWORD", password);
                        editor.apply();
                        Toast.makeText(getActivity(), "Values Stored", Toast.LENGTH_SHORT).show();


                    }
                }
            }
        });

        return view;
    }



}

