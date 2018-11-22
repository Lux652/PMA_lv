package com.example.student.lv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    /*Od prosli puta*/

   /* private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Object>lStudent = new ArrayList<>();
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*
       od prosli puta
       mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(lStudent);
        Student imeprezime = new Student("Luka", "Kovacic");
        lStudent.add(imeprezime);
        mRecyclerView.setAdapter(mAdapter);*/

      RecyclerView recView = findViewById(R.id.recyclerView);
      List<Object>studentList = generateList();
      initializeRecyclerView(recView, studentList);

    }

    List<Object> generateList(){
        List<Object> list = new ArrayList<>();

        list.add("Studenti");
        list.add(new Student("Luka","Kovacic"));
        list.add(new Student("Dobar","Majstor"));
        list.add(new Student("Tvrdi","Sir"));

        return list;
    }

    void initializeRecyclerView(RecyclerView recyclerView,List<Object>studentList){
        recyclerView.setAdapter(new MainRecyclerViewAdapter(studentList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
