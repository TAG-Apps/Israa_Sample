package com.tag.myapplication.model.models;

public class User extends Person {


    @Override
    public String getFullName(String name) {
        String values [] = name.split(" ");
        String username = "";
        for (String users: values) {
            username = "FirstName" + users;
        }

        return super.getFullName(username);
    }


}
