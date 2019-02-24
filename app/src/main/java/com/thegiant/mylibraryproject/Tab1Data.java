package com.thegiant.mylibraryproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.thegiant.mylibraryproject.Model.SaxenaLibrary;


/**
 * Created by Mohit on 03/01/18.
 */

public class Tab1Data extends Fragment {

    private Button fbLogin,gmailLogin,logIn,skip;
    private TextView forgetPassword;
    private TextInputLayout mail,pass;
    private FirebaseAuth mAuth;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mail=rootView.findViewById(R.id.et_mail);
        pass=rootView.findViewById(R.id.et_pass);
        logIn=rootView.findViewById(R.id.btnLogin);
        fbLogin=rootView.findViewById(R.id.btnFB);
        gmailLogin=rootView.findViewById(R.id.btnGmail);
        skip=rootView.findViewById(R.id.btnSkip);
        forgetPassword=rootView.findViewById(R.id.tvForget);

        mAuth = FirebaseAuth.getInstance();

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=mail.getEditText().getText().toString();
                String pas1=pass.getEditText().getText().toString();

                if (!SaxenaLibrary.validateMail(email)){
                    mail.setError("Invalid email!");
                }else if (!SaxenaLibrary.validatePassword(pas1)){
                    pass.setError("Password is not valid");
                }else {
                    mail.setErrorEnabled(false);
                    pass.setErrorEnabled(false);

                    mAuth.signInWithEmailAndPassword(email, pas1)
                            .addOnCompleteListener(Tab1Data.this.getActivity(), new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {

                                        FirebaseUser user = mAuth.getCurrentUser();
                                        Toast.makeText(getContext(),"Login successful with "+user.getEmail(),Toast.LENGTH_LONG).show();
                                        startActivity(new Intent(getContext(),SemChoiceActivity.class));
                                        getActivity().finish();

                                    } else {
                                        Toast.makeText(getContext(),"Email or Password may be wrong!",Toast.LENGTH_LONG).show();
                                    }


                                }
                            });



                }

            }
        });

        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You forget password!", Toast.LENGTH_LONG).show();

            }
        });

        fbLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Login from facebook!",Toast.LENGTH_LONG).show();

            }
        });

        gmailLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Login from gmail!",Toast.LENGTH_LONG).show();

            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),SemChoiceActivity.class));
                getActivity().finish();

            }
        });


        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        Toast.makeText(getContext(),"Login with "+currentUser.getEmail(),Toast.LENGTH_LONG).show();

        startActivity(new Intent(getContext(),SemChoiceActivity.class));
        //updateUI(currentUser);

    }




}
