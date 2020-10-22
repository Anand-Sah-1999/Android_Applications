package com.example.covid_19tracker;

import com.google.gson.annotations.SerializedName;

public class GetCountryData {

    @SerializedName("country")
    String country_name;
    @SerializedName("cases")
    int confirmedCases;
    @SerializedName("todayCases")
    int newCases;
    @SerializedName("deaths")
    int deceased;
    @SerializedName("todayDeaths")
    int todayDeceased;
    @SerializedName("recovered")
    int totalRecovery;
    @SerializedName("active")
    int totalActive;

    public String getCountry_name() {
        return country_name;
    }

    public int getConfirmedCases() {
        return confirmedCases;
    }

    public int getNewCases() {
        return newCases;
    }

    public int getDeceased() {
        return deceased;
    }

    public int getTodayDeceased() {
        return todayDeceased;
    }

    public int getTotalRecovery() {
        return totalRecovery;
    }

    public int getTotalActive() {
        return totalActive;
    }
}
