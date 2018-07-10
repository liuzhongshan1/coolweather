package com.example.coolwheather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 刘中山 on 2018-07-07.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;

    }





}























































