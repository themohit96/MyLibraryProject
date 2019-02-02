package com.thegiant.mylibraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.thegiant.mylibraryproject.Model.AdapterForTest;

import java.util.ArrayList;

public class SubListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<String> arrayList;
    ArrayList<String> arrayList2;
    ArrayList<String> arrayList3;
    ArrayList<String> arrayList4;
    ArrayList<String> arrayList5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_list);
        arrayList=new ArrayList<>();
        arrayList2=new ArrayList<>();
        arrayList3=new ArrayList<>();
        arrayList4=new ArrayList<>();
        arrayList5=new ArrayList<>();
        arrayList.add("Subject 1");
        arrayList2.add("A");
        arrayList3.add("B");
        arrayList4.add("C");
        arrayList5.add("D");


        recyclerView=findViewById(R.id.rv_subjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdapterForTest adapterForTest=new AdapterForTest(arrayList,arrayList2,arrayList3,arrayList4,arrayList5);

        recyclerView.setAdapter(adapterForTest);


    }
}
