package com.Learning.com;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_Date_picker_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.DatePicker;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import java.util.Calendar;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "DatePicker datePicker;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        datePicker=(DatePicker)findViewById(R.id.date_picker);\n" +
            "        Calendar calendar=Calendar.getInstance();\n" +
            "        datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),new DatePicker.OnDateChangedListener() {\n" +
            "\n" +
            "            @Override\n" +
            "            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {\n" +
            "                String[] date = {\"\"};\n" +
            "                date[0] =dayOfMonth+\"-\"+monthOfYear+\"-\"+year;\n" +
            "                String s_date=date[0];\n" +
            "                Toast.makeText(MainActivity.this, s_date, Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }



}

