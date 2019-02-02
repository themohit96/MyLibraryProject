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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_list);
        arrayList=new ArrayList<>();
        arrayList2=new ArrayList<>();
        arrayList3=new ArrayList<>();

        arrayList.add("Unix & Shell Programming");
        arrayList2.add("MCA-4001");
        arrayList3.add("3");

        arrayList.add("Design & Analysis of Algorithm");
        arrayList2.add("MCA-4002");
        arrayList3.add("4");

        arrayList.add("Computer Networks");
        arrayList2.add("MCA-4003");
        arrayList3.add("4");

        arrayList.add("Python Programming");
        arrayList2.add("MCA-4005");
        arrayList3.add("4");

        arrayList.add("Information Retrieval Systems");
        arrayList2.add("MCA-4021");
        arrayList3.add("3");

        arrayList.add("Mobile Application Development");
        arrayList2.add("MCA-4044");
        arrayList3.add("3");



        recyclerView=findViewById(R.id.rv_subjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdapterForTest adapterForTest=new AdapterForTest(arrayList,arrayList2,arrayList3);

        recyclerView.setAdapter(adapterForTest);


    }
}
