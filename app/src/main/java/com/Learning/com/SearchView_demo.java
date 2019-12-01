package com.Learning.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchView_demo extends AppCompatActivity implements SearchView.OnQueryTextListener {
    ListView list;
    ListViewAdapter adapter;
    SearchView editsearch;
    String[] versionNameList;
    ArrayList<VersionNames> arraylist = new ArrayList<VersionNames>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_demo);
        versionNameList = new String[]{"Alpha", "Beta", "CupCake",
                "Donut", "Eclair", "Fryso", "GingerBread", "HoneyCombs",
                "IceCreamSandwich","JellyBean","Kitkat","Lollipop","MarshMellow","Noughat","Oreo","Pie"};

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listview);

        for (int i = 0; i < versionNameList.length; i++) {
            VersionNames versionNames = new VersionNames(versionNameList[i]);
            // Binds all strings into an array
            arraylist.add(versionNames);
        }

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);


    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}
class VersionNames {
    private String versionNames;

    public VersionNames(String versionNames) {
        this.versionNames = versionNames;
    }

    public String getVersionNames() {
        return this.versionNames;
    }


}