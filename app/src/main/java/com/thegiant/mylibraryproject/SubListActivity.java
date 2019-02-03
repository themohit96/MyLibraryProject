package com.thegiant.mylibraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.thegiant.mylibraryproject.Model.AdapterForTest;
import com.thegiant.mylibraryproject.Model.NameOfSubjects;

import java.util.ArrayList;

public class SubListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_list);






        recyclerView=findViewById(R.id.rv_subjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdapterForTest adapterForTest=new AdapterForTest(NameOfSubjects.subName,NameOfSubjects.subCode,NameOfSubjects.subCredit);

        recyclerView.setAdapter(adapterForTest);


    }
}
