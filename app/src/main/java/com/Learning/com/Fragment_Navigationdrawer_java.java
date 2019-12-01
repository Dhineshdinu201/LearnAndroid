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

public class Fragment_Navigationdrawer_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.content.Intent;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "importimport android.os.Bundle;\n" +
            "import android.support.design.widget.FloatingActionButton;\n" +
            "import android.support.design.widget.Snackbar;\n" +
            "import android.view.View;\n" +
            "import android.support.design.widget.NavigationView;\n" +
            "import android.support.v4.view.GravityCompat;\n" +
            "import android.support.v4.widget.DrawerLayout;\n" +
            "import android.support.v7.app.ActionBarDrawerToggle;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.support.v7.widget.Toolbar;\n" +
            "import android.view.Menu;\n" +
            "import android.view.MenuItem;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity\n" +
            "        implements NavigationView.OnNavigationItemSelectedListener {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);\n" +
            "        setSupportActionBar(toolbar);\n" +
            "\n" +
            "        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);\n" +
            "        fab.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                Snackbar.make(view, \"Replace with your own action\", Snackbar.LENGTH_LONG)\n" +
            "                        .setAction(\"Action\", null).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);\n" +
            "        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(\n" +
            "                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);\n" +
            "        drawer.addDrawerListener(toggle);\n" +
            "        toggle.syncState();\n" +
            "\n" +
            "        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);\n" +
            "        navigationView.setNavigationItemSelectedListener(this);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onBackPressed() {\n" +
            "        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);\n" +
            "        if (drawer.isDrawerOpen(GravityCompat.START)) {\n" +
            "            drawer.closeDrawer(GravityCompat.START);\n" +
            "        } else {\n" +
            "            super.onBackPressed();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
            "        // Inflate the menu; this adds items to the action bar if it is present.\n" +
            "        getMenuInflater().inflate(R.menu.main, menu);\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onOptionsItemSelected(MenuItem item) {\n" +
            "        // Handle action bar item clicks here. The action bar will\n" +
            "        // automatically handle clicks on the Home/Up button, so long\n" +
            "        // as you specify a parent activity in AndroidManifest.xml.\n" +
            "        int id = item.getItemId();\n" +
            "\n" +
            "        //noinspection SimplifiableIfStatement\n" +
            "        if (id == R.id.action_settings) {\n" +
            "            return true;\n" +
            "        }\n" +
            "\n" +
            "        return super.onOptionsItemSelected(item);\n" +
            "    }\n" +
            "\n" +
            "    @SuppressWarnings(\"StatementWithEmptyBody\")\n" +
            "    @Override\n" +
            "    public boolean onNavigationItemSelected(MenuItem item) {\n" +
            "        // Handle navigation view item clicks here.\n" +
            "        int id = item.getItemId();\n" +
            "\n" +
            "        if (id == R.id.nav_camera) {\n" +
            "            // Handle the camera action\n" +
            "            Toast.makeText(this, \"Camera\", Toast.LENGTH_SHORT).show();\n" +
            "        } else if (id == R.id.nav_gallery) {\n" +
            "            Toast.makeText(this, \"nav_gallery\", Toast.LENGTH_SHORT).show();\n" +
            "        } else if (id == R.id.nav_slideshow) {\n" +
            "            Toast.makeText(this, \"nav_slideshow\", Toast.LENGTH_SHORT).show();\n" +
            "        } else if (id == R.id.nav_manage) {\n" +
            "            Toast.makeText(this, \"nav_manage\", Toast.LENGTH_SHORT).show();\n" +
            "        } else if (id == R.id.nav_share) {\n" +
            "            Toast.makeText(this, \"nav_share\", Toast.LENGTH_SHORT).show();\n" +
            "        } else if (id == R.id.nav_send) {\n" +
            "            Toast.makeText(this, \"nav_send\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);\n" +
            "        drawer.closeDrawer(GravityCompat.START);\n" +
            "        return true;\n" +
            "    }\n" +
            "}\n"
            ;
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

