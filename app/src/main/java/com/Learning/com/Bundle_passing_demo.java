package com.Learning.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bundle_passing_demo extends AppCompatActivity {
Button btn;
EditText et_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_passing_demo);
        et_text=(EditText)findViewById(R.id.et_text);
        btn=(Button)findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=et_text.getText().toString();
                Intent intent=new Intent(Bundle_passing_demo.this,SecondActivity.class);
                intent.putExtra("text_sent",text);
                startActivity(intent);
            }
        });
    }

    }
