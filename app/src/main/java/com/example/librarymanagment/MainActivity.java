package com.example.librarymanagment;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    Button opac;
    Button syllabus;
    Button pyq;
    Button ieee, explore, bvicam;
    TextView randomcontact;
    Button pdf_view1, pdf_view2, pdf_view3;
    TextView importantlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        importantlink = findViewById(R.id.important_links);
        importantlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Links.class);
                startActivity(intent);
            }
        });

        pdf_view1 = findViewById(R.id.pdf_view1);
        pdf_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1vAq_RDblWe078A04uUsoWpyq7RomQ9Yn/view?usp=share_link");
            }
        });

        pdf_view2 = findViewById(R.id.pdf_view2);
        pdf_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1Nrz76u6C0NpfSdro0ehDRtPQwhgJqFNy/view?usp=share_link");
            }
        });

        pdf_view3 = findViewById(R.id.pdf_view3);
        pdf_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1Q51y62v4Dd9jb5Nw7iQOSrup0_PKtFeh/view?usp=share_link");
            }
        });


        randomcontact = findViewById(R.id.randr_contactus);
        String text = "Rules and Regulation | Contact Us";
        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(MainActivity.this,rulesandregulation.class);
                startActivity(intent);
            }
        };

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(MainActivity.this,contactus.class);
                startActivity(intent);
            }
        };
        ss.setSpan(clickableSpan1,0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2,23,33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        randomcontact.setText(ss);
        randomcontact.setMovementMethod(LinkMovementMethod.getInstance());

        opac = findViewById(R.id.opac);
        syllabus = findViewById(R.id.syllabus);
        pyq = findViewById(R.id.pyq);
        ieee = findViewById(R.id.ieee);
        explore = findViewById(R.id.ieeeExplore);
        bvicam = findViewById(R.id.bvicam);

        opac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://115.111.246.28:8380/opac/");
            }
        });

        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/105tHDIXb15eWPaC7_Jz5R9BUNGFzt38j/view?usp=share_link");
            }
        });

        pyq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1LtgshQzGU0YTv8WhqX-lTVIbQBgMHMzH");
            }
        });

        ieee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ieee.org/about/index.html");
            }
        });

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://ieeexplore.ieee.org/xpl/conhome/1803740/all-proceedings");
            }
        });

        bvicam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/channel/UCuOPY-98JUY9T2igRpj8tIQ/videos");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}