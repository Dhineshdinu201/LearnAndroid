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

public class Fragment_tabbedactivity_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.support.design.widget.FloatingActionButton;\n" +
            "import android.support.design.widget.Snackbar;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.support.v7.widget.Toolbar;\n" +
            "\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.support.v4.app.FragmentManager;\n" +
            "import android.support.v4.app.FragmentPagerAdapter;\n" +
            "import android.support.v4.view.ViewPager;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.Menu;\n" +
            "import android.view.MenuItem;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    /**\n" +
            "     * The {@link android.support.v4.view.PagerAdapter} that will provide\n" +
            "     * fragments for each of the sections. We use a\n" +
            "     * {@link FragmentPagerAdapter} derivative, which will keep every\n" +
            "     * loaded fragment in memory. If this becomes too memory intensive, it\n" +
            "     * may be best to switch to a\n" +
            "     * {@link android.support.v4.app.FragmentStatePagerAdapter}.\n" +
            "     */\n" +
            "    private SectionsPagerAdapter mSectionsPagerAdapter;\n" +
            "\n" +
            "    /**\n" +
            "     * The {@link ViewPager} that will host the section contents.\n" +
            "     */\n" +
            "    private ViewPager mViewPager;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);\n" +
            "        setSupportActionBar(toolbar);\n" +
            "        // Create the adapter that will return a fragment for each of the three\n" +
            "        // primary sections of the activity.\n" +
            "        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());\n" +
            "\n" +
            "        // Set up the ViewPager with the sections adapter.\n" +
            "        mViewPager = (ViewPager) findViewById(R.id.container);\n" +
            "        mViewPager.setAdapter(mSectionsPagerAdapter);\n" +
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
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
            "        // Inflate the menu; this adds items to the action bar if it is present.\n" +
            "        getMenuInflater().inflate(R.menu.menu_main, menu);\n" +
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
            "    /**\n" +
            "     * A placeholder fragment containing a simple view.\n" +
            "     */\n" +
            "    public static class PlaceholderFragment extends Fragment {\n" +
            "        /**\n" +
            "         * The fragment argument representing the section number for this\n" +
            "         * fragment.\n" +
            "         */\n" +
            "        private static final String ARG_SECTION_NUMBER = \"section_number\";\n" +
            "\n" +
            "        public PlaceholderFragment() {\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Returns a new instance of this fragment for the given section\n" +
            "         * number.\n" +
            "         */\n" +
            "        public static PlaceholderFragment newInstance(int sectionNumber) {\n" +
            "            PlaceholderFragment fragment = new PlaceholderFragment();\n" +
            "            Bundle args = new Bundle();\n" +
            "            args.putInt(ARG_SECTION_NUMBER, sectionNumber);\n" +
            "            fragment.setArguments(args);\n" +
            "            return fragment;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
            "                                 Bundle savedInstanceState) {\n" +
            "            View rootView = inflater.inflate(R.layout.fragment_main, container, false);\n" +
            "            TextView textView = (TextView) rootView.findViewById(R.id.section_label);\n" +
            "            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));\n" +
            "            return rootView;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to\n" +
            "     * one of the sections/tabs/pages.\n" +
            "     */\n" +
            "    public class SectionsPagerAdapter extends FragmentPagerAdapter {\n" +
            "\n" +
            "        public SectionsPagerAdapter(FragmentManager fm) {\n" +
            "            super(fm);\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public Fragment getItem(int position) {\n" +
            "            // getItem is called to instantiate the fragment for the given page.\n" +
            "            // Return a PlaceholderFragment (defined as a static inner class below).\n" +
            "            return PlaceholderFragment.newInstance(position + 1);\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public int getCount() {\n" +
            "            // Show 3 total pages.\n" +
            "            return 3;\n" +
            "        }\n" +
            "    }\n" +
            "}\n"
            ;
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

