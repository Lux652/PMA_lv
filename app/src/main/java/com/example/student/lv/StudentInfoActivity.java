package com.example.student.lv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentInfoActivity extends AppCompatActivity {

    private Button oBtnPredmet;
    private String sPredmet;
    private EditText oPredmet;
    private String sIme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        oBtnPredmet = (Button)findViewById(R.id.buttonSave);
        oPredmet=(EditText)findViewById(R.id.textPredmet);

        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("imePrezime");

        oBtnPredmet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sPredmet = oPredmet.getText().toString();
                Intent oStudentPredmetIntent = new Intent(getApplicationContext(),SummaryActivity.class);
                oStudentPredmetIntent.putExtra("imePrezime",sIme);
                oStudentPredmetIntent.putExtra("predmet",sPredmet);
                startActivity(oStudentPredmetIntent);
            }
        });
    }
}
