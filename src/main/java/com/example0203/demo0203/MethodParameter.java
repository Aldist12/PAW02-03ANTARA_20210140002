package com.example0203.demo0203;

public class MethodParameter {
    public static void main(String [] args) {
        sayHello("Eko", "Khannedy");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
