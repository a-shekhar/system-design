package com.anjoriarts.designpatterns.factory;

public abstract class Pizza {

    public void prepare(){
        System.out.println("Pizza has been prepared.");
    }

    public void bake(){
        System.out.println("Pizza has been baked.");
    }

    public void cut(){
        System.out.println("Cut Pizza in squares.");
    }

    public void box(){
         System.out.println("Pizza should be in boxed with company label.");
    }
}
