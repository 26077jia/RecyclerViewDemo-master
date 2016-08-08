package com.example.zcp.recyclerviewdemo;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by jiajia on 2016/8/4.
 */
public class OkHttp {
    public static OkHttpClient mOkHttpClient;
    public static String getData(String url){
         String str = "";
        try{
            mOkHttpClient = new OkHttpClient();//创建okHttpClient对象
            final Request request = new Request.Builder() //创建一个call
                    .url(url)
                    .build();
            Call mycall = mOkHttpClient.newCall(request); // new call
            mycall.enqueue(new Callback() { //请求加入调度
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void  onResponse(Call call, Response response) throws IOException {
                    String stre = response.body().toString();
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
        return  str;

    }



}
