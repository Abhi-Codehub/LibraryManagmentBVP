package com.abhishekbvp.librarymanagment;
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
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

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

        mAdView = findViewById(R.id.adViewmain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();

            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
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
                gotoUrl("https://drive.google.com/file/d/11YkyjdvS6SuD10_T7l21dgRqXhRGVRC1/view?usp=drive_link");
            }
        });

        pdf_view2 = findViewById(R.id.pdf_view2);
        pdf_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1DtMTGxFeDTDyEvWi-vN-ubUUze751RFA/view?usp=drive_link");
            }
        });

        pdf_view3 = findViewById(R.id.pdf_view3);
        pdf_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1gjvAkuYNjfA7hcWSfDo-_ZYIGkmGejvS/view?usp=drive_link");
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
                gotoUrl("http://115.111.246.28/");
            }
        });

        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/file/d/1Rco5zLvInGr3OnK3WCZwGqqcJvDCaA9A/view?usp=drive_link");
            }
        });

        pyq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/drive/folders/1WG9gm_lh7QQi5RKm-LHRSgHqYUmNZ6sI?usp=drive_link");
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