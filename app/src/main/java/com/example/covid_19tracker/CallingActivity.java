package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CallingActivity extends AppCompatActivity {

    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3,relativeLayout4,relativeLayout5,relativeLayout6,relativeLayout7,relativeLayout8,relativeLayout9,relativeLayout10,
            relativeLayout11,relativeLayout12,relativeLayout13,relativeLayout14,relativeLayout15,relativeLayout16,relativeLayout17,relativeLayout18,relativeLayout19,relativeLayout20,
            relativeLayout21,relativeLayout22,relativeLayout23,relativeLayout24,relativeLayout25,relativeLayout26,relativeLayout27,relativeLayout28,relativeLayout29,relativeLayout30;
    
    TextView number,number2,number3,number4,number5,number6,number7,number8,number9,number10,
            number11,number12,number13,number14,number15,number16,number17,number18,number19,number20,
            number21,number22,number23,number24,number25,number26,number27,number28,number29,number30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);

        setViews();
    }

    private void setViews() {

        relativeLayout = findViewById(R.id.relativeLayout);
        number = findViewById(R.id.number);
        
        relativeLayout2 = findViewById(R.id.relativeLayout2);
        number2 = findViewById(R.id.number2);

        relativeLayout3 = findViewById(R.id.relativeLayout3);
        number3 = findViewById(R.id.number3);

        relativeLayout4 = findViewById(R.id.relativeLayout4);
        number4 = findViewById(R.id.number4);

        relativeLayout5 = findViewById(R.id.relativeLayout5);
        number5 = findViewById(R.id.number5);

        relativeLayout6 = findViewById(R.id.relativeLayout6);
        number6 = findViewById(R.id.number6);

        relativeLayout7 = findViewById(R.id.relativeLayout7);
        number7 = findViewById(R.id.number7);

        relativeLayout8 = findViewById(R.id.relativeLayout8);
        number8 = findViewById(R.id.number8);

        relativeLayout9 = findViewById(R.id.relativeLayout9);
        number9 = findViewById(R.id.number9);

        relativeLayout10 = findViewById(R.id.relativeLayout10);
        number10 = findViewById(R.id.number10);

        relativeLayout11 = findViewById(R.id.relativeLayout11);
        number11 = findViewById(R.id.number11);

        relativeLayout12 = findViewById(R.id.relativeLayout12);
        number12 = findViewById(R.id.number12);

        relativeLayout13 = findViewById(R.id.relativeLayout13);
        number13 = findViewById(R.id.number13);

        relativeLayout14 = findViewById(R.id.relativeLayout14);
        number14 = findViewById(R.id.number14);

        relativeLayout15 = findViewById(R.id.relativeLayout15);
        number15 = findViewById(R.id.number15);

        relativeLayout16 = findViewById(R.id.relativeLayout16);
        number16 = findViewById(R.id.number16);

        relativeLayout17 = findViewById(R.id.relativeLayout17);
        number17 = findViewById(R.id.number17);

        relativeLayout18 = findViewById(R.id.relativeLayout18);
        number18 = findViewById(R.id.number18);

        relativeLayout19 = findViewById(R.id.relativeLayout19);
        number19 = findViewById(R.id.number19);

        relativeLayout20 = findViewById(R.id.relativeLayout20);
        number20 = findViewById(R.id.number20);

        relativeLayout21 = findViewById(R.id.relativeLayout21);
        number21 = findViewById(R.id.number21);

        relativeLayout22 = findViewById(R.id.relativeLayout22);
        number22 = findViewById(R.id.number22);

        relativeLayout23 = findViewById(R.id.relativeLayout23);
        number23 = findViewById(R.id.number23);

        relativeLayout24 = findViewById(R.id.relativeLayout24);
        number24 = findViewById(R.id.number24);

        relativeLayout25 = findViewById(R.id.relativeLayout25);
        number25 = findViewById(R.id.number25);

        relativeLayout26 = findViewById(R.id.relativeLayout26);
        number26 = findViewById(R.id.number26);

        relativeLayout27 = findViewById(R.id.relativeLayout27);
        number27 = findViewById(R.id.number27);

        relativeLayout28 = findViewById(R.id.relativeLayout28);
        number28 = findViewById(R.id.number28);

        relativeLayout29 = findViewById(R.id.relativeLayout29);
        number29 = findViewById(R.id.number29);

        relativeLayout30 = findViewById(R.id.relativeLayout30);
        number30 = findViewById(R.id.number30);
        
    }

    public void calling(View view){

        int id = view.getId();
        
        switch(id){
            
            case R.id.relativeLayout:
                String getNum = number.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum)));
                break;

            case R.id.relativeLayout2:
                String getNum2 = number2.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum2)));
                break;

            case R.id.relativeLayout3:
                String getNum3 = number3.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum3)));
                break;

            case R.id.relativeLayout4:
                String getNum4 = number4.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum4)));
                break;

            case R.id.relativeLayout5:
                String getNum5 = number5.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum5)));
                break;

            case R.id.relativeLayout6:
                String getNum6 = number6.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum6)));
                break;

            case R.id.relativeLayout7:
                String getNum7 = number7.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum7)));
                break;

            case R.id.relativeLayout8:
                String getNum8 = number8.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum8)));
                break;

            case R.id.relativeLayout9:
                String getNum9 = number9.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum9)));
                break;

            case R.id.relativeLayout10:
                String getNum10 = number10.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum10)));
                break;

            case R.id.relativeLayout11:
                String getNum11 = number11.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum11)));
                break;

            case R.id.relativeLayout12:
                String getNum12 = number12.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum12)));
                break;

            case R.id.relativeLayout13:
                String getNum13 = number13.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum13)));
                break;

            case R.id.relativeLayout14:
                String getNum14 = number14.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum14)));
                break;

            case R.id.relativeLayout15:
                String getNum15 = number15.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum15)));
                break;

            case R.id.relativeLayout16:
                String getNum16 = number16.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum16)));
                break;

            case R.id.relativeLayout17:
                String getNum17 = number17.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum17)));
                break;

            case R.id.relativeLayout18:
                String getNum18 = number18.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum18)));
                break;

            case R.id.relativeLayout19:
                String getNum19 = number19.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum19)));
                break;

            case R.id.relativeLayout20:
                String getNum20 = number20.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum20)));
                break;

            case R.id.relativeLayout21:
                String getNum21 = number21.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum21)));
                break;

            case R.id.relativeLayout22:
                String getNum22 = number22.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum22)));
                break;

            case R.id.relativeLayout23:
                String getNum23 = number23.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum23)));
                break;

            case R.id.relativeLayout24:
                String getNum24 = number24.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum24)));
                break;

            case R.id.relativeLayout25:
                String getNum25 = number25.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum25)));
                break;

            case R.id.relativeLayout26:
                String getNum26 = number26.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum26)));
                break;

            case R.id.relativeLayout27:
                String getNum27 = number27.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum27)));
                break;

            case R.id.relativeLayout28:
                String getNum28 = number28.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum28)));
                break;

            case R.id.relativeLayout29:
                String getNum29 = number29.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum29)));
                break;

            case R.id.relativeLayout30:
                String getNum30 = number30.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getNum30)));
                break;

            default:
                Toast.makeText(this, "Number not available..!!", Toast.LENGTH_SHORT).show();
                break;

        }
            
    }
}
