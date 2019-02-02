package com.thegiant.mylibraryproject.Model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.thegiant.mylibraryproject.R;

import java.util.ArrayList;


public class AdapterForTest extends RecyclerView.Adapter<AdapterForTest.ProgrammingViewHolder> {
    ArrayList<String> arrayList,arrayList2,arrayList3,arrayList4,arrayList5;



    public AdapterForTest(ArrayList<String> arrayList,ArrayList<String> arrayList2,ArrayList<String> arrayList3,ArrayList<String> arrayList4,ArrayList<String> arrayList5){
        this.arrayList=arrayList;
        this.arrayList2=arrayList2;
        this.arrayList3=arrayList3;
        this.arrayList4=arrayList4;
        this.arrayList5=arrayList5;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.new_test_format,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String question,opt_a,opt_b,opt_c,opt_d;
        question=arrayList.get(position);
        opt_a=arrayList2.get(position);
        opt_b=arrayList3.get(position);
        opt_c=arrayList4.get(position);
        opt_d=arrayList5.get(position);

        holder.qName.setText(question);
        holder.optionA.setText(opt_a);
        holder.optionB.setText(opt_b);
        holder.optionC.setText(opt_c);
        holder.optionD.setText(opt_d);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        TextView qName;
        RadioGroup group;
        RadioButton radioButtonSelected;
        int radiobuttonid;
        RadioButton optionA,optionB,optionC,optionD;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            qName=itemView.findViewById(R.id.tvQuestion);
            group=itemView.findViewById(R.id.optionGroup);
            radiobuttonid=group.getCheckedRadioButtonId();
            radioButtonSelected=itemView.findViewById(radiobuttonid);
            optionA=itemView.findViewById(R.id.cbA);
            optionB=itemView.findViewById(R.id.cbB);
            optionC=itemView.findViewById(R.id.cbC);
            optionD=itemView.findViewById(R.id.cbD);

           // selectedOption=radioButtonSelected.getText().toString();

           /*group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    Log.d("Testing:---",selectedOption);
                }
            });*/


        }
    }


}
