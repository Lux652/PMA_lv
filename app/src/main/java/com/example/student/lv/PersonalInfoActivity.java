package com.example.student.lv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalInfoActivity extends AppCompatActivity {
private Button oBtnUpisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        oBtnUpisi = (Button)findViewById(R.id.buttonSend);
        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PersonalInfoActivity.this, StudentInfoActivity.class));
            }
        });







    }
}
