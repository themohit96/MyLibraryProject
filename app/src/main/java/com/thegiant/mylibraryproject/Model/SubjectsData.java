package com.thegiant.mylibraryproject.Model;

import java.util.ArrayList;
import java.util.List;

public class SubjectsData {
    public List SubjectName;
    public List SubjectCode;
    public List SubjectCredit;

    public SubjectsData(ArrayList<String> subjectName,ArrayList<String> subjectCode,ArrayList<String> subjectCredit){
        this.SubjectName=subjectName;
        this.SubjectCode=subjectCode;
        this.SubjectCredit=subjectCredit;
    }

    }
