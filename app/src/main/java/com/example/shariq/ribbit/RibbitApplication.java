package com.example.shariq.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Shariq on 10/6/2014.
 */
public class RibbitApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "T3Sn2FtOGs1Uru5ru4jOiJINQXOTlovWJQ0LvxKI", "dDWZNUErjwGsVhD5RR46dNxpuhiu8Uvii94JdELF");

    }
}
