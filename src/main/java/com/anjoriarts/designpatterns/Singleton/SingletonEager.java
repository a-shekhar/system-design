package com.anjoriarts.designpatterns.Singleton;

public class SingletonEager {

    

    // make the constructor private
    private SingletonEager(){

    }

    // create static variable
    private static final SingletonEager instance = new SingletonEager();

    // This use eager initialization, it is thread safe
    // but the problem is it is resource intrensive if it is huge application
    public static SingletonEager getInstance() {
        return instance;
    }

}
