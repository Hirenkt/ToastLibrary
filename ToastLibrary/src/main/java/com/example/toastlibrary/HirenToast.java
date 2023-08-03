package com.example.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class HirenToast {
    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
