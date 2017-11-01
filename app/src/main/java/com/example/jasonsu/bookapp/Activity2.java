package com.example.jasonsu.bookapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jasonsu.bookapp.entity.Person;

import javax.inject.Inject;

public class Activity2 extends AppCompatActivity {
    @Inject
    Person person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(person);
    }
}
