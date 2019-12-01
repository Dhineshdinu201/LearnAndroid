package com.Learning.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=(TextView)findViewById(R.id.text);
        try {
            String textt = getIntent().getStringExtra("text_sent");
            text.setText(textt);
        }catch (NullPointerException e){
            e.printStackTrace();
            text.setText("This is the second activity");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
