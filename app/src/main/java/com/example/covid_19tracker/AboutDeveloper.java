package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AboutDeveloper extends AppCompatActivity {

    FloatingActionButton fab,fab2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);

        setViews();
    }

    private void setViews() {
        fab = findViewById(R.id.fab);
        fab2 = findViewById(R.id.fab2);
    }

    public void text(View view){
        Intent sendIntent = new Intent();
        sendIntent.setType("text/*");
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "I've checked your app. And this is what i think about it : ");

        startActivity(Intent.createChooser(sendIntent, "Share App"));
    }

    public void call(View view){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7595912892")));
    }
}
