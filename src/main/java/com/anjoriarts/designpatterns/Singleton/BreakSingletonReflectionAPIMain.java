package com.anjoriarts.designpatterns.Singleton;

import java.lang.reflect.Constructor;


public class BreakSingletonReflectionAPIMain {

    public static void main(String[] args) throws Exception{
    BreakSingletonReflectionAPI s1 =  BreakSingletonReflectionAPI.getInstance();
    System.out.println("Instance BreakSingletonReflectionAPI hashcode is " + s1.hashCode());


    Constructor<BreakSingletonReflectionAPI> constructor = BreakSingletonReflectionAPI.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    BreakSingletonReflectionAPI s2 = constructor.newInstance();
    System.out.println("Instance BreakSingletonReflectionAPI hashcode is " + s2.hashCode());
    
    // it breaks

}
    
    
}
