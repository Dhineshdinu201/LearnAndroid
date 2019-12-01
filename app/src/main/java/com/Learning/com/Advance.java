package com.Learning.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Advance extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    int i=1;
    String[] items={"ViewFliper","Animations","ListView","Custom ListView","Expandable ListView","GridView","WebView","SearchView","TabLayout","Bottom Navigation","Navigation Drawer","RecyclerView and CardView","Notification","RecyclerView Inside Recycler View","FingerPrint Recognization","ImageVIew From URL","SharedPreference","SqliteDatabase","Services(BackGround Tasks)"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        MobileAds.initialize(this,"ca-app-pub-5555883160769534~2999857530");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5555883160769534/6116975464");



        listView=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
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
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "viewflipper");
                        startActivity(intent);
                        break;

                    } case 1: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "Animation");
                        startActivity(intent);
                        break;
                    } case 2: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "listview");
                        startActivity(intent);
                        break;
                    } case 3: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "Customlistview");
                        startActivity(intent);
                        break;
                    } case 4: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "expandablelistview");
                        startActivity(intent);
                        break;
                    } case 5: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "gridview");
                        startActivity(intent);
                        break;
                    } case 6: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "webview");
                        startActivity(intent);
                        break;
                    } case 7: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "searchview");
                        startActivity(intent);
                        break;
                    } case 8: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "tablayout");
                        startActivity(intent);
                        break;

                    } case 9: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "BottomNavigation");
                        startActivity(intent);
                        break;
                    } case 10: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "NavigationDrawer");
                        startActivity(intent);
                        break;
                    } case 11: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "Recyclerandcardview");
                        startActivity(intent);
                        break;
                    } case 12: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "Notification");
                        startActivity(intent);
                        break;
                    } case 13: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "Recyclerviewinsiderecyclerview");
                        startActivity(intent);
                        break;
                    } case 14: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "fingerprintrecognization");
                        startActivity(intent);
                        break;
                    } case 15: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "Imageviewfromurl");
                        startActivity(intent);
                        break;
                    } case 16: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "SharedPref");
                        startActivity(intent);
                        break;
                    } case 17: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "sql");
                        startActivity(intent);
                        break;
                    } case 18: {
                        Intent intent = new Intent(Advance.this, BaseScreen.class);
                        intent.putExtra("title", "services");
                        startActivity(intent);
                        break;
                    }
                }
            }
        });

    }
}