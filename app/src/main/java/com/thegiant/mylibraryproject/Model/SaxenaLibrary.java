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
            case "Computer Organization & Architecture":
                link="https://drive.google.com/open?id=1timLaB2mpKVYqokPZC4MF9zEWMrqeQAc";
                break;
            case "Discrete Mathematics":
                link="https://drive.google.com/open?id=1sw0_Vhdbw43jrgmVjquP-N6BlsQAccMO";
                break;
            case "Computer Programming":
                link="https://drive.google.com/open?id=19FTAuWpi1csK3Pd6O7xp-UuQtOiSrUaW";
                break;
            case "Fundamentals of Information Technology":
                link="https://drive.google.com/open?id=1oXp6Dm66fHYxwxjHN2Q4B-S4C59zi9qU";
                break;
            case "Managerial and Organizational Behaviour":
                link="https://drive.google.com/open?id=1WAU5-yVfh0DRg8nv5pFGAvO7fVAhJ0sQ";
                break;
            case "Environmental Science":
                link="https://drive.google.com/open?id=1WpOtezceYXoZ6Cq0YJcDVTMhGtPzEcox";
                break;

            case "Theory of Automata & Formal Language":
                link="https://drive.google.com/open?id=1IY7V_xDv6aUitKiwtKsq1zrurEYSdRn0";
                break;
            case "Computer Graphics & Multimedia":
                link="https://drive.google.com/open?id=1d4WsrXWbPvgTH8-0Y4YlnrMLLPCQcMjD";
                break;
            case "Introduction to Microprocessors":
                link="https://drive.google.com/open?id=1qEj_J1HA9uDPqxk4XAlUeeEA6ny77eYe";
                break;
            case "Optimization Technique":
                link="https://drive.google.com/open?id=1APj5GY9noKwDWZq3SFb58r7IYIKUlT7n";
                break;
            case "Accounting & Financial Management":
                link="https://drive.google.com/open?id=1GI7l2qAcJoju4vl6Yq2N1m8Xc3QrO9Gc";
                break;

            case "Object Oriented Programming":
                link="https://drive.google.com/open?id=1tudUyhtMpiFdOOL9Ye22lGqkFDqp7B60";
                break;
            case "Data Structure":
                link="https://drive.google.com/open?id=1uKiNxdMcIgf4sJlarUAApCLTOXU7p8po";
                break;
            case "Database Management System":
                link="https://drive.google.com/open?id=1NoR2reDco7d01l3ihzen78vvbSlWc85l";
                break;
            case "Software Engineering":
                link="https://drive.google.com/open?id=19fynAlIyIU54UvfH1wvGwpgYVfM-mt9q";
                break;
            case "Operating System":
                link="https://drive.google.com/open?id=1gYR25zzn1tyAHsSLvafJjPONYJLnhiKA";
                break;
            case "Ethics & Values":
                link="https://drive.google.com/open?id=1DIyAAzIliAaicK7cwLKi5RzLHSH2QC8a";
                break;

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

            case "Web Technology":
                link="https://drive.google.com/open?id=1RvWkm3X4JKRI4I8l5ut1et3Tl80P0eW8";
                break;
            case "Distributed Systems":
                link="https://drive.google.com/open?id=1WQ5IXtcRkNyT6S___IUoK32Cfnefd-IN";
                break;
            case ".Net framework using C#":
                link="";
                break;
            case "Technical Writing":
                link="";
                break;

            case "Information Retrieval Systems":
                link="https://drive.google.com/open?id=1VwlRD_8tgum6bDyAiC4cu3slXUg9nlwi";
                break;
            case "Soft Computing":
                link="https://drive.google.com/open?id=1MAY7aJTN_BTYGozVlwo1F0Dq11tgH-Og";
                break;
            case "Digital Image Processing":
                link="https://drive.google.com/open?id=12dqwavtYw0RZTtXQiLzCHCG__F7BwxTm";
                break;
            case "Management Information System":
                link="https://drive.google.com/open?id=1YZRPw2PT_zxu6sswicL5UgRgxOoaFXQd";
                break;

            case "Data Compression":
                link="https://drive.google.com/open?id=1x5UKxTa5GDeRFsbc72EWq8GQ2LNqzrv1";
                break;
            case "E Commerce":
                link="https://drive.google.com/open?id=1vkFN-XMKQpPJNKMSJWQ4-av9ts7wZ6O_";
                break;
            case "Service Oriented Architecture":
                link="https://drive.google.com/open?id=12k7A-Y4IGQu9UJzmgULkBv6XKjoGWneJ";
                break;
            case "Mobile Application Development":
                link="https://drive.google.com/open?id=1W2IRy7vkVvp1MUuwTBmzDJpJ5Ee_xeoV";
                break;

            case "Data Mining & Warehousing":
                link="https://drive.google.com/open?id=1IgLtG-8tZzlu9WHitDzSjEF49DvjE4JB";
                break;
            case "Cloud Computing":
                link="https://drive.google.com/open?id=1OEUzm1dytxf9n4bXXEybyQ_giyUpAUiQ";
                break;
            case "Mobile Computing":
                link="https://drive.google.com/open?id=1oogcF4_9lw3UZuPT-R16CU9Yxho5erNW";
                break;
            case "Agile Software Development":
                link="https://drive.google.com/open?id=1dOAt1iYDWkzIGYbW5Ri70tE03BtcW4Wf";
                break;

            case "Cryptography & Network Security":
                link="https://drive.google.com/open?id=1e_4YOVgGUv7TaNELwtmasyLrXFsEBQYZ";
                break;
            case "Software Project Management":
                link="https://drive.google.com/open?id=1dOAt1iYDWkzIGYbW5Ri70tE03BtcW4Wf";
                break;
            case "Artificial Intelligence":
                link="https://drive.google.com/open?id=14FdbqS_d3E3z6QESs6eu8q7EQbUu0ldm";
                break;
            case "Business Intelligence":
                link="https://drive.google.com/open?id=17SXuS_IjXpIG_fXAJ_R0RYxHnu5NHy3k";
                break;

        }

        return link;
    }
}
