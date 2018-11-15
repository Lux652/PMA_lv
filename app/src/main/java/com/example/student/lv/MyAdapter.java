package com.example.student.lv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] mDataset;


    public class NaslovVH extends RecyclerView.ViewHolder{
        TextView naslov;

        public NaslovVH(@NonNull View itemView) {
            super(itemView);
            naslov = itemView.findViewById(R.id.tvHeader);
        }
    }


    public class StudentVH extends RecyclerView.ViewHolder{
        TextView ime;
        TextView prezime;

        public StudentVH(@NonNull View itemView) {
            super(itemView);
            ime = itemView.findViewById(R.id.tvStudentIme);
            prezime = itemView.findViewById(R.id.tvStudentPrezime);
        }
    }




    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
