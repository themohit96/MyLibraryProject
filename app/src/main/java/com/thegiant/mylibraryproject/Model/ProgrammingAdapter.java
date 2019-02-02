package com.thegiant.mylibraryproject.Model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thegiant.mylibraryproject.R;

import java.util.ArrayList;




public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
   // String[] data1,data2,data3;
  ArrayList<String> arrayList,arrayList2,arrayList3;
    public ProgrammingAdapter(ArrayList<String> arrayList,ArrayList<String> arrayList2,ArrayList<String> arrayList3){
        this.arrayList=arrayList;
        this.arrayList2=arrayList2;
        this.arrayList3=arrayList3;

    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
       View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
            String name,dur,fee;

            name=arrayList.get(position);
            dur=arrayList2.get(position);
            fee=arrayList3.get(position);
            holder.courseName.setText(name);
            holder.cDuration.append(dur);
            holder.cFees.append(fee);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        TextView courseName,cDuration,cFees;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            courseName=itemView.findViewById(R.id.tvCourseName);
            cDuration=itemView.findViewById(R.id.tvDuration);
            cFees=itemView.findViewById(R.id.tvFees);


        }
    }
}
