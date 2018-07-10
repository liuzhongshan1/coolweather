package com.example.coolwheather.gson;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

/**
 * Created by 刘中山 on 2018-07-07.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public  class Temperature{
        public String max;
        public String min;

    }

    public class More{
        @SerializedName("txt_d")
        public String info;

    }






}
