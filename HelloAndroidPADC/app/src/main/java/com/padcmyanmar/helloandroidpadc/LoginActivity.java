package com.padcmyanmar.helloandroidpadc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ICE on 12-11-2017.
 */

public class LoginActivity extends AppCompatActivity {

    public static Intent newIntent(Context context)//app mhar shi tae component ko hlan you lo ya
    {

        Intent intent= new Intent(context,LoginActivity.class);//(start pararmeter, passing activity type)
        return intent;
    }



}
