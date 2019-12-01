package com.Learning.com;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_json_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code= "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.util.Log;\n" +
            "import android.view.View;\n" +
            "import android.widget.AdapterView;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ListAdapter;\n" +
            "import android.widget.ListView;\n" +
            "import android.widget.SimpleAdapter;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.android.volley.AuthFailureError;\n" +
            "import com.android.volley.Request;\n" +
            "import com.android.volley.RequestQueue;\n" +
            "import com.android.volley.Response;\n" +
            "import com.android.volley.VolleyError;\n" +
            "import com.android.volley.toolbox.StringRequest;\n" +
            "import com.android.volley.toolbox.Volley;\n" +
            "\n" +
            "import org.json.JSONArray;\n" +
            "import org.json.JSONException;\n" +
            "import org.json.JSONObject;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.HashMap;\n" +
            "import java.util.Map;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    Button fetch;\n" +
            "    ListView lv;\n" +
            "    ArrayList<HashMap<String, String>> contactList;\n" +
            " String url = \"https://api.jsonbin.io/b/5c7cc87d5fe2145877953ede\";\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        fetch=(Button)findViewById(R.id.fetch);\n" +
            "        lv = (ListView)findViewById(R.id.list);\n" +
            "        fetch.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                getJson();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "    private void getJson() {\n" +
            "        RequestQueue queue = Volley.newRequestQueue(this);\n" +
            "        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {\n" +
            "            @Override\n" +
            "            public void onResponse(String response) {\n" +
            "\n" +
            "\n" +
            "                Log.i(\"My success\", response);\n" +
            "                try {\n" +
            "                    contactList = new ArrayList<>();\n" +
            "                    JSONObject jsonObj = new JSONObject(response);\n" +
            "\n" +
            "                    // Getting JSON Array node\n" +
            "                    JSONArray contacts = jsonObj.getJSONArray(\"contacts\");\n" +
            "\n" +
            "                    // looping through All Contacts\n" +
            "                    for (int i = 0; i < contacts.length(); i++) {\n" +
            "                        JSONObject c = contacts.getJSONObject(i);\n" +
            "\n" +
            "                        String id = c.getString(\"id\");\n" +
            "                        String name = c.getString(\"name\");\n" +
            "                        String email = c.getString(\"email\");\n" +
            "                        String address = c.getString(\"address\");\n" +
            "                        String gender = c.getString(\"gender\");\n" +
            "\n" +
            "                        // Phone node is JSON Object\n" +
            "                        JSONObject phone = c.getJSONObject(\"phone\");\n" +
            "                        String mobile = phone.getString(\"mobile\");\n" +
            "                        String home = phone.getString(\"home\");\n" +
            "                        String office = phone.getString(\"office\");\n" +
            "\n" +
            "                        // tmp hash map for single contact\n" +
            "                        HashMap<String, String> contact = new HashMap<>();\n" +
            "\n" +
            "                        // adding each child node to HashMap key => value\n" +
            "                        contact.put(\"id\", id);\n" +
            "                        contact.put(\"name\", name);\n" +
            "                        contact.put(\"email\", email);\n" +
            "                        contact.put(\"mobile\", mobile);\n" +
            "\n" +
            "                        // adding contact to contact list\n" +
            "                        contactList.add(contact);\n" +
            "                        ListAdapter adapter = new SimpleAdapter(\n" +
            "                                MainActivity.this, contactList,\n" +
            "                                R.layout.listitem, new String[]{\"name\", \"email\",\n" +
            "                                \"mobile\"}, new int[]{R.id.name,\n" +
            "                                R.id.email, R.id.mobile});\n" +
            "\n" +
            "                        lv.setAdapter(adapter);\n" +
            "                    }\n" +
            "\n" +
            "                } catch (JSONException e) {\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "        }, new Response.ErrorListener() {\n" +
            "            @Override\n" +
            "            public void onErrorResponse(VolleyError error) {\n" +
            "\n" +
            "                Toast.makeText(MainActivity.this, \"No Network Connection\", Toast.LENGTH_LONG).show();\n" +
            "                Log.i(\"My error\", \"\" + error);\n" +
            "            }\n" +
            "        }) {\n" +
            "            @Override\n" +
            "\n" +
            "            protected Map<String, String> getParams() throws AuthFailureError {\n" +
            "                Map<String, String> map = new HashMap<String, String>();\n" +
            "\n" +
            "                //here you can post any string to server\n" +
            "\n" +
            "\n" +
            "                return map;\n" +
            "            }\n" +
            "        };\n" +
            "        queue.add(request);\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.one_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        Button copy=(Button)view.findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code);
                clipboard.setPrimaryClip(clip);
            }
        });
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        return view;
    }

}

