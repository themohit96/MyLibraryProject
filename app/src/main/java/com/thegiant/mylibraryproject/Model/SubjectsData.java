package com.thegiant.mylibraryproject.Model;

import java.util.ArrayList;
import java.util.List;

public class SubjectsData {
    public List SubjectName;
    public List SubjectCode;
    public List SubjectCredit;

    public SubjectsData(List subjectName,List subjectCode,List subjectCredit){
        this.SubjectName=subjectName;
        this.SubjectCode=subjectCode;
        this.SubjectCredit=subjectCredit;
    }

   /* public SubjectsData(){
        this.SubjectName=new ArrayList<String>();
        this.SubjectCode=new ArrayList<String>();
        this.SubjectCredit=new ArrayList<String>();
    }*/

    }
