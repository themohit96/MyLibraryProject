package com.thegiant.mylibraryproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Mohit on 03/01/18.
 */

public class Tab1Data extends Fragment {

    private Button fbLogin,gmailLogin,logIn,skip;
    private TextView forgetPassword;
    private TextInputLayout mail,pass;


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
                    Toast.makeText(getContext(),"Login successful!",Toast.LENGTH_LONG).show();

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




}
