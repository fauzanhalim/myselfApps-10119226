package com.example.nurfauzanhalim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.nurfauzanhalim.R;

/*
    Dikerjakan pada tanggal : 4 Mei 2022
    Dibuat oleh :
    NIM   : 10119226
    Nama  : Nur Fauzan Halim
    Kelas : IF-6
*/

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), WalkthroughActivity.class));
                finish();
            }
        }, 3000L); // 3 detik
    }
}