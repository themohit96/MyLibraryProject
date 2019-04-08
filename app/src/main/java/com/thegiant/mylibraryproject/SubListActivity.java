package com.thegiant.mylibraryproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

        final Animation bounceAnim= AnimationUtils.loadAnimation(this,R.anim.bounce);
        Animation buttonAnim= AnimationUtils.loadAnimation(this,R.anim.sample_anim);

        recyclerView=findViewById(R.id.rv_subjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.startAnimation(bounceAnim);

        AdapterForTest adapterForTest=new AdapterForTest(this,NameOfSubjects.subName,NameOfSubjects.subCode,NameOfSubjects.subCredit);

        recyclerView.setAdapter(adapterForTest);

        recyclerView.addOnItemTouchListener( new RecyclerItemClickListener(SubListActivity.this,
                recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
            @Override public void onItemClick(View view, int position) {

                String chooseSub=NameOfSubjects.subName.get(position).toString();
                Intent intent=new Intent(SubListActivity.this,ShowBook.class);
                intent.putExtra("SubName",chooseSub);
                startActivity(intent);

            }

            @Override public void onLongItemClick(View view, final int position) {
                Toast.makeText(SubListActivity.this, "Long click!", Toast.LENGTH_SHORT).show();
            }
        }));




    }
}
