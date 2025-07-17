package com.anjoriarts.designpatterns.Singleton;

public class SingletonThreadSafe2 {

    // make the constructor private
    private SingletonThreadSafe2(){

    }

    // create static variable
    // volatile ensures all thread reads updated values
    private volatile static SingletonThreadSafe2 instance;

    // This use synchronized block, it is thread safe
    // it will use synchronized button only once so it is best practice 
    public static SingletonThreadSafe2 getInstance() {
        if(instance == null){
            synchronized (SingletonThreadSafe2.class) {
                if(instance == null){
                    instance = new SingletonThreadSafe2();
                }
            }
           
        }
        return instance;
    }

}
