package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.razerdp.widget.animatedpieview.AnimatedPieView;
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import com.razerdp.widget.animatedpieview.callback.OnPieSelectListener;
import com.razerdp.widget.animatedpieview.data.IPieInfo;
import com.razerdp.widget.animatedpieview.data.SimplePieInfo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Statistics extends AppCompatActivity {

    TextView count,count2,count3,count4,count5,count6;
    ProgressBar progressBar2,progressBar3;
    AnimatedPieView animatedPieView;
    Spinner spinner;
    ArrayList<SpinnerGetterMethods> countries;
    SpinnerAdapterClass spinnerAdapterClass;
    RelativeLayout mainRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        setArrayList();
        setViews();
        spinnerOnClick();
    }

    private void spinnerOnClick() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGetterMethods item = (SpinnerGetterMethods) parent.getItemAtPosition(position);

                progressBar2.setVisibility(View.VISIBLE);
                progressBar3.setVisibility(View.VISIBLE);
                mainRelativeLayout.setVisibility(View.INVISIBLE);
                getRetrofitData(item.getCountryName());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setArrayList() {
        countries = new ArrayList<>();
        countries.add(new SpinnerGetterMethods(R.drawable.world, "World"));
        countries.add(new SpinnerGetterMethods(R.drawable.usa, "USA"));
        countries.add(new SpinnerGetterMethods(R.drawable.brazil, "Brazil"));
        countries.add(new SpinnerGetterMethods(R.drawable.russia, "Russia"));
        countries.add(new SpinnerGetterMethods(R.drawable.india, "India"));
        countries.add(new SpinnerGetterMethods(R.drawable.uk, "UK"));
        countries.add(new SpinnerGetterMethods(R.drawable.spain, "Spain"));
        countries.add(new SpinnerGetterMethods(R.drawable.peru, "Peru"));
        countries.add(new SpinnerGetterMethods(R.drawable.itly, "Italy"));
        countries.add(new SpinnerGetterMethods(R.drawable.chile, "Chile"));
        countries.add(new SpinnerGetterMethods(R.drawable.iran, "Iran"));
        countries.add(new SpinnerGetterMethods(R.drawable.germany, "Germany"));
        countries.add(new SpinnerGetterMethods(R.drawable.pakistan, "Pakistan"));
        countries.add(new SpinnerGetterMethods(R.drawable.china, "China"));
        countries.add(new SpinnerGetterMethods(R.drawable.bangladesh, "Bangladesh"));
    }

    private void setViews() {
        mainRelativeLayout = findViewById(R.id.mainRelativeLayout);
        count = findViewById(R.id.count);
        count2 = findViewById(R.id.count2);
        count3 = findViewById(R.id.count3);
        count4 = findViewById(R.id.count4);
        count5 = findViewById(R.id.count5);
        count6 = findViewById(R.id.count6);
        progressBar2 = findViewById(R.id.progressBar2);
        progressBar3 = findViewById(R.id.progressBar3);
        animatedPieView = findViewById(R.id.PieView);
        spinner = findViewById(R.id.spinner);
        spinnerAdapterClass = new SpinnerAdapterClass(this, countries);
        spinner.setAdapter(spinnerAdapterClass);
    }

    private void makePieChart(int confirmed, int active, int recovered, int death) {
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.addData(new SimplePieInfo(confirmed, Color.parseColor("#FFFF4444"), "Confirmed Cases "))
        .addData(new SimplePieInfo(active, Color.parseColor("#FFFFBB33"), "Active Cases "))
        .addData(new SimplePieInfo(recovered, Color.parseColor("#FF99CC00"), "Total Recovered "))
        .addData(new SimplePieInfo(death, Color.parseColor("#FF1565C0"), "Total Death "))
        .splitAngle(1)
//        .drawText(true)
        .textSize(20)
        .pieRadius(120)
        .strokeWidth(40)
        .duration(2000);
//        .autoSize(true);


        config.selectListener(new OnPieSelectListener<IPieInfo>() {
            @Override
            public void onSelectPie(@NonNull IPieInfo pieInfo, boolean isFloatUp) {
                Toast.makeText(Statistics.this, pieInfo.getDesc()+" : "+ (int) pieInfo.getValue(), Toast.LENGTH_SHORT).show();
            }
        });

        animatedPieView.applyConfig(config);
        animatedPieView.start();
    }

    private void getRetrofitData(final String countryName){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://coronavirus-19-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Retrofit_Interface retrofit_interface = retrofit.create(Retrofit_Interface.class);

        Call<List<GetCountryData>> call = retrofit_interface.getData();

        call.enqueue(new Callback<List<GetCountryData>>() {
            @Override
            public void onResponse(Call<List<GetCountryData>> call, Response<List<GetCountryData>> response) {

                int confirmed, active, recovered, death;

                if(!response.isSuccessful()){
                    Toast.makeText(Statistics.this, "Error..!! Error Code : "+response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                List<GetCountryData> countryData = response.body();
                assert countryData != null;
                for(GetCountryData data : countryData){

                    if(data.getCountry_name().equals(countryName)){
                        count.setText(String.valueOf(data.getConfirmedCases()));
                        count2.setText(String.valueOf(data.getNewCases()));
                        count3.setText(String.valueOf(data.getDeceased()));
                        count4.setText(String.valueOf(data.getTodayDeceased()));
                        count5.setText(String.valueOf(data.getTotalRecovery()));
                        count6.setText(String.valueOf(data.getTotalActive()));

                        progressBar2.setVisibility(View.INVISIBLE);
                        progressBar3.setVisibility(View.INVISIBLE);
                        mainRelativeLayout.setVisibility(View.VISIBLE);

                        confirmed = data.getConfirmedCases();
                        active = data.getTotalActive();
                        recovered = data.getTotalRecovery();
                        death = data.getDeceased();

                        makePieChart(confirmed,active,recovered,death);
                    }
                }

            }

            @Override
            public void onFailure(Call<List<GetCountryData>> call, Throwable t) {
                progressBar2.setVisibility(View.INVISIBLE);
                progressBar3.setVisibility(View.INVISIBLE);
                mainRelativeLayout.setVisibility(View.VISIBLE);
                Toast.makeText(Statistics.this, "Unable to connect to the internet..!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
