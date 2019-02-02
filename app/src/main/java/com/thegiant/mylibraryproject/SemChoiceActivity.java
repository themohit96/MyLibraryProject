package com.thegiant.mylibraryproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SemChoiceActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_choice);
    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.button11:
               // Toast.makeText(this, "First Button", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SemChoiceActivity.this,SubListActivity.class));
                break;

            case R.id.button12:
                Toast.makeText(this, "Second Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button21:
                Toast.makeText(this, "Third Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button22:
                Toast.makeText(this, "Fourth Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button31:
                Toast.makeText(this, "Fivth Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button32:
                Toast.makeText(this, "Sixth Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button41:
                Toast.makeText(this, "Seventh Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button42:
                Toast.makeText(this, "Eight Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button51:
                Toast.makeText(this, "Nine Button", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button52:
                Toast.makeText(this, "Tenth Button", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Something goes wrong\nPlease restart App", Toast.LENGTH_LONG).show();



        }

    }
}
