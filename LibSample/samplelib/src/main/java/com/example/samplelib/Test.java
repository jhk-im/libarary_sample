package com.example.samplelib;

import android.content.Context;
import android.widget.Toast;

public class Test {

    public void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
