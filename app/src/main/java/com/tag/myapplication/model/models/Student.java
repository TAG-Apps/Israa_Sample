package com.tag.myapplication.model.models;

import android.util.Log;

public class Student extends Person{

    public Student(){
        super();
        Log.e("Student", "constructor");
    }


    public Student(String marks, String name){
        super(name);
       // Log.e("Student name", name);
    }

    private String marks;

    public String getMarks() {
        return marks;
    }


    public void setMarks(String marks) {
        this.marks = marks;
    }
}
