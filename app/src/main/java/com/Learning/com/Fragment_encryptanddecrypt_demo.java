package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.pahlevikun.droidcrypt.DroidCrypt;
import id.pahlevikun.droidcrypt.model.Data;
import id.pahlevikun.droidcrypt.type.Algorithm;

public class Fragment_encryptanddecrypt_demo extends Fragment {
    TextView result;
    Button e_with,e_without,d_with,d_without;
    EditText e_text;
    String key="KEY_IN_STRING";
    Data encrypted=null,decrypted=null;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_encrypt_and_decrypt_demo, container, false);
        result=(TextView)view.findViewById(R.id.result);
        e_with=(Button)view.findViewById(R.id.e_with);
        e_without=(Button)view.findViewById(R.id.e_without);
        d_with=(Button)view.findViewById(R.id.d_with);
        d_without=(Button)view.findViewById(R.id.d_without);
        e_text=(EditText)view.findViewById(R.id.et_text);
        e_with.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    DroidCrypt droidCrypt = new DroidCrypt(getActivity());
                    encrypted = droidCrypt.startEncryptWithBase64(key, Algorithm.MD5.getType(), e_text.getText().toString());
                    result.setText(encrypted.getTextInString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
        e_without.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    DroidCrypt droidCrypt = new DroidCrypt(getActivity());
                    encrypted = droidCrypt.startEncryptWithoutBase64(key, Algorithm.MD5.getType(), e_text.getText().toString());
                    result.setText(encrypted.getTextInString());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        d_with.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    DroidCrypt droidCrypt = new DroidCrypt(getActivity());
                    decrypted = droidCrypt.startDecryptWithBase64(key, Algorithm.MD5.getType(), encrypted);
                    result.setText(decrypted.getTextInString());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        d_without.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    DroidCrypt droidCrypt = new DroidCrypt(getActivity());
                    decrypted = droidCrypt.startDecryptWithoutBase64(key, Algorithm.MD5.getType(), encrypted);
                    result.setText(decrypted.getTextInString());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        return view;
    }
}
