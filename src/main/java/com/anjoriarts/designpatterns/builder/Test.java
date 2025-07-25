package com.anjoriarts.designpatterns.builder;

public class Test {
    public static void main(String[] args) {
        User user1 = new User.Builder("Aditya" , "rajaditya@gmail.com").build();
        System.out.println(user1);

        User user2 = new User.Builder("Aditya", "adityaraj@gmail.com")
                    .age(10).build();

        System.out.println(user2);

        User user3 = new User.Builder("Aditya", "adityaraj@gmail.com")
                    .lastName("Raj")
                    .phoneNo("1234567890")
                    .age(10).build();

        System.out.println(user3);
    }
}
