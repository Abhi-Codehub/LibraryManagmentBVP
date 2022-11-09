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
import android.widget.ImageView;
import android.widget.TextView;

public class contactus extends AppCompatActivity {

    TextView  website;
    ImageView map_image;
    TextView  LinkedIn;
    ImageView twitter;
    ImageView instagram;
    ImageView linkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        map_image = findViewById(R.id.map_image);
        twitter = findViewById(R.id.twitter_logo);
        instagram = findViewById(R.id.insta_logo);
        linkedin = findViewById(R.id.linkedin_logo);
        LinkedIn = findViewById(R.id.linkedIn);

        map_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Bharati+Vidyapeeth's+College+of+Engineering/@28.6758703,77.1110182,17z/data=!3m1!4b1!4m5!3m4!1s0x390d038e0dee2897:0x84bb3fed8b1c51f9!8m2!3d28.6758656!4d77.1132069");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/bharati_vp");
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://instagram.com/bharati.vidyapeeth_official?igshid=YmMyMTA2M2Y=");
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/school/bvpcoe/");
            }
        });

        LinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/in/abhishek-aggarwal-1a7094210/");
            }
        });

        website = findViewById(R.id.website);
        String text = "https://bvcoend.ac.in/";

        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                gotoUrl("https://bvcoend.ac.in/");
            }
        };
        ss.setSpan(clickableSpan1,0,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        website.setText(ss);
        website.setMovementMethod(LinkMovementMethod.getInstance());


    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}