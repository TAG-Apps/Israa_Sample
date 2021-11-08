package com.tag.myapplication.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tag.myapplication.R;
import com.tag.myapplication.model.models.Circle;
import com.tag.myapplication.model.models.House;
import com.tag.myapplication.model.models.Person;
import com.tag.myapplication.model.models.Print;
import com.tag.myapplication.model.models.Rectangle;
import com.tag.myapplication.model.models.Shape;
import com.tag.myapplication.model.models.SingltonClass;
import com.tag.myapplication.model.models.Student;
import com.tag.myapplication.model.models.TestParcable;
import com.tag.myapplication.model.models.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p = new Person("esrra");

        List<TestParcable> list = new ArrayList<>();
        list.add(new TestParcable("tala"));
        list.add(new TestParcable("tala"));
        list.add(new TestParcable("tala"));
        list.add(new TestParcable("tala"));

        List<House> houseList = new ArrayList<>();
        houseList.add(new House(50, "amman", true, new ArrayList<>()));
        houseList.add(new House(51, "zarqa", false, new ArrayList<>()));
        houseList.add(new House(52, "irbid", false, new ArrayList<>()));


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", "ihab");
                intent.putExtra("key", p);

                //intent.putParcelableArrayListExtra("list", (ArrayList<? extends Parcelable>) list);
                intent.putExtra("list1",  (ArrayList<TestParcable>)list);

                intent.putParcelableArrayListExtra("houseList", (ArrayList<? extends Parcelable>) houseList);
                startActivity(intent);
            }
        });

        Log.e("MainActivity", "onCreate");

        //Log.e("ApMainActivityp", "onCreate");


//        Person person = new Person();
//        person.setName("ihab");

        //Student student = new Student("100","esraa");
        //Log.e("person->", person.toString());

        //password.getText().toString();

        //student.setPassword("ihab");
        //Log.e("password->", student.isMoreSixChars() + "");

        //Student student1 = new Student("100","esraa");

        //String name = student1.getFullName("Ihab Alnaqib");
       // Log.e("name->", name);

        //User user = new User();

        //String userName = user.getFullName("Esraa");
        //Log.e("name->", userName);

        //Log.e("static->", Person.fullName);

        //Person p = new Person();

//        Shape shape = new Shape();
//        Log.e("shape", shape.getName());
//
//        Shape circle = new Circle();
//        Log.e("circle", circle.getName());
//
//        Shape rec = new Rectangle();
//        Log.e("rec", rec.getName());

        SingltonClass singltonClass = SingltonClass.getInstance();
        singltonClass.setConnection("db");

        Log.e("singlton class ", singltonClass.getConnection());

        SingltonClass singltonClass1 = SingltonClass.getInstance();
        Log.e("singlton class ", singltonClass.getConnection());


        try{
            Shape shape99 = null;
            Log.e("shape99", shape99.toString());


        }catch (NullPointerException e){
            Log.e("error", e.getMessage());

        }catch (Exception e){

        }finally {
            Log.e("finally", "always");

        }

        usePrint();
    }

    public String usePrint() {
        String xx = "";
        try{
             xx = printDB();

        }catch (Exception e){
            Log.e("error", e.getMessage());
        }


        return xx;
    }

    public String printDB() throws NullPointerException {

        String xx = null;
        try{
            xx.length();
        }catch (Exception e){
            throw new NullPointerException("XX Is Empty");
        }

        return "";
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "onDestroy");
    }
}