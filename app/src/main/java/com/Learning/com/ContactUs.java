package com.Learning.com;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {
    EditText et_name, et_email, et_phone, et_message;
    Button btn_submit, btn_cancel;
    String name, location, email, phone, message;
    String attachmentFile;
    Uri URI = null;
    private static final int PICK_FROM_GALLERY = 101;
    int columnIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        et_name = (EditText) findViewById(R.id.et_name);
        et_email = (EditText) findViewById(R.id.et_email);
        et_phone = (EditText) findViewById(R.id.et_contact);
        et_message = (EditText) findViewById(R.id.et_message);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_cancel = (Button) findViewById(R.id.btn_cancel);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //edittext to string

                name = et_name.getText().toString();

                email = et_email.getText().toString();
                phone = et_phone.getText().toString();
                message = et_message.getText().toString();
                if (email.isEmpty()) {
                    Toast.makeText(ContactUs.this, "Please fill the above details", Toast.LENGTH_SHORT).show();
                } else {

                    try {
                        Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Query About Android Studio");
                        intent.putExtra(Intent.EXTRA_TEXT, "Name :" + name + "\n" + "Email :" + email + "\n" + "Phone" + " :" + phone + "\n" + "message :" + message);
                        intent.setData(Uri.parse("mailto:aldevelopers01@gmail.com"));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                        if (URI != null) {
                            intent.putExtra(Intent.EXTRA_STREAM, URI);
                        }
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        Toast.makeText(ContactUs.this, "Mailer Not Found", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });


        //**************************Cancel button*********************************

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });

    }
}
