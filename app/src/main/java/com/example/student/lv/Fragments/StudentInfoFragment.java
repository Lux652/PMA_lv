package com.example.student.lv.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.student.lv.Listeners.StudentInfoListener;
import com.example.student.lv.Models.CoursesResponse;
import com.example.student.lv.Network.RetrofitManager;
import com.example.student.lv.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentInfoFragment extends Fragment implements Callback<CoursesResponse> {
    public static StudentInfoFragment newInstance(){
        Bundle args = new Bundle();

        StudentInfoFragment fragment = new StudentInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public StudentInfoListener studentInfoListener;

    EditText etPredmet;
    EditText etProfesor;
    EditText etGodina;
    EditText etECTS;
    EditText etPredavanja;
    EditText etLV;

    private Spinner spPredmet;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info_layout,container,false);
        etPredmet=view.findViewById(R.id.textPredmet);
        etProfesor = view.findViewById(R.id.editProfIme);
        etGodina = view.findViewById(R.id.editGodina);
        etECTS = view.findViewById(R.id.editECTS);
        etPredavanja = view.findViewById(R.id.editPred);
        etLV = view.findViewById(R.id.editLV);

        spPredmet = (Spinner) view.findViewById(R.id.spinnerPredmet);



        /**ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values );
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spPredmet.setAdapter(adapter);*/



        Call<CoursesResponse> callResponse = RetrofitManager.getInstance().service().getCourses();
        callResponse.enqueue(this);


        etPredmet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                studentInfoListener.setPredmet(etPredmet.getText().toString());

            }
        });

        etProfesor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                studentInfoListener.setProfesor(etProfesor.getText().toString());

            }
        });

        etECTS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                studentInfoListener.setECTS(etECTS.getText().toString());

            }
        });

        etGodina.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                studentInfoListener.setGodina(etGodina.getText().toString());

            }
        });

        etPredavanja.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                studentInfoListener.setPredavanja(etPredavanja.getText().toString());

            }
        });

        etLV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                studentInfoListener.setLV(etLV.getText().toString());

            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        studentInfoListener = null;
    }


    @Override
    public void onResponse(Call<CoursesResponse> call, Response<CoursesResponse> response) {
        String text;

        if(response.isSuccessful() && response.body()!=null){
            text = response.body().getCourses().toString();
        }

        else{
            text = "";
        }


    setText(text);



    }

    @Override
    public void onFailure(Call<CoursesResponse> call, Throwable t) {

    }

    void setText(String text){



    }
}
