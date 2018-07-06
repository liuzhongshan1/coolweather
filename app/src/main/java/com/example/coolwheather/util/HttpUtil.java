package com.example.coolwheather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 刘中山 on 2018-07-06.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }


}
