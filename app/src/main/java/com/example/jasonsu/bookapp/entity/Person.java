package com.example.jasonsu.bookapp.entity;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lombok.Getter;
import lombok.Setter;

@Module
@Getter
@Setter
public class Person {
    private String name;
    private Integer age;
    private Context context;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    Person init() {
        return new Person("jason", 21);
    }
}
