package com.coolweather.android.gson;

import android.support.v4.view.ViewCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liangbing.yu on 9/5/2018.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
