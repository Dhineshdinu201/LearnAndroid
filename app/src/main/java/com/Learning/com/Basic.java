package com.Learning.com;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Basic extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    int i=0;
    String[] items={"Textview","EditText","ImageView","Button","AutoCompleteTextView","MultiAutoCompleteTextView","RadioButton & Radio Group","Check Box","Toogle Button","Progress Bar","Clock","Date Picker","Simple and custom Toast","Alert Dialog","Custom Alert Dialog","Simple Intent","Bundle Passing","Implementation and change Fragment","Spinner","Swipe refresh layout","Dialer Intent","Scroll View","Curve Edge Buttons"};
    ListView listView;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        MobileAds.initialize(this,"ca-app-pub-5555883160769534~8402070138");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5555883160769534");






        listView=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
                i=i+1;
                Log.i("num of clicks",""+i);
                if(i>1) {
                    if (i % 2 == 0) {

                        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                        }

                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");

                        }

                        mInterstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdLoaded() {
                                // Code to be executed when an ad finishes loading.
                            }

                            @Override
                            public void onAdFailedToLoad(int errorCode) {
                                // Code to be executed when an ad request fails.
                            }

                            @Override
                            public void onAdOpened() {
                                // Code to be executed when the ad is displayed.
                            }

                            @Override
                            public void onAdClicked() {
                                // Code to be executed when the user clicks on an ad.
                            }

                            @Override
                            public void onAdLeftApplication() {
                                // Code to be executed when the user has left the app.
                            }

                            @Override
                            public void onAdClosed() {
                                // Code to be executed when the interstitial ad is closed.
                            }
                        });
                    }
                }
                switch (position){
                    case 0: {

                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "textview");
                        startActivity(intent);
                        break;
                    }
                    case 1: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "edittext");
                        startActivity(intent);
                        break;

                    } case 2: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "imageview");
                        startActivity(intent);
                        break;
                    } case 3: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "button");
                        startActivity(intent);
                        break;
                    } case 4: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "AutoCompleteTextView");
                        startActivity(intent);
                        break;
                    } case 5: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "MultiAutoCompleteTextView");
                        startActivity(intent);
                        break;
                    } case 6: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "Radiobutton_and_Radiogroup");
                        startActivity(intent);
                        break;
                    } case 7: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "Checkbox");
                        startActivity(intent);
                        break;
                    } case 8: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "toogle");
                        startActivity(intent);
                        break;
                    } case 9: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "progressbar");
                        startActivity(intent);
                        break;
                    } case 10: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "clock");
                        startActivity(intent);
                        break;
                    } case 11: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "datepicker");
                        startActivity(intent);
                        break;
                    } case 12: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "simpleandcustomtoast");
                        startActivity(intent);
                        break;
                    } case 13: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "Alertdialog");
                        startActivity(intent);
                        break;
                    } case 14: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "customalertdialog");
                        startActivity(intent);
                        break;
                    } case 15: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "simpleintent");
                        startActivity(intent);
                        break;
                    } case 16: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "bundlepassing");
                        startActivity(intent);
                        break;
                    } case 17: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "fragment");
                        startActivity(intent);
                        break;
                    } case 18: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "spinner");
                        startActivity(intent);
                        break;
                    } case 19: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "swipeRefreshLayout");
                        startActivity(intent);
                        break;
                    } case 20: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "implicitintent");
                        startActivity(intent);
                        break;
                    } case 21: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "scrollview");
                        startActivity(intent);
                        break;
                    }case 22: {
                        Intent intent = new Intent(Basic.this, BaseScreen.class);
                        intent.putExtra("title", "curveedge");
                        startActivity(intent);
                        break;
                    }
                }
            }
        });

    }
}
