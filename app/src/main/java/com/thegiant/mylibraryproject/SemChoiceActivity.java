package com.thegiant.mylibraryproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.thegiant.mylibraryproject.Model.NameOfSubjects;
import com.thegiant.mylibraryproject.Model.SubjectsData;

import java.util.ArrayList;

public class SemChoiceActivity extends AppCompatActivity {

    private LinearLayout layout,leftLayout,rightLayout;

    ArrayList<String> arrayList;
    ArrayList<String> arrayList2;
    ArrayList<String> arrayList3;
    Animation blinkAnim;
    private View tempView=null;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_choice);

        layout=findViewById(R.id.linear_parent);
        leftLayout=findViewById(R.id.linearLeft);
        rightLayout=findViewById(R.id.linearRight);

        Animation bounceAnim= AnimationUtils.loadAnimation(this,R.anim.bounce);
        blinkAnim= AnimationUtils.loadAnimation(this,R.anim.blink_anim);
        Animation lToRAnim= AnimationUtils.loadAnimation(this,R.anim.slide_in_left);
        Animation rToLceAnim= AnimationUtils.loadAnimation(this,R.anim.slide_in_right);

       // layout.startAnimation(bounceAnim);
        leftLayout.startAnimation(lToRAnim);
        rightLayout.startAnimation(rToLceAnim);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
       // databaseReference.setValue("hello");




    }

    public void onClick(View view){

        view.startAnimation(blinkAnim);

        switch (view.getId()){

            case R.id.button11:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Computer Organization & Architecture");
                arrayList2.add("MCA-1002");
                arrayList3.add("4");

                arrayList.add("Discrete Mathematics");
                arrayList2.add("MCA-1004");
                arrayList3.add("4");

                arrayList.add("Computer Programming");
                arrayList2.add("MCA-1101");
                arrayList3.add("4");

                arrayList.add("Fundamentals of InformationTechnology");
                arrayList2.add("MCA-1103");
                arrayList3.add("3");

                arrayList.add("Managerial and Organizational Behaviour");
                arrayList2.add("MBA-1008");
                arrayList3.add("3");

                arrayList.add("Environmental Science");
                arrayList2.add("AHS-1002");
                arrayList3.add("2");

        //        databaseReference=firebaseDatabase.getReference().child("Sem One");

                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));


                break;

            case R.id.button12:


                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Theory of Automata & Formal Language");
                arrayList2.add("MCA-2001");
                arrayList3.add("4");

                arrayList.add("Computer Graphics & MultiMedia");
                arrayList2.add("MCA-2002");
                arrayList3.add("4");

                arrayList.add("Introduction to Microprocessors");
                arrayList2.add("MCA-2003");
                arrayList3.add("4");

                arrayList.add("Optimization Technique");
                arrayList2.add("MCA-2004");
                arrayList3.add("4");

                arrayList.add("Accounting & Financial Management");
                arrayList2.add("MBA-2008");
                arrayList3.add("3");

        //        databaseReference=firebaseDatabase.getReference().child("Sem Two");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button21:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Object Oriented Programming");
                arrayList2.add("MCA-3101");
                arrayList3.add("3");

                arrayList.add("Data Structures");
                arrayList2.add("MCA-3002");
                arrayList3.add("4");

                arrayList.add("Database Management System");
                arrayList2.add("MCA-3003");
                arrayList3.add("4");

                arrayList.add("Software Engineering");
                arrayList2.add("MCA-3004");
                arrayList3.add("3");

                arrayList.add("Operating System");
                arrayList2.add("MCA-3005");
                arrayList3.add("3");

                arrayList.add("Ethics & Values");
                arrayList2.add("AHE-3001");
                arrayList3.add("2");

        //        databaseReference=firebaseDatabase.getReference().child("Sem Three");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button22:
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
                arrayList3.add("3");

        //        databaseReference=firebaseDatabase.getReference().child("Sem Four");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button31:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Web Technology");
                arrayList2.add("MCA-5001");
                arrayList3.add("3");

                arrayList.add("Distributed Systems");
                arrayList2.add("MCA-5002");
                arrayList3.add("4");

                arrayList.add(".Net framework using C#");
                arrayList2.add("MCA-5003");
                arrayList3.add("3");

                arrayList.add("Technical Writing");
                arrayList2.add("AHE-5001");
                arrayList3.add("2");

        //        databaseReference=firebaseDatabase.getReference().child("Sem Five");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button32:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Industrial Training");
                arrayList2.add("MCA-6081");
                arrayList3.add("26");

        //        databaseReference=firebaseDatabase.getReference().child("Sem Six");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button41:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Information Retrieval Systems");
                arrayList2.add("MCA-4021");
                arrayList3.add("3");

                arrayList.add("Soft Computing");
                arrayList2.add("MCA-4022");
                arrayList3.add("3");

                arrayList.add("Digital Image Processing");
                arrayList2.add("MCA-4023");
                arrayList3.add("3");

                arrayList.add("Management Information System");
                arrayList2.add("MCA-4024");
                arrayList3.add("3");

      //          databaseReference=firebaseDatabase.getReference().child("Ele One");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button42:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Data Compression");
                arrayList2.add("MCA-4041");
                arrayList3.add("3");

                arrayList.add("E Commerce");
                arrayList2.add("MCA-4042");
                arrayList3.add("3");

                arrayList.add("Service Oriented Architecture");
                arrayList2.add("MCA-4043");
                arrayList3.add("3");

                arrayList.add("Mobile Application Development");
                arrayList2.add("MCA-4044");
                arrayList3.add("3");

    //            databaseReference=firebaseDatabase.getReference().child("Ele Two");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button51:

                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Data Mining & Warehousing");
                arrayList2.add("MCA-5021");
                arrayList3.add("3");

                arrayList.add("Cloud Computing");
                arrayList2.add("MCA-5022");
                arrayList3.add("3");

                arrayList.add("Mobile Computing");
                arrayList2.add("MCA-5023");
                arrayList3.add("3");

                arrayList.add("Agile Software Development");
                arrayList2.add("MCA-5024");
                arrayList3.add("3");

   //             databaseReference=firebaseDatabase.getReference().child("Ele Three");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button52:
                arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Cryptography & Network Security");
                arrayList2.add("MCA-5041");
                arrayList3.add("3");

                arrayList.add("Software Project Management");
                arrayList2.add("MCA-5042");
                arrayList3.add("3");

                arrayList.add("Artificial Intelligence");
                arrayList2.add("MCA-5043");
                arrayList3.add("3");

                arrayList.add("Business Intelligence");
                arrayList2.add("MCA-5044");
                arrayList3.add("3");

   //             databaseReference=firebaseDatabase.getReference().child("Ele Four");


                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            default:
                Toast.makeText(this, "Something goes wrong\nPlease restart App", Toast.LENGTH_LONG).show();
                break;

        }

        NameOfSubjects.subName=arrayList;
        NameOfSubjects.subCode=arrayList2;
        NameOfSubjects.subCredit=arrayList3;
//        SubjectsData subjectsData=new SubjectsData(arrayList,arrayList2,arrayList3);
//        databaseReference.setValue(subjectsData);


        if(tempView!=null){
            tempView.clearAnimation();
        }

        tempView=view;



    }
}
