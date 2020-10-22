package com.example.covid_19tracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FirstPage_Activity extends AppCompatActivity {

    ImageView app_bar_image;
    Toolbar toolbar;
    ActionBar actionBar;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page_);


        setViews();
        imageViewAutoChange();

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private void imageViewAutoChange() {

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.main_wallpaper1),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.main_wallpaper2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.main_wallpaper3),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.main_wallpaper4),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.sanitize_icon),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.social_distancing_icon),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.stay_home_icon),3000);

        app_bar_image.setBackground(animationDrawable);
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();
    }

    private void setViews() {

        fab = findViewById(R.id.fab);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setTitle("");
        app_bar_image = findViewById(R.id.app_bar_image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.actionbar_menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.aboutDeveloper:
                startActivity(new Intent(FirstPage_Activity.this, AboutDeveloper.class));
                break;

            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setType("text/*");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "https://drive.google.com/file/d/1F_-bd96Fdg3pKyzEWGLpvE9dMsoaw1xA/view?usp=sharing");

                startActivity(Intent.createChooser(sendIntent, "Share App"));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Exit?").setMessage("Are you sure you want to exit?")
        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    finishAffinity();
            }
        }).create().show();
    }

    public void statistics(View view){
        startActivity(new Intent(FirstPage_Activity.this, Statistics.class));
    }

    public void testCenters(View view){
        startActivity(new Intent(FirstPage_Activity.this, TestCenters.class));
    }

    public void symptomChecker(View view){
        startActivity(new Intent(FirstPage_Activity.this, SymptomChecker.class));
    }

    public void myths(View view){
        startActivity(new Intent(FirstPage_Activity.this, Myths.class));
    }

    public void faq(View view){
        startActivity(new Intent(FirstPage_Activity.this, FAQ.class));
    }

    public void callHelpline(View view){

        startActivity(new Intent(FirstPage_Activity.this, CallingActivity.class));
    }

    public void textHelpline(View view){

        startActivity(new Intent(FirstPage_Activity.this, MessagingActivity.class));
    }

}
