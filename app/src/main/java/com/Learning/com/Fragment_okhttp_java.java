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

public class Fragment_okhttp_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Context;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.app.ProgressDialog;\n" +
            "import android.os.AsyncTask;\n" +
            "import android.util.Log;\n" +
            "import android.widget.ListAdapter;\n" +
            "import android.widget.ListView;\n" +
            "import android.widget.SimpleAdapter;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import org.json.JSONArray;\n" +
            "import org.json.JSONException;\n" +
            "import org.json.JSONObject;\n" +
            "\n" +
            "import java.io.IOException;\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.HashMap;\n" +
            "\n" +
            "import okhttp3.OkHttpClient;\n" +
            "import okhttp3.Request;\n" +
            "import okhttp3.Response;\n" +
            "\n" +
            "import static android.support.constraint.Constraints.TAG;\n" +
            "\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    Context context=this;\n" +
            "    private static String url = \"https://api.androidhive.info/contacts/\";\n" +
            "    ArrayList<HashMap<String, String>> contactList;\n" +
            "    ListView lv;\n" +
            "    private ProgressDialog pDialog;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        contactList = new ArrayList<>();\n" +
            "\n" +
            "        lv = (ListView)findViewById(R.id.list);\n" +
            "        new GetContacts().execute();\n" +
            "    }\n" +
            "    private class GetContacts extends AsyncTask<Void, Void, String> {\n" +
            "        String jsonStr;\n" +
            "\n" +
            "        @Override\n" +
            "        protected void onPreExecute() {\n" +
            "            super.onPreExecute();\n" +
            "            // Showing progress dialog\n" +
            "            pDialog = new ProgressDialog(context);\n" +
            "            pDialog.setMessage(\"Please wait...\");\n" +
            "            pDialog.setCancelable(false);\n" +
            "            pDialog.show();\n" +
            "\n" +
            "        }\n" +
            "        @Override\n" +
            "        protected void onPostExecute(String result) {\n" +
            "            super.onPostExecute(result);\n" +
            "            // Dismiss the progress dialog\n" +
            "            jsonStr = String.valueOf(result);\n" +
            "            if (pDialog.isShowing())\n" +
            "                pDialog.dismiss();\n" +
            "            /**\n" +
            "             * Updating parsed JSON data into ListView\n" +
            "             * */\n" +
            "            Log.e(TAG, \"Response from url: \" + jsonStr);\n" +
            "\n" +
            "            if (jsonStr != null) {\n" +
            "                try {\n" +
            "                    JSONObject jsonObj = new JSONObject(jsonStr);\n" +
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
            "                    }\n" +
            "                } catch (final JSONException e) {\n" +
            "                    Log.e(TAG, \"Json parsing error: \" + e.getMessage());\n" +
            "                    runOnUiThread(new Runnable() {\n" +
            "                        @Override\n" +
            "                        public void run() {\n" +
            "                            Toast.makeText(context, \"Json parsing error: \" + e.getMessage(), Toast.LENGTH_LONG).show();\n" +
            "                        }\n" +
            "                    });\n" +
            "\n" +
            "                }\n" +
            "            } else {\n" +
            "                Log.e(TAG, \"Couldn't get json from server.\");\n" +
            "                runOnUiThread(new Runnable() {\n" +
            "                    @Override\n" +
            "                    public void run() {\n" +
            "                        Toast.makeText(context, \"Couldn't get json from server. Check LogCat for possible errors!\", Toast.LENGTH_LONG).show();\n" +
            "                    }\n" +
            "                });\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "            ListAdapter adapter = new SimpleAdapter(MainActivity.this, contactList, R.layout.listitem, new String[]{\"name\", \"email\", \"mobile\"}, new int[]{R.id.name, R.id.email, R.id.mobile});\n" +
            "\n" +
            "            lv.setAdapter(adapter);\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        protected String doInBackground(Void... voids) {\n" +
            "            OkHttpClient okHttpClient=new OkHttpClient();\n" +
            "            Request request=new Request.Builder()\n" +
            "                    .url(url)\n" +
            "                    .build();\n" +
            "            try {\n" +
            "                Response response=okHttpClient.newCall(request).execute();\n" +
            "                return response.body().string();\n" +
            "            } catch (IOException e) {\n" +
            "                e.printStackTrace();\n" +
            "                return \"\";\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "        // Making a request to url and getting response\n" +
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


