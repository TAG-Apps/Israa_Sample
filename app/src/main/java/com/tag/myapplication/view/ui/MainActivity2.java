package com.tag.myapplication.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.tag.myapplication.R;
import com.tag.myapplication.model.models.House;
import com.tag.myapplication.model.models.Person;
import com.tag.myapplication.model.models.TestParcable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.e("name", getIntent().getStringExtra("name"));

        Person p = (Person) getIntent().getSerializableExtra("key");

        Log.e("value", p.getName());

        TestParcable test = getIntent().getParcelableExtra("par");
        List<TestParcable> list = (ArrayList<TestParcable>) getIntent().getSerializableExtra("list1");
        for (TestParcable item:list) {
            Log.e("name parcable", item.getName());

        }

        List<House> houseList = getIntent().getParcelableArrayListExtra("houseList");
        for (House item:  houseList) {
            Log.e("location house", item.getLocation());

            Log.e("nearby house", item.getIsNearSchool() + "");

        }

        SharedPreferences sharedpreferences = getSharedPreferences("db", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("username", "ihab");
        editor.putString("password", "1234");
        editor.commit();

        String userName = sharedpreferences.getString("username", "");
        String password = sharedpreferences.getString("password", "");

        Log.e("userName", userName);
        Log.e("password", password);
        

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.e("MainActivity2", "onBackPressed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("MainActivity2", "onDestroy");

    }
}