package com.example0203.demo0203.BelajarOOP;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";
        
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
        
    Person(String paramName) {
        this(paramName, null); // Memanggil konstruktor dengan dua parameter
    }

    Person() {
        this(null); // Memanggil konstruktor dengan satu parameter
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
