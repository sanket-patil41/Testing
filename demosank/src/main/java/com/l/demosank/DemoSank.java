package com.l.demosank;

import android.content.Context;
import android.widget.Toast;

public class DemoSank {

    public static void message(Context context, String name) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
    }
}
