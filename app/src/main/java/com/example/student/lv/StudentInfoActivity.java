package com.example.student.lv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentInfoActivity extends AppCompatActivity {

    private Button oBtnInfo;
    private String sPredmet;
    private String sProfesor;
    private String sGodina;
    private String sECTS;
    private EditText oPredmet;
    private EditText oProfesor;
    private EditText oGodina;
    private EditText oECTS;

    private String sIme;
    private String sPrezime;
    private String sRodenje;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        oBtnInfo = (Button)findViewById(R.id.btnInfo);

        oPredmet=(EditText)findViewById(R.id.textPredmet);
        oProfesor=(EditText)findViewById(R.id.editProfIme);
        oGodina=(EditText)findViewById(R.id.editGodina);
        oECTS=(EditText)findViewById(R.id.editECTS);




        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("ime");
        sPrezime = oExtras.getString("prezime");
        sRodenje = oExtras.getString("rodenje");

        oBtnInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sPredmet = oPredmet.getText().toString();
                sProfesor = oProfesor.getText().toString();
                sGodina = oGodina.getText().toString();
                sECTS = oECTS.getText().toString();

                Intent oStudentPredmetIntent = new Intent(getApplicationContext(),SummaryActivity.class);
                oStudentPredmetIntent.putExtra("ime",sIme);
                oStudentPredmetIntent.putExtra("prezime",sPrezime);
                oStudentPredmetIntent.putExtra("rodenje",sRodenje);

                oStudentPredmetIntent.putExtra("predmet",sPredmet);
                oStudentPredmetIntent.putExtra("profesor",sProfesor);
                oStudentPredmetIntent.putExtra("godina",sGodina);
                oStudentPredmetIntent.putExtra("ects",sECTS);

                startActivity(oStudentPredmetIntent);
            }
        });
    }
}
