package com.example.student.lv;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.student.lv.Adapter.FragmentAdapter;

public class InfoActivity extends AppCompatActivity {

    Button btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));

        btnEnd = findViewById(R.id.btnEnd);

        /**Ovdje se app crasha
        btnEnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { startActivity(new Intent(InfoActivity.this, MainActivity.class));
            }
        });*/
    }
}
