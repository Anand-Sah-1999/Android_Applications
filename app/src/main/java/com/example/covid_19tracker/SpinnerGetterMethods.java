package com.example.covid_19tracker;

public class SpinnerGetterMethods {

    public int flagImage;
    public String countryName;

    public SpinnerGetterMethods(int flagImage, String countryName) {
        this.flagImage = flagImage;
        this.countryName = countryName;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public String getCountryName() {
        return countryName;
    }
}
