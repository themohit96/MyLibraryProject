package com.thegiant.mylibraryproject.Model;

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

    public static String SubSelector(String name){
        String link="";
        switch (name){
            case "Unix & Shell Programming":
                link="https://drive.google.com/open?id=1nOYgndKYQW0lG75r3nQjrWEcCTzR4vYo";
                break;
            case "Design & Analysis of Algorithm":
                link="https://drive.google.com/open?id=1teEv2vMNxUt1kcoDLdXJyhUJ-RXkTfO8";
                break;
            case "Computer Networks":
                link="https://drive.google.com/open?id=1Vp7bqbHZn-7FL5vjKN_vJEo765S1AmVK";
                break;

            case "Python Programming":
                link="https://drive.google.com/open?id=1I8mlVZrvST1dBjBZzMBgqRTztj65RCA1";
                break;
        }

        return link;
    }
}
