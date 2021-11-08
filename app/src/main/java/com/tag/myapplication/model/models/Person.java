package com.tag.myapplication.model.models;

import android.util.Log;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private String name;
    private int age;
    private String address;
    private String udid;
    private String mobile;
    private String password;
    public final String extra = "";

    {
       // Log.d("Block", "esraa Block");
    }

    static {
       // Log.e("Static Block", "Esraa Static");
    }

    public static String fullName = "ihab";

    public Person(){
        //Log.e("Person", "constructor");
    }

    public Person(String name){
        this.name = name;
        //Log.e("Person name", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName(String name){

        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", udid='" + udid + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(udid, person.udid) &&
                Objects.equals(mobile, person.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, udid, mobile);
    }

    public boolean isMoreSixChars(){
        if(password.length() >= 6)
            return true;
        else
            return false;

    }
}
