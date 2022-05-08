package com.example.nurfauzanhalim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.nurfauzanhalim.Adapter.WalkthroughAdapter;
import com.example.nurfauzanhalim.Model.WalkthroughModel;
import com.example.nurfauzanhalim.R;

import java.util.ArrayList;
import java.util.List;

/*
    Dikerjakan pada tanggal : 4 Mei 2022
    Dibuat oleh :
    NIM   : 10119226
    Nama  :Nur Fauzan Halim
    Kelas : IF-6
*/

public class WalkthroughActivity extends AppCompatActivity {

    private WalkthroughAdapter walkthroughAdapter;
    private LinearLayout linlayIndicatorWalkthrough;
    private Button btnActionWalkthrough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        linlayIndicatorWalkthrough = findViewById(R.id.linlay_indicatorwalkthrough);
        btnActionWalkthrough = findViewById(R.id.btn_actionwalkthrough);

        setupWalkthroughItems();

        final ViewPager2 viewpagerWalkthrough = findViewById(R.id.viewpager_walkthrough);
        viewpagerWalkthrough.setAdapter(walkthroughAdapter);

        setupIndicatorWalkthrough();
        setCurrentIndicatorWalkthrough(0);

        viewpagerWalkthrough.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentIndicatorWalkthrough(position);
            }
        });

        btnActionWalkthrough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewpagerWalkthrough.getCurrentItem() + 1 < walkthroughAdapter.getItemCount()) {
                    viewpagerWalkthrough.setCurrentItem(viewpagerWalkthrough.getCurrentItem() + 1);
                } else {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });
    }

    private void setupWalkthroughItems() {
        List<WalkthroughModel> walkthroughModels = new ArrayList<>();

        WalkthroughModel itemWalkthrough1 = new WalkthroughModel();
        itemWalkthrough1.setTitle("Hallo!");
        itemWalkthrough1.setSubtitle("Welcome to Nur Fauzan Halim apps");
        itemWalkthrough1.setImage(R.drawable.walkthrough1);

        WalkthroughModel itemWalkthrough2 = new WalkthroughModel();
        itemWalkthrough2.setTitle("My Profile, Daily Act, Gallery, Music & Video");
        itemWalkthrough2.setSubtitle("You can see my profile, daily activity, gallery, music & video in here");
        itemWalkthrough2.setImage(R.drawable.walkthrough2);

        WalkthroughModel itemWalkthrough3 = new WalkthroughModel();
        itemWalkthrough3.setTitle("Contact Me");
        itemWalkthrough3.setSubtitle("Also you can see and get my contact or social media in here");
        itemWalkthrough3.setImage(R.drawable.walkthrough3);

        walkthroughModels.add(itemWalkthrough1);
        walkthroughModels.add(itemWalkthrough2);
        walkthroughModels.add(itemWalkthrough3);

        walkthroughAdapter = new WalkthroughAdapter(walkthroughModels);
    }

    private void setupIndicatorWalkthrough() {
        ImageView[] indicator = new ImageView[walkthroughAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0, 8,0);
        for (int i = 0; i < indicator.length; i++) {
            indicator[i] = new ImageView(getApplicationContext());
            indicator[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.walkthrough_indicator_inactive
            ));
            indicator[i].setLayoutParams(layoutParams);
            linlayIndicatorWalkthrough.addView(indicator[i]);
        }
    }

    private void setCurrentIndicatorWalkthrough(int index) {
        int childCount = linlayIndicatorWalkthrough.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView)linlayIndicatorWalkthrough.getChildAt(i);
            if(i == index) {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.walkthrough_indicator_active)
                );
            }else{
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.walkthrough_indicator_inactive)
                );
            }
        }
        if (index == walkthroughAdapter.getItemCount() - 1) {
            btnActionWalkthrough.setText("Start");
        }else
            btnActionWalkthrough.setText("Next");
    }
}