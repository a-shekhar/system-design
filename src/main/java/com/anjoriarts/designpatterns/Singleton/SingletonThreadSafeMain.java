package com.anjoriarts.designpatterns.Singleton;

public class SingletonThreadSafeMain {
    
    public static void main(String[] args) {
        // test basic Singleton class

        SingletonThreadSafe s1 = SingletonThreadSafe.getInstance();
        System.out.println("Instance Thread Safe hashcode is " + s1.hashCode());


        SingletonThreadSafe s2 = SingletonThreadSafe.getInstance();
        System.out.println("Instance Thread Safe hashcode is " + s2.hashCode());
    }
}
