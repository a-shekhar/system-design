package com.anjoriarts.designpatterns.Singleton;

public class SingletonThreadSafe2Main {
    
    public static void main(String[] args) {
        // test basic Singleton class

        SingletonThreadSafe2 s3 = SingletonThreadSafe2.getInstance();
        System.out.println("Instance Thread Safe 2 hashcode is " + s3.hashCode());


        SingletonThreadSafe2 s4 = SingletonThreadSafe2.getInstance();
        System.out.println("Instance Thread Safe 2 hashcode is " + s4.hashCode());
    }
}
