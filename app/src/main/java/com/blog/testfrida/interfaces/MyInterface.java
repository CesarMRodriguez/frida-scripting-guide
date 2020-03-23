package com.blog.testfrida.interfaces;

import android.os.Build;

import androidx.annotation.RequiresApi;

public interface MyInterface {

    int attribute = 0;
    String getMessage();

    @RequiresApi(api = Build.VERSION_CODES.N)
    default int getInt() {
        return 1;
    }

    public static char getChar() {
        return 'c';
    }
}
