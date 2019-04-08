package com.thegiant.mylibraryproject.Model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.thegiant.mylibraryproject.R;

import java.util.ArrayList;


public class AdapterForTest extends RecyclerView.Adapter<AdapterForTest.ProgrammingViewHolder> {
    ArrayList<String> arrayList,arrayList2,arrayList3;
    private int lastPosition=-1;
    private Context context;


    public AdapterForTest(Context context,ArrayList<String> arrayList,ArrayList<String> arrayList2,ArrayList<String> arrayList3){
        this.arrayList=arrayList;
        this.arrayList2=arrayList2;
        this.arrayList3=arrayList3;
        this.context=context;

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
        String subName,subCode,subCredit;

        //setAnimation(holder.itemView, position);

        subName=arrayList.get(position);
        subCode=arrayList2.get(position);
        subCredit=arrayList3.get(position);

        holder.subName.setText(subName);
        holder.subCode.setText(subCode);
        holder.subCredit.setText(subCredit);




    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        TextView subName,subCode,subCredit;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            subName=itemView.findViewById(R.id.tv_sub_name);
            subCode=itemView.findViewById(R.id.tvCode);
            subCredit=itemView.findViewById(R.id.tvCredit);


        }
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.sample_anim);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }


}
