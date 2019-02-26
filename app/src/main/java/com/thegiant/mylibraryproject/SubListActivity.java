package com.thegiant.mylibraryproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.thegiant.mylibraryproject.Model.AdapterForTest;
import com.thegiant.mylibraryproject.Model.NameOfSubjects;
import com.thegiant.mylibraryproject.Model.RecyclerItemClickListener;

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

        recyclerView.addOnItemTouchListener( new RecyclerItemClickListener(SubListActivity.this,
                recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
            @Override public void onItemClick(View view, int position) {
                Toast.makeText(SubListActivity.this, "click", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SubListActivity.this,ShowBook.class));

            }

            @Override public void onLongItemClick(View view, final int position) {
                Toast.makeText(SubListActivity.this, "Long click!", Toast.LENGTH_SHORT).show();
            }
        }));




    }
}
