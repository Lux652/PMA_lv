package com.example.student.lv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Object[] mDataset;


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




    public MyAdapter(Object[] myDataset) {
        mDataset = myDataset;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        if(viewType == 1){
            TextView view = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_layout, viewGroup, false);
            return new StudentVH(view);
        }

        else{
            TextView view = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_layout, viewGroup, false);
            return new NaslovVH(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int viewType) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
