package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MessagingActivity extends AppCompatActivity {


    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3,relativeLayout4,relativeLayout5,relativeLayout6,relativeLayout7,relativeLayout8,relativeLayout9,relativeLayout10,
            relativeLayout11,relativeLayout12,relativeLayout13,relativeLayout14,relativeLayout15,relativeLayout16,relativeLayout17,relativeLayout18,relativeLayout19,relativeLayout20,
            relativeLayout21,relativeLayout22,relativeLayout23,relativeLayout24,relativeLayout25,relativeLayout26,relativeLayout27,relativeLayout28,relativeLayout29,relativeLayout30;

    TextView text,text2,text3,text4,text5,text6,text7,text8,text9,text10,
            text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,
            text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);

        setViews();
    }

    private void setViews() {

        relativeLayout = findViewById(R.id.relativeLayout);
        text = findViewById(R.id.text);

        relativeLayout2 = findViewById(R.id.relativeLayout2);
        text2 = findViewById(R.id.text2);

        relativeLayout3 = findViewById(R.id.relativeLayout3);
        text3 = findViewById(R.id.text3);

        relativeLayout4 = findViewById(R.id.relativeLayout4);
        text4 = findViewById(R.id.text4);

        relativeLayout5 = findViewById(R.id.relativeLayout5);
        text5 = findViewById(R.id.text5);

        relativeLayout6 = findViewById(R.id.relativeLayout6);
        text6 = findViewById(R.id.text6);

        relativeLayout7 = findViewById(R.id.relativeLayout7);
        text7 = findViewById(R.id.text7);

        relativeLayout8 = findViewById(R.id.relativeLayout8);
        text8 = findViewById(R.id.text8);

        relativeLayout9 = findViewById(R.id.relativeLayout9);
        text9 = findViewById(R.id.text9);

        relativeLayout10 = findViewById(R.id.relativeLayout10);
        text10 = findViewById(R.id.text10);

        relativeLayout11 = findViewById(R.id.relativeLayout11);
        text11 = findViewById(R.id.text11);

        relativeLayout12 = findViewById(R.id.relativeLayout12);
        text12 = findViewById(R.id.text12);

        relativeLayout13 = findViewById(R.id.relativeLayout13);
        text13 = findViewById(R.id.text13);

        relativeLayout14 = findViewById(R.id.relativeLayout14);
        text14 = findViewById(R.id.text14);

        relativeLayout15 = findViewById(R.id.relativeLayout15);
        text15 = findViewById(R.id.text15);

        relativeLayout16 = findViewById(R.id.relativeLayout16);
        text16 = findViewById(R.id.text16);

        relativeLayout17 = findViewById(R.id.relativeLayout17);
        text17 = findViewById(R.id.text17);

        relativeLayout18 = findViewById(R.id.relativeLayout18);
        text18 = findViewById(R.id.text18);

        relativeLayout19 = findViewById(R.id.relativeLayout19);
        text19 = findViewById(R.id.text19);

        relativeLayout20 = findViewById(R.id.relativeLayout20);
        text20 = findViewById(R.id.text20);

        relativeLayout21 = findViewById(R.id.relativeLayout21);
        text21 = findViewById(R.id.text21);

        relativeLayout22 = findViewById(R.id.relativeLayout22);
        text22 = findViewById(R.id.text22);

        relativeLayout23 = findViewById(R.id.relativeLayout23);
        text23 = findViewById(R.id.text23);

        relativeLayout24 = findViewById(R.id.relativeLayout24);
        text24 = findViewById(R.id.text24);

        relativeLayout25 = findViewById(R.id.relativeLayout25);
        text25 = findViewById(R.id.text25);

        relativeLayout26 = findViewById(R.id.relativeLayout26);
        text26 = findViewById(R.id.text26);

        relativeLayout27 = findViewById(R.id.relativeLayout27);
        text27 = findViewById(R.id.text27);

        relativeLayout28 = findViewById(R.id.relativeLayout28);
        text28 = findViewById(R.id.text28);

        relativeLayout29 = findViewById(R.id.relativeLayout29);
        text29 = findViewById(R.id.text29);

        relativeLayout30 = findViewById(R.id.relativeLayout30);
        text30 = findViewById(R.id.text30);

    }

    public void calling(View view){

        int id = view.getId();

        switch(id){

            case R.id.relativeLayout:
                String getNum = text.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum)));
                break;

            case R.id.relativeLayout2:
                String getNum2 = text2.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum2)));
                break;

            case R.id.relativeLayout3:
                String getNum3 = text3.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum3)));
                break;

            case R.id.relativeLayout4:
                String getNum4 = text4.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum4)));
                break;

            case R.id.relativeLayout5:
                String getNum5 = text5.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum5)));
                break;

            case R.id.relativeLayout6:
                String getNum6 = text6.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum6)));
                break;

            case R.id.relativeLayout7:
                String getNum7 = text7.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum7)));
                break;

            case R.id.relativeLayout8:
                String getNum8 = text8.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum8)));
                break;

            case R.id.relativeLayout9:
                String getNum9 = text9.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum9)));
                break;

            case R.id.relativeLayout10:
                String getNum10 = text10.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum10)));
                break;

            case R.id.relativeLayout11:
                String getNum11 = text11.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum11)));
                break;

            case R.id.relativeLayout12:
                String getNum12 = text12.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum12)));
                break;

            case R.id.relativeLayout13:
                String getNum13 = text13.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum13)));
                break;

            case R.id.relativeLayout14:
                String getNum14 = text14.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum14)));
                break;

            case R.id.relativeLayout15:
                String getNum15 = text15.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum15)));
                break;

            case R.id.relativeLayout16:
                String getNum16 = text16.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum16)));
                break;

            case R.id.relativeLayout17:
                String getNum17 = text17.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum17)));
                break;

            case R.id.relativeLayout18:
                String getNum18 = text18.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum18)));
                break;

            case R.id.relativeLayout19:
                String getNum19 = text19.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum19)));
                break;

            case R.id.relativeLayout20:
                String getNum20 = text20.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum20)));
                break;

            case R.id.relativeLayout21:
                String getNum21 = text21.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum21)));
                break;

            case R.id.relativeLayout22:
                String getNum22 = text22.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum22)));
                break;

            case R.id.relativeLayout23:
                String getNum23 = text23.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum23)));
                break;

            case R.id.relativeLayout24:
                String getNum24 = text24.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum24)));
                break;

            case R.id.relativeLayout25:
                String getNum25 = text25.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum25)));
                break;

            case R.id.relativeLayout26:
                String getNum26 = text26.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum26)));
                break;

            case R.id.relativeLayout27:
                String getNum27 = text27.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum27)));
                break;

            case R.id.relativeLayout28:
                String getNum28 = text28.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum28)));
                break;

            case R.id.relativeLayout29:
                String getNum29 = text29.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum29)));
                break;

            case R.id.relativeLayout30:
                String getNum30 = text30.getText().toString();
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+getNum30)));
                break;

            default:
                Toast.makeText(this, "Number not available..!!", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
