package com.example.student.lv;

import android.app.Person;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private String sIme;
    private String sPredmet;
    private TextView oIme;
    private TextView oPredmet;
    private Button oBtnEnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("imePrezime");
        sPredmet = oExtras.getString("predmet");

        oIme = (TextView)findViewById(R.id.textViewStudent);
        oPredmet = (TextView)findViewById(R.id.textViewPredmet);

        oIme.setText(sIme);
        oPredmet.setText(sPredmet);

       oBtnEnd = (Button)findViewById(R.id.buttonEnd);
        oBtnEnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SummaryActivity.this, PersonalInfoActivity.class));
            }
        });

    }
}
