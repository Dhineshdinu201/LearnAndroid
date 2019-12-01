package com.Learning.com;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class BaseScreen extends AppCompatActivity {

    private TextView mTextMessage;
    Fragment fragment=null;
String position;

    TextView title;

    Bundle bundle = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_screen);

        title=(TextView)findViewById(R.id.text_title);
        FloatingActionMenu menu;
        FloatingActionButton b2,b3,b4,b5,b6;



        mTextMessage = (TextView) findViewById(R.id.message);

        position=getIntent().getStringExtra("title");
//+++++++++++++++++++++++++++++++++++Basic+++++++++++++++++++++++++++++++++++++++++
        if(position.equals("textview")) {
            title.setText("Textview Reference");

            fragment = new Fragment_Textview_ref();

            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("edittext")) {
            title.setText("EditText Reference");
            fragment = new Fragment_Textview_ref();
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("imageview")) {
            title.setText("Imageview Reference");
            fragment = new Fragment_Textview_ref();
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("button")) {
            title.setText("Button Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "button");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("AutoCompleteTextView")) {
            title.setText("AutoCompleteTextView Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "AutoCompleteTextView");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("MultiAutoCompleteTextView")) {
            title.setText("MultiAutoCompleteTextView Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "MultiAutoCompleteTextView");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("Radiobutton_and_Radiogroup")) {
            title.setText("Radiobutton and Radiogroup Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Radiobutton_and_Radiogroup");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("Checkbox")) {
            title.setText("Checkbox Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Checkbox");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("toogle")) {
            title.setText("Toogle Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "toogle");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("progressbar")) {
            title.setText("Progressbar Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "progressbar");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("clock")) {
            title.setText("Clock Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "clock");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("datepicker")) {
            title.setText("Datepicker Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "datepicker");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("simpleandcustomtoast")) {
            title.setText("simpleandcustomtoast Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "simpleandcustomtoast");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("Alertdialog")) {
            title.setText("Alertdialog Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("customalertdialog")) {
            title.setText("customalertdialog Reference");
            fragment = new Fragment_custom_xml();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("simpleintent")) {
            title.setText("Simple Intent Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("bundlepassing")) {
            title.setText("BundlePassing Intent Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("fragment")) {
            title.setText("Fragment Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("spinner")) {
            title.setText("Spinner Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("swipeRefreshLayout")) {
            title.setText("swipeRefreshLayout Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("implicitintent")) {
            title.setText("Dialer Intent Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("scrollview")) {
            title.setText("scrollview Reference");
            fragment = new Fragment_scrollview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("curveedge")) {
            title.setText("Curve Edge Buttons Reference");
            fragment = new Fragment_curve_edge_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }




        //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++

        if(position.equals("imageandtextswitcher")) {
            title.setText("Image And TextSwitcher Reference");
            fragment = new Fragment_curve_edge_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("viewflipper")) {
            title.setText("ViewFlipper Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Animation")) {
            title.setText("Animation Reference");
            fragment = new Fragment_animation_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("listview")) {
            title.setText("ListView Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Customlistview")) {
            title.setText("CustomListView Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("expandablelistview")) {
            title.setText("ExpandableListView Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("gridview")) {
            title.setText("GridView Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("webview")) {
            title.setText("WebView Reference");
            fragment = new Fragment_webview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("searchview")) {
            title.setText("SearchView Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("tablayout")) {
            title.setText("TabLayout Reference");
            fragment = new Fragment_tabbed_activity_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("viewpager")) {
            title.setText("ViewPager Reference");
            fragment = new Fragment_curve_edge_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("BottomNavigation")) {
            title.setText("Bottom Navigation Reference");
            fragment = new Fragment_bottom_navigation_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("NavigationDrawer")) {
            title.setText("Navigation Drawer Reference");
            fragment = new Fragment_Navigationdrawer_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Recyclerandcardview")) {
            title.setText("RecyclerView and CardView Reference");
            fragment = new Fragment_RecycclerView_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Notification")) {
            title.setText("Notification Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Recyclerviewinsiderecyclerview")) {
            title.setText("RecyclerView Inside RecyclerView Reference");
            fragment = new Fragment_Recyclerview_inside_recyclerview();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Arraylistinsidearraylist")) {
            title.setText("ArrayList Inside ArrayList Reference");
            fragment = new Fragment_curve_edge_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("fingerprintrecognization")) {
            title.setText("Fingerprint Recognization Reference");
            fragment = new Fragment_fingerprint_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("Imageviewfromurl")) {
            title.setText("ImageView From URL Reference");
            fragment = new Fragment_image_url_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("SharedPref")) {
            title.setText("Shared Preferences Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("sql")) {
            title.setText("SQLite Database Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        if(position.equals("services")) {
            title.setText("Background Services Reference");
            fragment = new Fragment_custom_xml_java();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }








        //+++++++++++++++++++++++++++++++++++Library+++++++++++++++++++++++++++++++++++++++++


        if(position.equals("Volley")) {
            title.setText("Volley Reference");
            fragment = new Fragment_json_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }


        if(position.equals("OKHTTP")) {
            title.setText("OKHTTP Reference");
            fragment = new Fragment_okhttp_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("sendImageToServer")) {
            title.setText("sendImageToServer Reference");
            fragment = new Fragment_expandable_re_view_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("ex_recycler")) {
            title.setText("Expandable RecyclerView Reference");
            fragment = new Fragment_image_server_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("encrypt")) {
            title.setText("Encrypt and Decrypt Reference");
            fragment = new Fragment_encryptanddecrypt_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("patternlockview")) {
            title.setText("Pattern Lockview Reference");
            fragment = new Fragment_pattern_lock_view_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("advancedwebview")) {
            title.setText("Advanced Webview Reference");
            fragment = new Fragment_AdvancedWebView_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("Qrcode")) {
            title.setText("Qr Code Scanner Reference");
            fragment = new Fragment_qrscanner_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("pdf")) {
            title.setText("Pdf Creator Reference");
            fragment = new Fragment_pdf_creator_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("floatingmenu")) {
            title.setText("Floating Menu Reference");
            fragment = new Fragment_floatingmenu_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("text_speech")) {
            title.setText("Text To Speech Reference");
            fragment = new Fragment_Textview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("speech_text")) {
            title.setText("Speech To Text Reference");
            fragment = new Fragment_Speech_text_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("Image_text")) {
            title.setText("Image To Text Reference");
            fragment = new Fragment_Image_text_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("mapview")) {
            title.setText("MapView with Current Location Reference");
            fragment = new Fragment_image_server_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }
        if(position.equals("gifimage")) {
            title.setText("Gif ImageView  Reference");
            fragment = new Fragment_gifimageview_ref();
            bundle.putString("params", "Alertdialog");
            fragment.setArguments(bundle);
            loadFragment(fragment);
        }

        menu=(FloatingActionMenu)findViewById(R.id.menu);
        menu.setClosedOnTouchOutside(true);
        menu.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean opened) {
                Vibrator vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                if(opened){
                    if(vibrator!=null){
                        vibrator.vibrate(50);
                    }
                }else {
                    if(vibrator!=null){
                        vibrator.vibrate(50);
                    }
                }
            }
        });

        b2=(FloatingActionButton)findViewById(R.id.b2);
        b3=(FloatingActionButton)findViewById(R.id.b3);
        b4=(FloatingActionButton)findViewById(R.id.b4);
        b5=(FloatingActionButton)findViewById(R.id.b5);

//*************************************************b5**********************************

        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {

//+++++++++++++++++++++++++++++++++++Basic+++++++++++++++++++++++++++++++++++++++++
                                      if (position.equals("textview")) {
                                          title.setText("Textview Reference");

                                          fragment = new Fragment_Textview_ref();

                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("edittext")) {
                                          title.setText("EditText Reference");
                                          fragment = new Fragment_Textview_ref();
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("imageview")) {
                                          title.setText("Imageview Reference");
                                          fragment = new Fragment_Textview_ref();
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("button")) {
                                          title.setText("Button Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "button");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("AutoCompleteTextView")) {
                                          title.setText("AutoCompleteTextView Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "AutoCompleteTextView");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("MultiAutoCompleteTextView")) {
                                          title.setText("MultiAutoCompleteTextView Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "MultiAutoCompleteTextView");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("Radiobutton_and_Radiogroup")) {
                                          title.setText("Radiobutton and Radiogroup Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Radiobutton_and_Radiogroup");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("Checkbox")) {
                                          title.setText("Checkbox Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Checkbox");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("toogle")) {
                                          title.setText("Toogle Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "toogle");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("progressbar")) {
                                          title.setText("Progressbar Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "progressbar");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("clock")) {
                                          title.setText("Clock Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "clock");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("datepicker")) {
                                          title.setText("Datepicker Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "datepicker");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("simpleandcustomtoast")) {
                                          title.setText("simpleandcustomtoast Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "simpleandcustomtoast");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("Alertdialog")) {
                                          title.setText("Alertdialog Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("customalertdialog")) {
                                          title.setText("customalertdialog Reference");
                                          fragment = new Fragment_custom_xml();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("simpleintent")) {
                                          title.setText("Simple Intent Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("bundlepassing")) {
                                          title.setText("BundlePassing Intent Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("fragment")) {
                                          title.setText("Fragment Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("spinner")) {
                                          title.setText("Spinner Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("swipeRefreshLayout")) {
                                          title.setText("swipeRefreshLayout Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("implicitintent")) {
                                          title.setText("Dialer Intent Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("scrollview")) {
                                          title.setText("scrollview Reference");
                                          fragment = new Fragment_scrollview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("curveedge")) {
                                          title.setText("Curve Edge Buttons Reference");
                                          fragment = new Fragment_curve_edge_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }


                                      //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++

                                      if (position.equals("imageandtextswitcher")) {
                                          title.setText("Image And TextSwitcher Reference");
                                          fragment = new Fragment_curve_edge_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("viewflipper")) {
                                          title.setText("ViewFlipper Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Animation")) {
                                          title.setText("Animation Reference");
                                          fragment = new Fragment_animation_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("listview")) {
                                          title.setText("ListView Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Customlistview")) {
                                          title.setText("CustomListView Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("expandablelistview")) {
                                          title.setText("ExpandableListView Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("gridview")) {
                                          title.setText("GridView Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("webview")) {
                                          title.setText("WebView Reference");
                                          fragment = new Fragment_webview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("searchview")) {
                                          title.setText("SearchView Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("tablayout")) {
                                          title.setText("TabLayout Reference");
                                          fragment = new Fragment_tabbed_activity_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("viewpager")) {
                                          title.setText("ViewPager Reference");
                                          fragment = new Fragment_curve_edge_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("BottomNavigation")) {
                                          title.setText("Bottom Navigation Reference");
                                          fragment = new Fragment_bottom_navigation_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("NavigationDrawer")) {
                                          title.setText("Navigation Drawer Reference");
                                          fragment = new Fragment_Navigationdrawer_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Recyclerandcardview")) {
                                          title.setText("RecyclerView and CardView Reference");
                                          fragment = new Fragment_RecycclerView_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Notification")) {
                                          title.setText("Notification Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Recyclerviewinsiderecyclerview")) {
                                          title.setText("RecyclerView Inside RecyclerView Reference");
                                          fragment = new Fragment_Recyclerview_inside_recyclerview();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Arraylistinsidearraylist")) {
                                          title.setText("ArrayList Inside ArrayList Reference");
                                          fragment = new Fragment_curve_edge_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("fingerprintrecognization")) {
                                          title.setText("Fingerprint Recognization Reference");
                                          fragment = new Fragment_fingerprint_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("Imageviewfromurl")) {
                                          title.setText("ImageView From URL Reference");
                                          fragment = new Fragment_image_url_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("SharedPref")) {
                                          title.setText("Shared Preferences Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("sql")) {
                                          title.setText("SQLite Database Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }

                                      if (position.equals("services")) {
                                          title.setText("Background Services Reference");
                                          fragment = new Fragment_custom_xml_java();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }


                                      //+++++++++++++++++++++++++++++++++++Library+++++++++++++++++++++++++++++++++++++++++


                                      if (position.equals("Volley")) {
                                          title.setText("Volley Reference");
                                          fragment = new Fragment_json_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }


                                      if (position.equals("OKHTTP")) {
                                          title.setText("OKHTTP Reference");
                                          fragment = new Fragment_okhttp_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("sendImageToServer")) {
                                          title.setText("sendImageToServer Reference");
                                          fragment = new Fragment_expandable_re_view_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("ex_recycler")) {
                                          title.setText("Expandable RecyclerView Reference");
                                          fragment = new Fragment_image_server_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("encrypt")) {
                                          title.setText("Encrypt and Decrypt Reference");
                                          fragment = new Fragment_encryptanddecrypt_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("patternlockview")) {
                                          title.setText("Pattern Lockview Reference");
                                          fragment = new Fragment_pattern_lock_view_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("advancedwebview")) {
                                          title.setText("Advanced Webview Reference");
                                          fragment = new Fragment_AdvancedWebView_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("Qrcode")) {
                                          title.setText("Qr Code Scanner Reference");
                                          fragment = new Fragment_qrscanner_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("pdf")) {
                                          title.setText("Pdf Creator Reference");
                                          fragment = new Fragment_pdf_creator_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("floatingmenu")) {
                                          title.setText("Floating Menu Reference");
                                          fragment = new Fragment_floatingmenu_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("text_speech")) {
                                          title.setText("Text To Speech Reference");
                                          fragment = new Fragment_Textview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("speech_text")) {
                                          title.setText("Speech To Text Reference");
                                          fragment = new Fragment_Speech_text_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("Image_text")) {
                                          title.setText("Image To Text Reference");
                                          fragment = new Fragment_Image_text_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("mapview")) {
                                          title.setText("MapView with Current Location Reference");
                                          fragment = new Fragment_image_server_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                      if (position.equals("gifimage")) {
                                          title.setText("Gif ImageView  Reference");
                                          fragment = new Fragment_gifimageview_ref();
                                          bundle.putString("params", "Alertdialog");
                                          fragment.setArguments(bundle);
                                          loadFragment(fragment);
                                      }
                                  }
                              });

                menu = (FloatingActionMenu) findViewById(R.id.menu);
                menu.setClosedOnTouchOutside(true);
                menu.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
                    @Override
                    public void onMenuToggle(boolean opened) {
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        if (opened) {
                            if (vibrator != null) {
                                vibrator.vibrate(50);
                            }
                        } else {
                            if (vibrator != null) {
                                vibrator.vibrate(50);
                            }
                        }

                    }
                });


                //***************************************b4************************


                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //+++++++++++++++++++++++++++++++++++Basic+++++++++++++++++++++++++++++++++++++++++


                        if (position.equals("textview")) {
                            title.setText("Textview XML");

                            fragment = new Fragment_TextView_xml();

                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("edittext")) {
                            title.setText("Edittext XML");
                            fragment = new Fragment_EditText_xml();
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("imageview")) {
                            title.setText("Imageview XML");
                            fragment = new Fragment_ImageView_xml();
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("button")) {
                            title.setText("Button XML");
                            fragment = new Fragment_button_xml();
                            bundle.putString("params", "button");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("AutoCompleteTextView")) {
                            title.setText("AutoCompleteTextView XML");
                            fragment = new Fragment_AutoCompleteTextView_xml();
                            bundle.putString("params", "AutoCompleteTextView");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("MultiAutoCompleteTextView")) {
                            title.setText("MultiAutoCompleteTextView XML");
                            fragment = new Fragment_MultiAutoCompletTextview_xml();
                            bundle.putString("params", "MultiAutoCompleteTextView");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Radiobutton_and_Radiogroup")) {
                            title.setText("Radiobutton and Radiogroup XML");
                            fragment = new Fragment_RadioButton_and_Radiogroup_xml();
                            bundle.putString("params", "Radiobutton_and_Radiogroup");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Checkbox")) {
                            title.setText("Checkbox XML");
                            fragment = new Fragment_CheckBox_xml();
                            bundle.putString("params", "Checkbox");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("toogle")) {
                            title.setText("Toogle XML");
                            fragment = new Fragment_toogle_xml();
                            bundle.putString("params", "toogle");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("progressbar")) {
                            title.setText("Progressbar XML");
                            fragment = new Fragment_progressbar_xml();
                            bundle.putString("params", "progressbar");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("clock")) {
                            title.setText("Clock XML");
                            fragment = new Fragment_clock_xml();
                            bundle.putString("params", "clock");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("datepicker")) {
                            title.setText("Datepicker XML");
                            fragment = new Fragment_DatePicker_xml();
                            bundle.putString("params", "datepicker");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("simpleandcustomtoast")) {
                            title.setText("simpleandcustomtoast XML");
                            fragment = new Fragment_simple_and_custom_toast_xml();
                            bundle.putString("params", "simpleandcustomtoast");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Alertdialog")) {
                            title.setText("Alertdialog XML");
                            fragment = new Fragment_Alertdialog_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("customalertdialog")) {
                            title.setText("customalertdialog XML");
                            fragment = new fragment_custom_alert_dialog_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("simpleintent")) {
                            title.setText("Simple Intent XML");
                            fragment = new Fragment_simple_intent_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("bundlepassing")) {
                            title.setText("BundlePassing Intent XML");
                            fragment = new fragment_bundle_passing_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("fragment")) {
                            title.setText("Fragment XML");
                            fragment = new Fragment_fragment_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("spinner")) {
                            title.setText("Spinner XML");
                            fragment = new Fragment_spinner_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("swipeRefreshLayout")) {
                            title.setText("swipeRefreshLayout XML");
                            fragment = new Fragment_swiperefreshlayout_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("implicitintent")) {
                            title.setText("Dialer Intent XML");
                            fragment = new Fragment_dialer_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("scrollview")) {
                            title.setText("scrollview XML");
                            fragment = new Fragment_scrollview_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("curveedge")) {
                            title.setText("Curve Edge Buttons XML");
                            fragment = new Fragment_curve_edge_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }


                        //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++
                        //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++

                        if (position.equals("imageandtextswitcher")) {
                            title.setText("Image And TextSwitcher XML");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("viewflipper")) {
                            title.setText("ViewFlipper XML");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Animation")) {
                            title.setText("Animation XML");
                            fragment = new Fragment_viewflipper_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("listview")) {
                            title.setText("ListView XML");
                            fragment = new Fragment_list_view_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Customlistview")) {
                            title.setText("CustomListView XML");
                            fragment = new Fragment_custom_listView_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("expandablelistview")) {
                            title.setText("ExpandableListView XML");
                            fragment = new Fragment_expandable_listview_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("gridview")) {
                            title.setText("GridView XML");
                            fragment = new Fragment_gridview_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("webview")) {
                            title.setText("WebView XML");
                            fragment = new Fragment_webview_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("searchview")) {
                            title.setText("SearchView XML");
                            fragment = new Fragment_SearchView_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("tablayout")) {
                            title.setText("TabLayout XML");
                            fragment = new Fragment_tabbed_activity_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("viewpager")) {
                            title.setText("ViewPager XML");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("BottomNavigation")) {
                            title.setText("Bottom Navigation XML");
                            fragment = new Fragment_bottom_navigation_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("NavigationDrawer")) {
                            title.setText("Navigation Drawer XML");
                            fragment = new Fragment_Navigationdrawer_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Recyclerandcardview")) {
                            title.setText("RecyclerView and CardView XML");
                            fragment = new Fragment_recyclerView_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Notification")) {
                            title.setText("Notification XML");
                            fragment = new Fragment_notification_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Recyclerviewinsiderecyclerview")) {
                            title.setText("RecyclerView Inside RecyclerView XML");
                            fragment = new Fragment_Recyclerview_inside_recyclerview();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Arraylistinsidearraylist")) {
                            title.setText("ArrayList Inside ArrayList XML");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("fingerprintrecognization")) {
                            title.setText("Fingerprint Recognization XML");
                            fragment = new Fragment_fingerprint_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Imageviewfromurl")) {
                            title.setText("ImageView From URL XML");
                            fragment = new Fragment_image_url_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("SharedPref")) {
                            title.setText("Shared Preferences XML");
                            fragment = new Fragment_sp_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("sql")) {
                            title.setText("SQLite Database XML");
                            fragment = new Fragment_sql_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("services")) {
                            title.setText("Background Services XML");
                            fragment = new Fragment_Backgroundservices_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }


                        //+++++++++++++++++++++++++++++++++++Library+++++++++++++++++++++++++++++++++++++++++


                        if (position.equals("Volley")) {
                            title.setText("Volley XML");
                            fragment = new Fragment_json_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("OKHTTP")) {
                            title.setText("OKHTTP XML");
                            fragment = new Fragment_okhttp_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("sendImageToServer")) {
                            title.setText("sendImageToServer XML");
                            fragment = new fragment_image_server_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("ex_recycler")) {
                            title.setText("Expandable RecyclerView XML");
                            fragment = new Fragment_expandable_re_view_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("encrypt")) {
                            title.setText("Encrypt and Decrypt XML");
                            fragment = new Fragment_encryptanddecrypt_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("patternlockview")) {
                            title.setText("Pattern Lockview XML");
                            fragment = new Fragment_pattern_lockview_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("advancedwebview")) {
                            title.setText("Advanced Webview XML");
                            fragment = new Fragment_AdvancedWebView_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Qrcode")) {
                            title.setText("Qr Code Scanner XML");
                            fragment = new Fragment_qrscanner_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("pdf")) {
                            title.setText("Pdf Creator XML");
                            fragment = new Fragment_pdf_creator_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("floatingmenu")) {
                            title.setText("Floating Menu XML");
                            fragment = new Fragment_floatingmenu_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("text_speech")) {
                            title.setText("Text To Speech XML");
                            fragment = new Fragment_text_speech_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("speech_text")) {
                            title.setText("Speech To Text XML");
                            fragment = new Fragment_speech_text_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Image_text")) {
                            title.setText("Image To Text XML");
                            fragment = new Fragment_Image_text_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("mapview")) {
                            title.setText("MapView with Current Location XML");
                            fragment = new Fragment_image_server_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("gifimage")) {
                            title.setText("Gif ImageView  XML");
                            fragment = new Fragment_gifimageview_xml();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                    }
                });


                //******************************b3****************************


                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //+++++++++++++++++++++++++++++++++++Basic+++++++++++++++++++++++++++++++++++++++++


                        if (position.equals("textview")) {
                            title.setText("Textview Java");

                            fragment = new Fragment_TextView_java();

                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("edittext")) {
                            title.setText("Edittext Java");
                            fragment = new Fragment_edittext_java();
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("imageview")) {
                            title.setText("Imageview java");
                            fragment = new Fragment_ImageView_Java();
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("button")) {
                            title.setText("Button Java");
                            fragment = new Fragment_button_java();
                            bundle.putString("params", "button");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("AutoCompleteTextView")) {
                            title.setText("AutoCompleteTextView Java");
                            fragment = new Fragment_AutoComplete_TextView_java();
                            bundle.putString("params", "AutoCompleteTextView");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("MultiAutoCompleteTextView")) {
                            title.setText("MultiAutoCompleteTextView Java");
                            fragment = new Fragment_MulitiAutoCompleteTexview_java();
                            bundle.putString("params", "MultiAutoCompleteTextView");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Radiobutton_and_Radiogroup")) {
                            title.setText("Radiobutton and Radiogroup Java");
                            fragment = new Fragment_RadioGroup_java();
                            bundle.putString("params", "Radiobutton_and_Radiogroup");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Checkbox")) {
                            title.setText("Checkbox Java");
                            fragment = new Fragment_Checkbox_java();
                            bundle.putString("params", "Checkbox");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("toogle")) {
                            title.setText("Toogle Java");
                            fragment = new Fragment_toogle_java();
                            bundle.putString("params", "toogle");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("progressbar")) {
                            title.setText("Progressbar Java");
                            fragment = new Fragment_progressbar_java();
                            bundle.putString("params", "progressbar");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("clock")) {
                            title.setText("Clock Java");
                            fragment = new Fragment_clock_java();
                            bundle.putString("params", "clock");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("datepicker")) {
                            title.setText("Datepicker Java");
                            fragment = new Fragment_Date_picker_java();
                            bundle.putString("params", "datepicker");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("simpleandcustomtoast")) {
                            title.setText("simpleandcustomtoast Java");
                            fragment = new Fragment_simple_and_custom_toast_java();
                            bundle.putString("params", "simpleandcustomtoast");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Alertdialog")) {
                            title.setText("Alertdialog Java");
                            fragment = new Fragment_Alert_dialog_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("customalertdialog")) {
                            title.setText("customalertdialog Java");
                            fragment = new Fragment_custom_alert_dialog_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("simpleintent")) {
                            title.setText("Simple Intent Java");
                            fragment = new Fragment_simple_intent_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("bundlepassing")) {
                            title.setText("BundlePassing Intent Java");
                            fragment = new fragment_bundle_passing_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("fragment")) {
                            title.setText("Fragment Java");
                            fragment = new Fragment_fragment_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("spinner")) {
                            title.setText("Spinner Java");
                            fragment = new Fragment_spinner_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("swipeRefreshLayout")) {
                            title.setText("swipeRefreshLayout Java");
                            fragment = new Fragment_swiperefreshlayout_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("implicitintent")) {
                            title.setText("Dialer Intent Java");
                            fragment = new Fragment_dialer_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("scrollview")) {
                            title.setText("scrollview Java");
                            fragment = new Fragment_scroll_view_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("curveedge")) {
                            title.setText("Curve Edge Buttons Java");
                            fragment = new Fragment_curve_edge_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }


                        //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++

                        //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++

                        if (position.equals("imageandtextswitcher")) {
                            title.setText("Image And TextSwitcher Java");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("viewflipper")) {
                            title.setText("ViewFlipper Java");
                            fragment = new Fragment_view_flipper_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Animation")) {
                            title.setText("Animation Java");
                            fragment = new Fragment_animation_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("listview")) {
                            title.setText("ListView Java");
                            fragment = new Fragment_list_view_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Customlistview")) {
                            title.setText("CustomListView Java");
                            fragment = new Fragment_custom_listView_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("expandablelistview")) {
                            title.setText("ExpandableListView Java");
                            fragment = new Fragment_expandable_listview_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("gridview")) {
                            title.setText("GridView Java");
                            fragment = new Fragment_gridview_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("webview")) {
                            title.setText("WebView Java");
                            fragment = new Fragment_webview_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("searchview")) {
                            title.setText("SearchView Java");
                            fragment = new Fragment_SearchView_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("tablayout")) {
                            title.setText("TabLayout Java");
                            fragment = new Fragment_tabbedactivity_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("viewpager")) {
                            title.setText("ViewPager Java");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("BottomNavigation")) {
                            title.setText("Bottom Navigation Java");
                            fragment = new Fragment_bottomNavigation_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("NavigationDrawer")) {
                            title.setText("Navigation Drawer Java");
                            fragment = new Fragment_Navigationdrawer_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Recyclerandcardview")) {
                            title.setText("RecyclerView and CardView Java");
                            fragment = new Fragment_Recycler_view_Java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Notification")) {
                            title.setText("Notification Demo");
                            fragment = new Fragment_notification_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Recyclerviewinsiderecyclerview")) {
                            title.setText("RecyclerView Inside RecyclerView Java");
                            fragment = new Fragment_Recyclerview_inside_recyclerview();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Arraylistinsidearraylist")) {
                            title.setText("ArrayList Inside ArrayList Java");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("fingerprintrecognization")) {
                            title.setText("Fingerprint Recognization Java");
                            fragment = new Fragment_fingerprint_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Imageviewfromurl")) {
                            title.setText("ImageView From URL Java");
                            fragment = new Fragment_image_url_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("SharedPref")) {
                            title.setText("Shared Preferences Java");
                            fragment = new Fragment_sp_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("sql")) {
                            title.setText("SQLite Database Java");
                            fragment = new Fragment_sql_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("services")) {
                            title.setText("Background Services Java");
                            fragment = new Fragment_Backgroundservices_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }


                        //+++++++++++++++++++++++++++++++++++Library+++++++++++++++++++++++++++++++++++++++++


                        if (position.equals("Volley")) {
                            title.setText("Volley Java");
                            fragment = new Fragment_json_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("OKHTTP")) {
                            title.setText("OKHTTP Java");
                            fragment = new Fragment_okhttp_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("sendImageToServer")) {
                            title.setText("sendImageToServer Java");
                            fragment = new Fragment_image_server_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("ex_recycler")) {
                            title.setText("Expandable RecyclerView Java");
                            fragment = new Fragment_expandable_re_view_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("encrypt")) {
                            title.setText("Encrypt and Decrypt Java");
                            fragment = new Fragment_encryptanddecrypt_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("patternlockview")) {
                            title.setText("Pattern Lockview Java");
                            fragment = new Fragment_patternlockview_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("advancedwebview")) {
                            title.setText("Advanced Webview Java");
                            fragment = new Fragment_AdvancedWebView_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Qrcode")) {
                            title.setText("Qr Code Scanner Java");
                            fragment = new Fragment_qrscanner_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("pdf")) {
                            title.setText("Pdf Creator Java");
                            fragment = new Fragment_pdfcreator_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("floatingmenu")) {
                            title.setText("Floating Menu Java");
                            fragment = new Fragment_floatingmenu_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("text_speech")) {
                            title.setText("Text To Speech Java");
                            fragment = new Fragment_text_speech_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("speech_text")) {
                            title.setText("Speech To Text Java");
                            fragment = new Fragment_speech_text_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Image_text")) {
                            title.setText("Image To Text Java");
                            fragment = new Fragment_Image_text_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("mapview")) {
                            title.setText("MapView with Current Location Java");
                            fragment = new Fragment_image_server_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("gifimage")) {
                            title.setText("Gif ImageView  Java");
                            fragment = new Fragment_gifimageview_java();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                    }
                });

                //******************************b2****************************


                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        //+++++++++++++++++++++++++++++++++++Basic+++++++++++++++++++++++++++++++++++++++++


                        if (position.equals("textview")) {
                            title.setText("TextView Demo");
                            fragment = new Fragment_textview_demo();
                            bundle.putString("params", "textview");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("edittext")) {
                            title.setText("EditText Demo");
                            fragment = new Fragment_edittext_demo();
                            bundle.putString("params", "edittext");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("imageview")) {
                            title.setText("ImageView Demo");
                            fragment = new Fragment_ImageView_demo();
                            bundle.putString("params", "imageview");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("button")) {
                            title.setText("Button Demo");
                            fragment = new Fragment_button_demo();
                            bundle.putString("params", "button");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("AutoCompleteTextView")) {
                            title.setText("AutoCompleteTextView Demo");
                            fragment = new Fragment_AutoCompleteTextView_demo();
                            bundle.putString("params", "AutoCompleteTextView");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("MultiAutoCompleteTextView")) {
                            title.setText("MultiAutoCompleteTextView");
                            fragment = new Fragment_MultiAutoCompleteTextView_demo();
                            bundle.putString("params", "MultiAutoCompleteTextView");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Radiobutton_and_Radiogroup")) {
                            title.setText("RadioButton And RadioGroup Demo");
                            fragment = new Fragment_RadioGroup_demo();
                            bundle.putString("params", "Radiobutton_and_Radiogroup");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Checkbox")) {
                            title.setText("CheckBox Demo");
                            fragment = new Fragment_checkbox_demo();
                            bundle.putString("params", "Checkbox");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("toogle")) {
                            title.setText("Toogle Demo");
                            fragment = new Fragment_toggle_demo();
                            bundle.putString("params", "toogle");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("progressbar")) {
                            title.setText("ProgressBar Demo");
                            fragment = new Fragment_ProgrssBar_demo();
                            bundle.putString("params", "progressbar");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("clock")) {
                            title.setText("Clock Demo");
                            fragment = new Fragment_clock_demo();
                            bundle.putString("params", "clock");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("datepicker")) {
                            title.setText("DatePicker Demo");
                            fragment = new Fragment_datepicker_demo();
                            bundle.putString("params", "datepicker");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("simpleandcustomtoast")) {
                            title.setText("Simple And Custom Toast");
                            fragment = new Fragment_simple_and_custom_toast_demo();
                            bundle.putString("params", "simpleandcustomtoast");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Alertdialog")) {
                            title.setText("Alert Dialog Demo");
                            fragment = new Fragment_alert_dialog_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("customalertdialog")) {
                            title.setText("customalertdialog Demo");
                            fragment = new Fragment_custom_alertdialog_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("simpleintent")) {
                            Intent intent = new Intent(BaseScreen.this, SimpleIntent_demo.class);
                            startActivity(intent);
                        }
                        if (position.equals("bundlepassing")) {
                            Intent intent = new Intent(BaseScreen.this, Bundle_passing_demo.class);
                            startActivity(intent);
                        }
                        if (position.equals("fragment")) {
                            Intent intent = new Intent(BaseScreen.this, Fragment_demo.class);
                            startActivity(intent);
                        }
                        if (position.equals("spinner")) {
                            title.setText("Spinner Demo");
                            fragment = new Fragment_spinner_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("swipeRefreshLayout")) {
                            title.setText("swipeRefreshLayout Demo");
                            fragment = new Fragment_swipe_refresh_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("implicitintent")) {
                            Intent intent = new Intent(BaseScreen.this, Dialer_demo.class);
                            startActivity(intent);
                        }
                        if (position.equals("scrollview")) {
                            title.setText("scrollview Demo");
                            fragment = new Fragment_scrollview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("curveedge")) {
                            title.setText("Curve Edge Buttons Demo");
                            fragment = new Fragment_curve_edge_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }


                        //+++++++++++++++++++++++++++++++++++Advance+++++++++++++++++++++++++++++++++++++++++

                        if (position.equals("imageandtextswitcher")) {
                            title.setText("Image And TextSwitcher Demo");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("viewflipper")) {
                            title.setText("ViewFlipper Demo");
                            fragment = new Fragment_viewflipper_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Animation")) {
                            title.setText("Animation Demo");
                            fragment = new Fragment_animation_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("listview")) {
                            title.setText("ListView Demo");
                            fragment = new Fragment_list_view_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Customlistview")) {
                            title.setText("CustomListView Demo");
                            fragment = new Fragment_custom_listview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("expandablelistview")) {
                            title.setText("ExpandableListView Demo");
                            fragment = new Fragment_Expandable_Listview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("gridview")) {
                            title.setText("GridView Demo");
                            fragment = new Fragment_gridview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("webview")) {
                            title.setText("WebView Demo");
                            fragment = new Fragment_webview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("searchview")) {
                            Intent intent = new Intent(BaseScreen.this, SearchView_demo.class);
                            startActivity(intent);
                        }

                        if (position.equals("tablayout")) {
                            Intent intent = new Intent(BaseScreen.this, TabbedActivity.class);
                            startActivity(intent);
                        }

                        if (position.equals("viewpager")) {
                            title.setText("ViewPager Demo");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("BottomNavigation")) {
                            Intent intent = new Intent(BaseScreen.this, BottomNavigation.class);
                            startActivity(intent);
                        }

                        if (position.equals("NavigationDrawer")) {
                            Intent intent = new Intent(BaseScreen.this, NavigationDrawer.class);
                            startActivity(intent);
                        }

                        if (position.equals("Recyclerandcardview")) {
                            title.setText("RecyclerView and CardView Demo");
                            fragment = new Fragment_Recyclerview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Notification")) {
                            title.setText("Notification Demo");
                            fragment = new Fragment_notifications_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Recyclerviewinsiderecyclerview")) {
                            title.setText("RecyclerView Inside RecyclerView Demo");
                            fragment = new Fragment_Recyclerview_inside_recyclerview();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Arraylistinsidearraylist")) {
                            title.setText("ArrayList Inside ArrayList Demo");
                            fragment = new Fragment_curve_edge_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("fingerprintrecognization")) {
                            title.setText("Fingerprint Recognization Demo");
                            fragment = new Fragment_fingerprint_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("Imageviewfromurl")) {
                            title.setText("ImageView From URL Demo");
                            fragment = new Fragment_Image_url_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("SharedPref")) {
                            title.setText("Shared Preferences Demo");
                            fragment = new Fragment_sp_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("sql")) {
                            title.setText("SQLite Database Demo");
                            fragment = new Fragment_sql_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                        if (position.equals("services")) {
                            title.setText("Background Services Demo");
                            fragment = new Fragment_Background_services_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }


                        //+++++++++++++++++++++++++++++++++++Library+++++++++++++++++++++++++++++++++++++++++


                        if (position.equals("Volley")) {
                            title.setText("Volley Demo");
                            fragment = new Fragment_json_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("OKHTTP")) {
                            title.setText("OKHTTP Demo");
                            fragment = new Fragment_okhttp_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("sendImageToServer")) {
                            title.setText("Image To SErver Demo");
                            fragment = new Fragment_image_server_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("spinner")) {
                            title.setText("Spinner Demo");
                            fragment = new Fragment_spinner_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("customalertdialog")) {
                            title.setText("Custom ALertDIalog Demo");
                            fragment = new Fragment_custom_alertdialog_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("swipeRefreshLayout")) {
                            title.setText("SwipeRefreshLayout Demo");
                            fragment = new Fragment_swipe_refresh_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("scrollview")) {
                            title.setText("ScrollView Demo");
                            fragment = new Fragment_scrollview_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("ex_recycler")) {
                            Intent intent = new Intent(BaseScreen.this, ExpandableRecyclerView.class);
                            startActivity(intent);
                        }
                        if (position.equals("encrypt")) {
                            title.setText("Encrypt and Decrypt Demo");
                            fragment = new Fragment_encryptanddecrypt_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("patternlockview")) {
                            title.setText("Pattern Lockview Demo");
                            fragment = new Fragment_patternLockView_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("advancedwebview")) {
                            title.setText("Advanced Webview Demo");
                            fragment = new Fragment_AdvancedWebView_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Qrcode")) {
                            title.setText("Qr Code Scanner Demo");
                            fragment = new Fragment_qrscanner_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("pdf")) {
                            title.setText("Pdf Creator Demo");
                            fragment = new Fragment_pdfcreator_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("floatingmenu")) {
                            title.setText("Floating Menu Demo");
                            fragment = new Fragment_floatingmenu_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("text_speech")) {
                            title.setText("Text To Speech Demo");
                            fragment = new Fragment_text_speech_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("speech_text")) {
                            title.setText("Speech To Text Demo");
                            fragment = new Fragment_speech_text_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("Image_text")) {
                            Intent intent = new Intent(BaseScreen.this, Image_text_demo.class);
                            startActivity(intent);
                        }
                        if (position.equals("mapview")) {
                            title.setText("MapView with Current Location Demo");
                            fragment = new Fragment_image_server_ref();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }
                        if (position.equals("gifimage")) {
                            title.setText("Gif ImageView  Demo");
                            fragment = new Fragment_gifImageView_demo();
                            bundle.putString("params", "Alertdialog");
                            fragment.setArguments(bundle);
                            loadFragment(fragment);
                        }

                    }
                });


            }

            private void loadFragment(Fragment fragment) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment, fragment);
                transaction.commit();
            }
        }
