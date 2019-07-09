package com.example.week6day1hw.model.datasource.remote;

import com.example.week6day1hw.model.datasource.local.pojo.GithubUserResponse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class Retrofit {
    public static final String BASE_URL = "https://api.github.com/";


    public retrofit2.Retrofit getRetrofitInstance() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build();
        return new retrofit2.Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public GitApiService getService() {
        return getRetrofitInstance().create(GitApiService.class);
    }

    public interface GitApiService {
        @GET
        Call<GithubUserResponse> getGitResponse(@Url String myUrl);


    }
}
