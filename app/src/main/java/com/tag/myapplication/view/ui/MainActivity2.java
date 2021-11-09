package com.tag.myapplication.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tag.myapplication.R;
import com.tag.myapplication.model.models.House;
import com.tag.myapplication.model.models.Person;
import com.tag.myapplication.model.models.Sequare;
import com.tag.myapplication.model.models.Shape;
import com.tag.myapplication.model.models.TestParcable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });

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

        String userName = sharedpreferences.getString("username", "lll");
        String password = sharedpreferences.getString("password", "lll");

        Log.e("userName", userName);
        Log.e("password", password);


        Sequare shape01 = new Sequare();
        Shape shape02 = new Sequare();

        if(shape01 instanceof Shape){
            Log.e("instanceof -> ", "true");
        }else{
            Log.e("instanceof -> ", "false");
        }
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