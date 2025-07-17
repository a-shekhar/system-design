package com.anjoriarts.designpatterns.Singleton;

public class Singleton {

    // create static variable
    private static Singleton instance;

    // make the constructor private
    private Singleton(){

    }

    // This use lazy initialization, but the issue is it is not 
    // thread safe
    // There are different ways to solve this
    // 1. make initilization eagar
    // 2. use synchronized keyword
    // 3. use double checked locking
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
