package com.example.covid_19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SpinnerAdapterClass extends ArrayAdapter<SpinnerGetterMethods> {

    ArrayList<SpinnerGetterMethods> countries;
    ImageView flag;
    TextView country;

    public SpinnerAdapterClass(@NonNull Context context, @NonNull ArrayList<SpinnerGetterMethods> country) {

        super(context, 0, country);
        countries = new ArrayList<>(country);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return setSpinnerItems(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return setSpinnerItems(position, convertView, parent);
    }


    public View setSpinnerItems(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View view = LayoutInflater.from(getContext()).inflate(R.layout.spinner_card, parent, false);

        flag = view.findViewById(R.id.flag);
        country = view.findViewById(R.id.country);

        SpinnerGetterMethods item = countries.get(position);

        flag.setImageResource(item.getFlagImage());
        country.setText(item.getCountryName());

        return view;
    }
}
