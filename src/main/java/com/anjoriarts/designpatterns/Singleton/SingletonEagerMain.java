package com.anjoriarts.designpatterns.Singleton;

public class SingletonEagerMain {
    
    public static void main(String[] args) {
        // test basic Singleton class

        SingletonEager s1 = SingletonEager.getInstance();
        System.out.println("Instance Eager hashcode is " + s1.hashCode());


        SingletonEager s2 = SingletonEager.getInstance();
        System.out.println("Instance Eager hashcode is " + s2.hashCode());
    }
}
