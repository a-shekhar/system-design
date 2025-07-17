package com.anjoriarts.designpatterns.Singleton;

public class SingletonThreadSafe {

    

    // make the constructor private
    private SingletonThreadSafe(){

    }

    // create static variable
    private static SingletonThreadSafe instance;

    // This use synchronized keyword, it is thread safe
    // but the problem is synchronization is expensive
    public static synchronized SingletonThreadSafe getInstance() {
        if(instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }

}
