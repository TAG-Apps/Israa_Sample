package com.tag.myapplication.model.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class TestParcable implements Serializable {

    private String name;

    public TestParcable(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
