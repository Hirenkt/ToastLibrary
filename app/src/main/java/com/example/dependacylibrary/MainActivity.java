package com.example.dependacylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toastlibrary.HirenToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HirenToast.showToast(this,"Testing....");
    }
}