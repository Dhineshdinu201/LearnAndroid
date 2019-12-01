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

public class Fragment_animation_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    String Code="import android.app.Activity;\n" +
            "import android.content.Intent;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.view.animation.Animation;\n" +
            "import android.view.animation.AnimationUtils;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends Activity {\n" +
            "\n" +
            "    Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,\n" +
            "            btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,\n" +
            "            btnBounce, btnSequential, btnTogether;\n" +
            "    Animation animFadeIn,animFadeOut,animBlink,animZoomIn,animZoomOut,animRotate\n" +
            "            ,animMove,animSlideUp,animSlideDown,animBounce,animSequential,animTogether,animCrossFadeIn,animCrossFadeOut;\n" +
            "    TextView txtFadeIn,txtFadeOut,txtBlink,txtZoomIn,txtZoomOut,txtRotate,txtMove,txtSlideUp,\n" +
            "            txtSlideDown,txtBounce,txtSeq,txtTog,txtIn,txtOut;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);\n" +
            "        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);\n" +
            "        btnCrossFade = (Button) findViewById(R.id.btnCrossFade);\n" +
            "        btnBlink = (Button) findViewById(R.id.btnBlink);\n" +
            "        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);\n" +
            "        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);\n" +
            "        btnRotate = (Button) findViewById(R.id.btnRotate);\n" +
            "        btnMove = (Button) findViewById(R.id.btnMove);\n" +
            "        btnSlideUp = (Button) findViewById(R.id.btnSlideUp);\n" +
            "        btnSlideDown = (Button) findViewById(R.id.btnSlideDown);\n" +
            "        btnBounce = (Button) findViewById(R.id.btnBounce);\n" +
            "        btnSequential = (Button) findViewById(R.id.btnSequential);\n" +
            "        btnTogether = (Button) findViewById(R.id.btnTogether);\n" +
            "        txtFadeIn=(TextView)findViewById(R.id.txt_fade_in);\n" +
            "        txtFadeOut=(TextView)findViewById(R.id.txt_fade_out);\n" +
            "        txtBlink=(TextView)findViewById(R.id.txt_blink);\n" +
            "        txtZoomIn=(TextView)findViewById(R.id.txt_zoom_in);\n" +
            "        txtZoomOut=(TextView)findViewById(R.id.txt_zoom_out);\n" +
            "        txtRotate=(TextView)findViewById(R.id.txt_rotate);\n" +
            "        txtMove=(TextView)findViewById(R.id.txt_move);\n" +
            "        txtSlideUp=(TextView)findViewById(R.id.txt_slide_up);\n" +
            "        txtSlideDown=(TextView)findViewById(R.id.txt_slide_down);\n" +
            "        txtBounce=(TextView)findViewById(R.id.txt_bounce);\n" +
            "        txtSeq=(TextView)findViewById(R.id.txt_seq);\n" +
            "        txtTog=(TextView)findViewById(R.id.txt_tog);\n" +
            "        txtIn=(TextView)findViewById(R.id.txt_in);\n" +
            "        txtOut=(TextView)findViewById(R.id.txt_out);\n" +
            "        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_fade_in);\n" +
            "\n" +
            "        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_fade_in);\n" +
            "        // fade in\n" +
            "        btnFadeIn.setOnClickListener(new View.OnClickListener() {\n" +
            "\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtFadeIn.setVisibility(View.VISIBLE);\n" +
            "                txtFadeIn.startAnimation(animFadeIn);\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_fade_out);\n" +
            "\n" +
            "        // fade out\n" +
            "        btnFadeOut.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtFadeOut.setVisibility(View.VISIBLE);\n" +
            "                txtFadeOut.startAnimation(animFadeOut);\n" +
            "            }\n" +
            "        });\n" +
            "        animCrossFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_fade_in);\n" +
            "        animCrossFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_fade_out);\n" +
            "        // cross fade\n" +
            "        btnCrossFade.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtOut.setVisibility(View.VISIBLE);\n" +
            "                // start fade in animation\n" +
            "                txtOut.startAnimation(animCrossFadeIn);\n" +
            "\n" +
            "                // start fade out animation\n" +
            "                txtIn.startAnimation(animCrossFadeOut);\n" +
            "            }\n" +
            "        });\n" +
            "        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_blink);\n" +
            "        // blink\n" +
            "        btnBlink.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtBlink.setVisibility(View.VISIBLE);\n" +
            "                txtBlink.startAnimation(animBlink);\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.zoom_in);\n" +
            "        // Zoom In\n" +
            "        btnZoomIn.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtZoomIn.setVisibility(View.VISIBLE);\n" +
            "                txtZoomIn.startAnimation(animZoomIn);\n" +
            "            }\n" +
            "        });\n" +
            "        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.zoom_out);\n" +
            "        // Zoom Out\n" +
            "        btnZoomOut.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtZoomOut.setVisibility(View.VISIBLE);\n" +
            "                txtZoomOut.startAnimation(animZoomOut);\n" +
            "            }\n" +
            "        });\n" +
            "        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_rotate);\n" +
            "\n" +
            "        // Rotate\n" +
            "        btnRotate.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtRotate.startAnimation(animRotate);\n" +
            "            }\n" +
            "        });\n" +
            "        animMove = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_move);\n" +
            "        // Move\n" +
            "        btnMove.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtMove.startAnimation(animMove);\n" +
            "            }\n" +
            "        });\n" +
            "        animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_slide_up);\n" +
            "        // Slide Up\n" +
            "        btnSlideUp.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtSlideUp.startAnimation(animSlideUp);\n" +
            "            }\n" +
            "        });\n" +
            "        animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_slide_down);\n" +
            "        // Slide Down\n" +
            "        btnSlideDown.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtSlideDown.startAnimation(animSlideDown);\n" +
            "            }\n" +
            "        });\n" +
            "        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_bounce);\n" +
            "        // Slide Down\n" +
            "        btnBounce.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtBounce.startAnimation(animBounce);\n" +
            "            }\n" +
            "        });\n" +
            "        animSequential = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_sequential);\n" +
            "        // Sequential\n" +
            "        btnSequential.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                txtSeq.startAnimation(animSequential);\n" +
            "            }\n" +
            "        });\n" +
            "        animTogether = AnimationUtils.loadAnimation(getApplicationContext(),\n" +
            "                R.anim.anim_together);\n" +
            "\n" +
            "        // Together\n" +
            "        btnTogether.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                txtTog.startAnimation(animTogether);\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "}"
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

