package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TestCenters extends AppCompatActivity {

    BottomSheetBehavior bottomSheetBehavior;
    NestedScrollView nestedScrollView;
    FloatingActionButton fab;
    int flag = 0;
    TextView testCenterDetails1, testCenterDetails2, testCenterDetails3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_centers);

        setViews();
    }

    private void setViews() {
        View view = findViewById(R.id.nestedScrollView);
        bottomSheetBehavior = BottomSheetBehavior.from(view);
        nestedScrollView = findViewById(R.id.nestedScrollView);
        fab = findViewById(R.id.fab);
        testCenterDetails1 = findViewById(R.id.testCenterDetails1);
        testCenterDetails2 = findViewById(R.id.testCenterDetails2);
        testCenterDetails3 = findViewById(R.id.testCenterDetails3);
    }

    public void showTestCenters(View view){

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        testCenterDetails2.setVisibility(View.VISIBLE);
        testCenterDetails3.setVisibility(View.VISIBLE);
        int id = view.getId();
        switch(id){
            case R.id.relativeLayout4:

                testCenterDetails1.setText("1) Rangaraya Medical College, Kakinada\n\n" +
                        "Address: Rangaraya Medical College, Kakinada Pithampuram Road, Kakinada, Andhra Pradesh 533001");

                testCenterDetails2.setText("2) Government Medical College, Anantapur\n\n" +
                        "Address: Government Medical College, Anantapur, Rahamat Nagar, Anantapur, Andhra Pradesh 515001");

                testCenterDetails3.setText("3) Guntur Medical College, Guntur\n\n" +
                        "Address: Guntur Medical College, Guntur Kanna Vari Thota, Guntur, Andhra Pradesh 522004");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout5:

                testCenterDetails1.setText("1) Tomo Riba Institute of Health & Medical Sciences, Naharlagun\n\n" +
                        "Address: National Highway 52A, Old Assembly Complex, Naharlagun, Arunachal Pradesh 791110");

                testCenterDetails2.setVisibility(View.INVISIBLE);
                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout6:

                testCenterDetails1.setText("1) Gauhati Medical College, Guwahati\n\n" +
                        "Address: Guwahati Narakasur Hilltop, Bhangagarh, Guwahati, Assam 781032");

                testCenterDetails2.setText("2) Regional Medical Research Centre, Dibrugarh\n\n" +
                        "Address: Regional Medical Research Centre, Dibrugarh Bokul, Lahowal, Dibrugarh, Assam, Assam 786001");

                testCenterDetails3.setText("3) Jorhat Medical College, Jorhat\n\n" +
                        "Address: Jorhat Medical College, Jorhat Kushal Konwar Path, Barbheta, Jorhat, Assam 785001");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout7:

                testCenterDetails1.setText("1) Rajendra Memorial Research Institute of Medical Sciences, Patna\n\n" +
                        "Address: Rajendra Memorial Research Institute of Medical Sciences, Sadikpur, Patna, Bihar 800007");

                testCenterDetails2.setText("2) Patna Medical College, Patna\n\n" +
                        "Address: Patna Medical College, Ashok Rajpath, Patna University Campus, Patna, Bihar 80001");

                testCenterDetails3.setText("3) Darbhanga Medical College, Darbhanga\n\n" +
                        "Address: Darbhanga Medical College, DMCH Rd, Allalpatti, Laheriasarai, Darbhanga, Bihar 846003");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout8:

                testCenterDetails1.setText("1) All India Institute of Medical Science (AIIMS), Raipur\n\n" +
                        "Address: All India Institute of Medical Science (AIIMS), Great Eastern Rd, AIIMS Campus, Tatibandh, Raipur, Chhattisgarh 492099");

                testCenterDetails2.setText("2) Late Baliram Kashyap M Govt. Medical College, Jagdalpur\n\n" +
                        "Address: Late Baliram Kashyap M Govt. Medical College, Dimrapal, Jagdalpur, Chhattisgarh 494001");

                testCenterDetails3.setText("3)Pt J.N.M. Medical College Raipur\n\n" +
                        "Address: Pt. Jawahar Lal Nehru Memorial Medical College, Jail Road, Raipur, Chhattisgarh 492001, India");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout9:

                testCenterDetails1.setText("1) Goa Medical College, Bambolim\n\n" +
                        "Address: Goa Medical College and Hospital, Bambolim Bambolim, Tiswadi Goa India 403202");

                testCenterDetails2.setVisibility(View.INVISIBLE);
                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout10:

                testCenterDetails1.setText("1) S. N. GENELAB, Nanpura, Surat\n\n" +
                        "Address: S. N. GENELAB, 2nd Floor, President Plaza-A, Nanpura, Surat, Gujarat, India 395001");

                testCenterDetails2.setText("2) PanGenomics International Pvt. Ltd., Ahmedabad\n\n" +
                        "Address: PanGenomics International Pvt. Ltd., 1st floor sankalp Squre Juna Sharda Mandir Cross Road, Ahmedabad, Gujarat 380006");

                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout11:

                testCenterDetails1.setText("1) ESIC Medical College and Hospital, Faridabad\n\n" +
                        "Address: ESIC Medical College and Hospital, NH-3, NIT, Faridabad, Haryana");

                testCenterDetails2.setText("2) Strand Life Sciences, Gurugram\n\n" +
                        "Address: Strand Life Sciences, A-17, Info Technology Park, Sector 34, Gurugram, Haryana 122001");

                testCenterDetails3.setText("3)SRL Limited, Gurugram\n\n" +
                        "Address: SRL Limited, GP 26 Sector 18, Gurugram, Haryana, India Pin 122015");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout12:

                testCenterDetails1.setText("1) Indira Gandhi Medical College, Shimla\n\n" +
                        "Address: Indira Gandhi Medical College, Ridge Sanjauli Rd, Lakkar Bazar, Shimla, Himachal Pradesh 171001");

                testCenterDetails2.setText("2) Dr. Rajendra Prasad Government Medical College, Tanda\n\n" +
                        "Address: Dr. Rajendra Prasad Government Medical College, Tanda Hospital Rd, Kangra, Himachal Pradesh 176001");

                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout13:

                testCenterDetails1.setText("1) Mysore Medical College & Research Institute, Mysore\n\n" +
                        "Address: Mysore Medical College & Research Institute, Irwin Road, next to Railway Station, Mysuru, Karnataka 570001");

                testCenterDetails2.setText("2) Shimoga Institute of Medical Sciences, Shivamogga\n\n" +
                        "Address: Shimoga Institute of Medical Sciences, N.H.206, Sagara Road, Shivamogga, Karnataka 577201");

                testCenterDetails3.setText("3) Command Hospital (Air Force) Bengaluru\n\n" +
                        "Address: Command Hospital (Air Force) , Cambridge Rd, Cambridge Layout, Jogupalya, Bengaluru, Karnataka 560007");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout14:

                testCenterDetails1.setText("1) National Institute of Virology Field Unit, Allapuzzha\n\n" +
                        "Address: National Institute of Virology Field Unit, Allapuzzha Vandanam, Kerala 688005");

                testCenterDetails2.setText("2) Government Medical College, Thrissur\n\n" +
                        "Address: Government Medical College, M. G. Kavu, Thrissur, Kerala 680596");

                testCenterDetails3.setText("3) Interuniversity, Kottayam\n\n" +
                        "Address: Interuniversity, Kottayam, Thalappady, Kerala 686019");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout15:

                testCenterDetails1.setText("1) Mahatma Gandhi Memorial Medical College, Indore\n\n" +
                        "Address: MGM Medical College, A.B.Road, Indore, 452001 Indore, Madhya Pradesh");

                testCenterDetails2.setText("2) Gandhi Medical College, Bhopal\n\n" +
                        "Address: Gandhi Medical College, Sultania Rd, near Hamidia Hospital, Royal Market, Bhopal, Madhya Pradesh 462001");

                testCenterDetails3.setText("3) Gajra Raja Medical College, Gwalior\n\n" +
                        "Address: Gajra Raja Medical College, Yadav Colony, Lashkar, Gwalior, Madhya Pradesh 474009");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout16:

                testCenterDetails1.setText("1) National Institute of Virology, Pune\n\n" +
                        "Address: National Institute of Virology, Pune, 130/1, Pashan - Sus Rd, Pashan Gaon, Pashan, Pune, Maharashtra 411021");

                testCenterDetails2.setText("2) Seth GS Medical College & KEM Hospital, Mumbai\n\n" +
                        "Address: Seth GS Medical College & KEM Hospital, Acharya Donde Marg, Parel, Mumbai, Maharashtra 400012\n");

                testCenterDetails3.setText("3) National Institute of Virology Field Unit, Mumbai\n\n" +
                        "Address: National Institute of Virology Field Unit, Haffkine Institute Compound, A D Marg, Parel Mumbai 4000012");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout17:

                testCenterDetails1.setText("1) Jawaharlal Nehru Institute of Medical Sciences, Imphal\n\n" +
                        "Address: Jawaharlal Nehru Institute of Medical Sciences, Porompat, Imphal, Manipur 795004");

                testCenterDetails2.setText("2) Regional Institute of Medical Sciences, Imphal\n\n" +
                        "Address: Regional Institute of Medical Sciences, Lamphel Road, Lamphelpat, Imphal, Manipur 795004");

                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout18:

                testCenterDetails1.setText("1) North Eastern Indira Gandhi Regional Institute of Health and Medical Sciences (NEIGRIHMS), Shillong\n\n" +
                        "Address: North Eastern Indira Gandhi Regional Institute of Health and Medical Sciences (NEIGRIHMS), NEIGRIHMS, Mawdiangdiang Shillong-793018, Meghalaya, India");

                testCenterDetails2.setVisibility(View.INVISIBLE);
                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout19:

                testCenterDetails1.setText("1) Zoram Medical College, Aizwal\n\n" +
                        "Address: Zoram Medical College, State Referral Hospital, Falkawn, Aizwal, Mizoram 796005");

                testCenterDetails2.setVisibility(View.INVISIBLE);
                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout21:

                testCenterDetails1.setText("1) ICMR-Regional Medical Research Centre (RMRC), Bhubaneswar\n\n" +
                        "Address: ICMR-Regional Medical Research Centre (RMRC), Chandrasekharpur, Bhubaneswar - 751 023, Odisha");

                testCenterDetails2.setText("2) All India Institute of Medical Sciences (AIIMS), Bhubaneswar\n\n" +
                        "Address: All India Institute of Medical Sciences (AIIMS), Sijua, Patrapada, Bhubaneswar, Odisha 751019");

                testCenterDetails3.setText("3) SCB Medical College, Cuttack\n\n" +
                        "Address: SCB Medical College, PG Hostel, Cuttack, Odisha 753001");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout22:

                testCenterDetails1.setText("1) Government Medical College, Amritsar\n\n" +
                        "Address: Government Medical College, Medical Enclave, Amritsar, Punjab 143001");

                testCenterDetails2.setText("2) Government Medical College, Patiala\n\n" +
                        "Address: Government Medical College, Sangrur Rd, New Lal Bagh Colony, Patiala, Punjab 147001");

                testCenterDetails3.setText("3) Guru Gobind Singh Medical College & Hospital, Faridkot\n\n" +
                        "Address: Guru Gobind Singh Medical College & Hospital, Sadiq Road, Faridkot, Punjab 151203, India");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout23:

                testCenterDetails1.setText("1) Jhalawar Medical College, Jhalawar\n\n" +
                        "Address: Jhalawar Medical College, N.H.-12, Kota Rd, Jhalawar, Rajasthan 326001");

                testCenterDetails2.setText("2) RNT Medical College, Udaipur\n\n" +
                        "Address: RNT Medical College, Court Chowk, City's Prime Health Care Area, Udaipur, Rajasthan 313001");

                testCenterDetails3.setText("3) S.P. Medical College, Bikaner\n\n" +
                        "Address: S.P. Medical College, PBM Hospital, Bikaner, Rajasthan 334001");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout24:

                testCenterDetails1.setText("1) Sir Thutob Namgyal Memorial Hospital (STNM), Gangtok\n\n" +
                        "Address: STNM Hospital, Sungava, Gangtok, Sikkim 737101");

                testCenterDetails2.setVisibility(View.INVISIBLE);
                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout25:

                testCenterDetails1.setText("1) King Institute of Preventive Medicine and Research, Chennai\n\n" +
                        "Address: King Institute of Preventive Medicine and Research, Chennai");

                testCenterDetails2.setText("2) Government Theni Medical College, Theni\n\n" +
                        "Address: Govt. Theni Medical College, k. villakku, Tamil Nadu 625531");

                testCenterDetails3.setText("3) IRT Perundurai Medical College, Perundurai\n\n" +
                        "Address: IRT Perundurai Medical College, Perundurai -638053 Erode District TamilNadu, India");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout26:

                testCenterDetails1.setText("1) Gandhi Medical College, Secunderabad\n\n" +
                        "Address: Gandhi Medical College, Musheerabad, Padmarao Nagar, Secunderabad, Telangana 500003");

                testCenterDetails2.setText("2) Nizam's Institute Of Medical Sciences, Hyderabad\n\n" +
                        "Address: Punjagutta Rd, Punjagutta Market, Punjagutta, Hyderabad, Telangana 500082");

                testCenterDetails3.setText("3) Institute of Preventive Medicine, Hyderabad\n\n" +
                        "Address: Institute of Preventive Medicine, Narayanaguda, Hyderabad, Telangana 500029");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout27:

                testCenterDetails1.setText("1) Government Medical College, Agartala\n\n" +
                        "Address: Government Medical College, 79 Tilla, Agartala, Tripura 799006");

                testCenterDetails2.setVisibility(View.INVISIBLE);
                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout28:

                testCenterDetails1.setText("1) Government Medical College, Haldwani\n\n" +
                        "Address: Government Medical College, Rampur Rd, Rampur, Haldwani, Uttarakhand 263129");

                testCenterDetails2.setText("2) All India Institute of Medical Sciences (AIIMS), Rishikesh\n\n" +
                        "Address: All India Institute of Medical Sciences (AIIMS), Virbhadra Road Shivaji Nagar, near Barrage, Sturida Colony, Rishikesh, Uttarakhand 249203");

                testCenterDetails3.setVisibility(View.INVISIBLE);

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout29:

                testCenterDetails1.setText("1) King George's Medical University, Lucknow\n\n" +
                        "Address: King George's Medical University, Shah Mina Rd, Chowk, Lucknow, Uttar Pradesh 226003");

                testCenterDetails2.setText("2) Jawaharlal Nehru Medical College, Aligarh\n\n" +
                        "Address: Jawaharlal Nehru Medical College, Medical Rd, AMU Campus, Aligarh, Uttar Pradesh 202002");

                testCenterDetails3.setText("3) Command Hospital, Lucknow\n\n" +
                        "Address: Command Hospital, Lucknow, Uttar Pradesh 226002");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            case R.id.relativeLayout30:

                testCenterDetails1.setText("1) Midnapore Medical College, Midnapore\n\n" +
                        "Address: Midnapore Medical College, Vidyasagar Road , Paschim Medinipur, Midnapore, West Bengal, 721 101");

                testCenterDetails2.setText("2) North Bengal Medical College, Siliguri\n\n" +
                        "Address: North Bengal Medical College, Sushruta Nagar, Siliguri, West Bengal 734012");

                testCenterDetails3.setText("3) School of Tropical Medicine, Kolkata\n\n" +
                        "Address: School of Tropical Medicine, 108, Chittaranjan Avenue, Kolkata - 700073, West Bengal");

                fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
                flag = 1;
                break;

            default:
                Toast.makeText(this, "Some Error Occurred..!!", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    public void fabButtonClick(View view) {
        if (flag == 0) {
            fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_black_24dp));
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            flag = 1;

        } else {
            fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_upward_black_24dp));
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            flag = 0;

            nestedScrollView.fullScroll(View.FOCUS_UP);
        }
    }

    @Override
    public void onBackPressed() {
        if(flag==1){
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            fab.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_upward_black_24dp));
            flag = 0;
        }
        else{
            startActivity(new Intent(TestCenters.this, FirstPage_Activity.class));
        }
    }
}
