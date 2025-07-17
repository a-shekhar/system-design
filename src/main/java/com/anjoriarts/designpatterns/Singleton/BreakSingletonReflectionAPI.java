package com.anjoriarts.designpatterns.Singleton;

public class BreakSingletonReflectionAPI {
    
    // create static variable
    private static BreakSingletonReflectionAPI instance;

    // make constructor private
    private BreakSingletonReflectionAPI(){

        // How to restrict Reflection API to access/create new object
        if(instance != null){
            throw new RuntimeException("Don't break Singelton class");
        } 

    }

    public static BreakSingletonReflectionAPI getInstance() {
        if(instance == null){
            instance = new BreakSingletonReflectionAPI();
        }
        return instance;
    }
}
