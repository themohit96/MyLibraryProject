package com.thegiant.mylibraryproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPassword extends AppCompatActivity {

    private Button sendButton;
    private EditText email;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        sendButton=findViewById(R.id.btnSend);
        email=findViewById(R.id.etMail);

        firebaseAuth=FirebaseAuth.getInstance();

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseAuth.sendPasswordResetEmail(email.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isComplete()){
                            Toast.makeText(getApplicationContext(),"Password recovery link has been send on your email",Toast.LENGTH_SHORT).show();

                        }else{
                            Toast.makeText(getApplicationContext(),"Link not send!",Toast.LENGTH_SHORT).show();

                        }

                    }
                });
                startActivity(new Intent(ForgetPassword.this,MainActivity.class));
                ForgetPassword.this.finish();

            }
        });
    }
}
