package com.example.wordcounter2lab.Util;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void showToast(Context context,String msg) {
        Toast toast = Toast.makeText(context , msg, Toast.LENGTH_LONG);
        toast.show();
    }
}