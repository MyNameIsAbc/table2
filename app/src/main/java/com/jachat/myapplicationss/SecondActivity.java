package com.jachat.myapplicationss;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.anna.mylibraryss.APP;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        APP.print();
    }
}
