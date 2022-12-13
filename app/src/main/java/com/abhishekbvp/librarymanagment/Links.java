package com.abhishekbvp.librarymanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Links extends AppCompatActivity {
    private AdView mAdView;

    TextView linkOne, linkTwo, linkThree, linkFour, linkFive, linkSix, linkSeven, linkEight, linkNine, linkTen, linkEleven, linkTwelve,
            linkThirteen, linkFourteen, linkFifteen, linkSixteen, linkSeventeen, linkEighteen, linkNineteen, linkTwenty, linkTwentyOne,
            linkTwentyTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
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


        linkOne = findViewById(R.id.link_one);
        linkTwo = findViewById(R.id.link_two);
        linkThree = findViewById(R.id.link_three);
        linkFour = findViewById(R.id.link_four);
        linkFive = findViewById(R.id.link_five);
        linkSix = findViewById(R.id.link_six);
        linkSeven = findViewById(R.id.link_seven);
        linkEight = findViewById(R.id.link_eight);
        linkNine = findViewById(R.id.link_nine);
        linkTen = findViewById(R.id.link_ten);
        linkEleven = findViewById(R.id.link_eleven);
        linkTwelve = findViewById(R.id.link_twelve);
        linkThirteen = findViewById(R.id.link_thirteen);
        linkFourteen = findViewById(R.id.link_fourteen);
        linkFifteen = findViewById(R.id.link_fifteen);
        linkSixteen = findViewById(R.id.link_sixteen);
        linkSeventeen = findViewById(R.id.link_seventeen);
        linkEighteen = findViewById(R.id.link_eighteen);
        linkNineteen = findViewById(R.id.link_nineteen);
        linkTwenty = findViewById(R.id.link_twenty);
        linkTwentyOne = findViewById(R.id.link_tewntyone);
        linkTwentyTwo = findViewById(R.id.link_tewntytwo);


        linkOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://164.100.247.26/");
            }
        });

        linkTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://elibrary.in/pearson.com/login");
            }
        });

        linkThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://onlinenewspapers.com/india.shtml");
            }
        });

        linkFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Bulletin_of_Materials_Science/");
            }
        });

        linkFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Journal_of_Astrophysics_and_Astronomy/");
            }
        });

        linkSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Journal_of_Chemical_Sciences/");
            }
        });

        linkSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Journal_of_Earth_System_Science/");
            }
        });

        linkEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Journal_of_Genetics/");
            }
        });

        linkNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Pramana_%E2%80%93_Journal_of_Physics/");
            }
        });

        linkTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Proceedings_%E2%80%93_Mathematical_Sciences/");
            }
        });

        linkEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Sadhana/");
            }
        });


        linkTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.ias.ac.in/Journals/Resonance_%E2%80%93_Journal_of_Science_Education/");
            }
        });

        linkThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://peerj.com/computer-science/");
            }
        });

        linkFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.mdpi.com/journal/information");
            }
        });

        linkFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://jair.org/index.php/jair/index");
            }
        });

        linkSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.jmlr.org/");
            }
        });

        linkSeventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://lmcs.episciences.org/");
            }
        });

        linkEighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.jucs.org/");
            }
        });

        linkNineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.jot.fm/");
            }
        });

        linkTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://journals.agh.edu.pl/csci");
            }
        });

        linkTwentyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://theoryofcomputing.org/index.html");
            }
        });

        linkTwentyTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.inderscience.com/index.php");
            }
        });

    }
        private void gotoUrl (String s){
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}