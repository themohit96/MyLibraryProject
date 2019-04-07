package com.thegiant.mylibraryproject;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
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

public class Tab2Data extends Fragment {

    private Button signup;
    private TextInputLayout mail,pass,cPass;
    private FirebaseAuth mAuth;
    private ConstraintLayout constraintLayout;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_regis, container, false);

        mail=rootView.findViewById(R.id.et_rmail);
        pass=rootView.findViewById(R.id.et_rpass);
        cPass=rootView.findViewById(R.id.et_rpassc);
        signup=rootView.findViewById(R.id.btnRegis);
        constraintLayout=rootView.findViewById(R.id.constraint_layout);
        Animation bounceAnim= AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        constraintLayout.startAnimation(bounceAnim);



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth = FirebaseAuth.getInstance();
                String email=mail.getEditText().getText().toString();
                String pas1=pass.getEditText().getText().toString();
                String pas2=cPass.getEditText().getText().toString();


                if (!SaxenaLibrary.validateMail(email)){
                    Toast.makeText(getContext(),email,Toast.LENGTH_LONG).show();
                    Toast.makeText(getContext(),pas1,Toast.LENGTH_LONG).show();
                    Toast.makeText(getContext(),pas2,Toast.LENGTH_LONG).show();
                    mail.setError("Invalid email!");
                }else if (!SaxenaLibrary.validatePassword(pas1,pas2)){
                    pass.setError("Password is not valid");
                }else {
                    mail.setErrorEnabled(false);
                    pass.setErrorEnabled(false);
                    cPass.setErrorEnabled(false);
                    Toast.makeText(getContext(),"You are registered!",Toast.LENGTH_LONG).show();

                    mAuth.createUserWithEmailAndPassword(email, pas1)
                            .addOnCompleteListener(Tab2Data.this.getActivity(), new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isComplete()) {

                                        mail.getEditText().setText("");
                                        pass.getEditText().setText("");
                                        cPass.getEditText().setText("");
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        Toast.makeText(getActivity(), "You're signed in with "+user.getEmail()+" email id",
                                                Toast.LENGTH_SHORT).show();

                                    } else {

                                        Toast.makeText(getActivity(), "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();

                                    }


                                }
                            });



                }



            }
        });



        return rootView;
    }






}
