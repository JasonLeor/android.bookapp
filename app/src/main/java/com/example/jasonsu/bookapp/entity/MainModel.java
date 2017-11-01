package com.example.jasonsu.bookapp.entity;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModel {
    private Context context;

    public MainModel(Context context) {
        this.context = context;
    }

    @Provides
    Context providesContext() {

        return context;
    }

    @Provides
    @Singleton
    Person providerPerson(Context context) {
        return new Person(context);
    }
}
