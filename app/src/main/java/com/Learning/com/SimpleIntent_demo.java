package com.Learning.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimpleIntent_demo extends AppCompatActivity {
    Button clickbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_intent_demo);
        clickbutton=(Button)findViewById(R.id.click);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SimpleIntent_demo.this,SecondActivity.class);
                //SecondActivity(replace with your activity...
                startActivity(intent);
            }
        });
    }
}
