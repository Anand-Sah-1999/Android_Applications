package com.example.covid_19tracker;

import android.content.pm.LauncherApps;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Retrofit_Interface {

    @GET("countries")
    Call<List<GetCountryData>> getData();
}
