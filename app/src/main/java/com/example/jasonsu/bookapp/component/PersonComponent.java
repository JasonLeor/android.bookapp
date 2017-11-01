package com.example.jasonsu.bookapp.component;

import com.example.jasonsu.bookapp.MainActivity;
import com.example.jasonsu.bookapp.entity.MainModel;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = MainModel.class)
@Singleton
public interface PersonComponent {
    void inject(MainActivity activity);
}
