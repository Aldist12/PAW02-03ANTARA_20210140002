package com.example0203.demo0203.BelajarOOP;

class Manager extends Employee {
    
    String company;

    Manager (String name) {
    super (name);
 }

    Manager (String name, String company) {
    super (name);
    this.company = company;
 }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}
