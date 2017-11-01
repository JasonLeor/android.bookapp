package com.example.jasonsu.bookapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jasonsu.bookapp.component.DaggerPersonComponent;
import com.example.jasonsu.bookapp.entity.MainModel;
import com.example.jasonsu.bookapp.entity.Person;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    public Person person;
    @Inject
    public Person person2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerPersonComponent.builder().mainModel(new MainModel(this)).build().inject(this);
        System.out.println(person);
        System.out.println(person2);
    }

    public void ac(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}
