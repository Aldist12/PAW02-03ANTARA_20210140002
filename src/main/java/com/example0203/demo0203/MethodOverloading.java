package com.example0203.demo0203;

public class MethodOverloading {
    
    static String sayHello(String firstName) {
        // System.out.println("Hello " + firstName);
        return firstName;
    }

    static String sayHello(String firstName, String lastName) {
        // System.out.println("Hello " + firstName + " " + lastName);
        return firstName + " " + lastName;
    }

    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    static String tambah(String var1, String var2) {
        return var1 + " tambah " + var2;
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Aldi", "Septiyanto"));
        System.out.println(sayHello("Hello"));

        System.out.println(tambah(1, 2));
        System.out.println(tambah("satu", "dua"));
    }
}
