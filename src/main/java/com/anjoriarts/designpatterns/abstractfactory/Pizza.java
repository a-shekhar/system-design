package com.anjoriarts.designpatterns.abstractfactory;

public abstract class Pizza {

    // now every store can prepare with different ingredients
    public abstract void prepare();

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
