package com.tag.myapplication.model.models;

public class SingltonClass {

    private String connection;

    private static  SingltonClass INSTANCE = null;

    private SingltonClass(){

    }

    public static SingltonClass getInstance(){

        synchronized (SingltonClass.class){
            if(INSTANCE == null){
                INSTANCE = new SingltonClass();
            }
        }

        return INSTANCE;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
