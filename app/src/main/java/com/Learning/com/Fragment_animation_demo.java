package com.Learning.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Fragment_animation_demo  extends Fragment {
    Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,
            btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,
            btnBounce, btnSequential, btnTogether;
    Animation animFadeIn,animFadeOut,animBlink,animZoomIn,animZoomOut,animRotate
            ,animMove,animSlideUp,animSlideDown,animBounce,animSequential,animTogether,animCrossFadeIn,animCrossFadeOut;
    TextView txtFadeIn,txtFadeOut,txtBlink,txtZoomIn,txtZoomOut,txtRotate,txtMove,txtSlideUp,
            txtSlideDown,txtBounce,txtSeq,txtTog,txtIn,txtOut;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_anination_demo, container, false);
        btnFadeIn = (Button) view.findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) view.findViewById(R.id.btnFadeOut);
        btnCrossFade = (Button) view.findViewById(R.id.btnCrossFade);
        btnBlink = (Button) view.findViewById(R.id.btnBlink);
        btnZoomIn = (Button) view.findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button) view.findViewById(R.id.btnZoomOut);
        btnRotate = (Button) view.findViewById(R.id.btnRotate);
        btnMove = (Button) view.findViewById(R.id.btnMove);
        btnSlideUp = (Button) view.findViewById(R.id.btnSlideUp);
        btnSlideDown = (Button) view.findViewById(R.id.btnSlideDown);
        btnBounce = (Button) view.findViewById(R.id.btnBounce);
        btnSequential = (Button) view.findViewById(R.id.btnSequential);
        btnTogether = (Button) view.findViewById(R.id.btnTogether);
        txtFadeIn=(TextView)view.findViewById(R.id.txt_fade_in);
        txtFadeOut=(TextView)view.findViewById(R.id.txt_fade_out);
        txtBlink=(TextView)view.findViewById(R.id.txt_blink);
        txtZoomIn=(TextView)view.findViewById(R.id.txt_zoom_in);
        txtZoomOut=(TextView)view.findViewById(R.id.txt_zoom_out);
        txtRotate=(TextView)view.findViewById(R.id.txt_rotate);
        txtMove=(TextView)view.findViewById(R.id.txt_move);
        txtSlideUp=(TextView)view.findViewById(R.id.txt_slide_up);
        txtSlideDown=(TextView)view.findViewById(R.id.txt_slide_down);
        txtBounce=(TextView)view.findViewById(R.id.txt_bounce);
        txtSeq=(TextView)view.findViewById(R.id.txt_seq);
        txtTog=(TextView)view.findViewById(R.id.txt_tog);
        txtIn=(TextView)view.findViewById(R.id.txt_in);
        txtOut=(TextView)view.findViewById(R.id.txt_out);
        animFadeIn = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_fade_in);

        animFadeIn = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_fade_in);
        // fade in
        btnFadeIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtFadeIn.setVisibility(View.VISIBLE);
                txtFadeIn.startAnimation(animFadeIn);
            }
        });

        animFadeOut = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_fade_out);

        // fade out
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFadeOut.setVisibility(View.VISIBLE);
                txtFadeOut.startAnimation(animFadeOut);
            }
        });
        animCrossFadeIn = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_fade_in);
        animCrossFadeOut = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_fade_out);
        // cross fade
        btnCrossFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOut.setVisibility(View.VISIBLE);
                // start fade in animation
                txtOut.startAnimation(animCrossFadeIn);

                // start fade out animation
                txtIn.startAnimation(animCrossFadeOut);
            }
        });
        animBlink = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_blink);
        // blink
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBlink.setVisibility(View.VISIBLE);
                txtBlink.startAnimation(animBlink);
            }
        });

        animZoomIn = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.zoom_in);
        // Zoom In
        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomIn.setVisibility(View.VISIBLE);
                txtZoomIn.startAnimation(animZoomIn);
            }
        });
        animZoomOut = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.zoom_out);
        // Zoom Out
        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomOut.setVisibility(View.VISIBLE);
                txtZoomOut.startAnimation(animZoomOut);
            }
        });
        animRotate = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_rotate);

        // Rotate
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtRotate.startAnimation(animRotate);
            }
        });
        animMove = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_move);
        // Move
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMove.startAnimation(animMove);
            }
        });
        animSlideUp = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_slide_up);
        // Slide Up
        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSlideUp.startAnimation(animSlideUp);
            }
        });
        animSlideDown = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_slide_down);
        // Slide Down
        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSlideDown.startAnimation(animSlideDown);
            }
        });
        animBounce = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_bounce);
        // Slide Down
        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBounce.startAnimation(animBounce);
            }
        });
        animSequential = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_sequential);
        // Sequential
        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtSeq.startAnimation(animSequential);
            }
        });
        animTogether = AnimationUtils.loadAnimation(getActivity().getApplicationContext(),
                R.anim.anim_together);

        // Together
        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTog.startAnimation(animTogether);
            }
        });

        return view;
    }
}
