package com.anjoriarts.designpatterns.Singleton;

public class SingletonEnumMain {
    
    public static void main(String[] args) {
        // test basic Singleton class

        SingletonEnum s1 = SingletonEnum.INSTANCE;
        System.out.println("Instance enum hashcode is " + s1.hashCode());


        SingletonEnum s2 = SingletonEnum.INSTANCE;
        System.out.println("Instance enum hashcode is " + s2.hashCode());
    }
}
