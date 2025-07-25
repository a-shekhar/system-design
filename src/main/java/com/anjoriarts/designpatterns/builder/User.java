package com.anjoriarts.designpatterns.builder;

public class User {
    // required
    private String firstName;
    private String lastName;
    // required
    private String email;
    private String phoneNo;
    private int age;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNo = builder.phoneNo;
        this.age = builder.age;
    }

    
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNo=" + phoneNo
                + ", age=" + age + "]";
    }


    public static class Builder{
        // required
        private String firstName;
        private String lastName;
        // required
        private String email;
        private String phoneNo;
        private int age;

        public Builder(String firstName, String email){
            this.firstName = firstName;
            this.email = email;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return  this;
        }

        public Builder phoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
    
}
