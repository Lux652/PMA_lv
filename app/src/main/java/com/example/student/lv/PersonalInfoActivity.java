package com.example.student.lv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalInfoActivity extends AppCompatActivity {

private Button oBtnIme;
private EditText oIme;
private String sImePrezime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        oBtnIme = (Button)findViewById(R.id.buttonSend);
        oIme = (EditText)findViewById(R.id.textName);

        oBtnIme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sImePrezime = oIme.getText().toString();
                Intent oStudentImeIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oStudentImeIntent.putExtra("imePrezime",sImePrezime);
                startActivity(oStudentImeIntent);
                //startActivity(new Intent(PersonalInfoActivity.this, StudentInfoActivity.class));
            }
        });


    }
    @Override
    public void onBackPressed() { }
}


