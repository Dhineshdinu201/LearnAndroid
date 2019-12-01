package com.Learning.com;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Fragment_viewflipper_demo extends Fragment {
    AdapterViewFlipper adapterViewFlipper;
    int[] images = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img1,

    };
    String[] text = {
            "ATOMIC ABSROPTION SPECTROSCOPY",
            "FT-IR SPECTROSCOPY",
            "GASS CHROMATOGRAPHY",
            "HIGH PERFORMANCE LIQUID CHROMATOGRAPHY-MASS SPECTROSCOPY",
            "UV-VIS SPECTROSCOPY",
    };
    ToggleButton toggleButton;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_viewflipper_demo, container, false);

        adapterViewFlipper = (AdapterViewFlipper) view.findViewById(R.id.adapterViewFlipper_phy);
        CusAdap cusAdap = new CusAdap(getActivity(), images, text);
        adapterViewFlipper.setAdapter(cusAdap);
        adapterViewFlipper.setFlipInterval(3000);
        adapterViewFlipper.setAutoStart(true);

        return view;
    }

    class CusAdap extends BaseAdapter {
        Context context;
        int[] images;
        String[] s_text;
        String[] s_head;
        LayoutInflater inflater;

        public CusAdap(Context applicationContext, int[] images, String[] s_text) {
            this.context = applicationContext;
            this.images = images;
            this.s_text = s_text;
            this.s_head = s_head;
            inflater = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = inflater.inflate(R.layout.adapter_list_item, null);
            ImageView image = (ImageView) view.findViewById(R.id.image);
            TextView text = (TextView) view.findViewById(R.id.text_slider);

            text.setText(s_text[position]);
            image.setImageResource(images[position]);

            return view;
        }


    }
}

