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
import android.widget.EditText;

import com.example.student.lv.Listeners.PersonalInfoListener;
import com.example.student.lv.R;

public class PersonalInfoFragment extends Fragment {

    public static PersonalInfoFragment newInstance(){

        Bundle args = new Bundle();

        PersonalInfoFragment fragment = new PersonalInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public PersonalInfoListener personalInfoListener;
    EditText etName;
    EditText etSurname;
    EditText etBirthDate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal_info_layout,container,false);
        etName = view.findViewById(R.id.editIme);
        etSurname = view.findViewById(R.id.editPrezime);
        etBirthDate = view.findViewById(R.id.editRodenje);

        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(personalInfoListener!=null){
                    personalInfoListener.setName(etName.getText().toString());

                }

            }
        });

        etSurname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                personalInfoListener.setLastName(etSurname.getText().toString());

            }
        });

        etBirthDate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                personalInfoListener.setBirthDate(etBirthDate.getText().toString());

            }
        });

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        personalInfoListener = null;
    }
}

