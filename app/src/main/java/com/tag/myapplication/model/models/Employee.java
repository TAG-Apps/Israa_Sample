package com.tag.myapplication.model.models;

public class Employee extends Person{

    private Float salary;

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public float getNetSalary(int tax){

        return 0f;
    }

    public float getNetSalary(int tax, int insurance){

        return 0f;
    }

    public int getNetSalary(int tax, int insurance, int otherDeductions){

        return 0;
    }
}
