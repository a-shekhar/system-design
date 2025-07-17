package com.anjoriarts.designpatterns.Singleton;

public class SingletonMain {
    
    public static void main(String[] args) {
        // test basic Singleton class

        Singleton s1 = Singleton.getInstance();
        System.out.println("Instance hashcode is " + s1.hashCode());


        Singleton s2 = Singleton.getInstance();
        System.out.println("Instance hashcode is " + s2.hashCode());
    }
}
