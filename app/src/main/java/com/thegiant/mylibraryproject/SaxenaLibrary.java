package com.thegiant.mylibraryproject;

public class SaxenaLibrary {
    public static  Boolean validateMail(String mail){
        Boolean res=false;
        if(mail.contains("@")){
            res=true;
        }else if (mail.contains(" ")){
            res=false;
        }

        return res;

    }

    public static Boolean validatePassword(String pass1,String pass2){
        Boolean res=false;
        if (pass1.length()<=12&&pass1.length()>=6&&pass1.equals(pass2)){
            res=true;
        }

        return res;
    }

    public static Boolean validatePassword(String pass){
        Boolean res=false;
        if (pass.length()<=12&&pass.length()>=6){
            res=true;
        }

        return res;
    }
}
