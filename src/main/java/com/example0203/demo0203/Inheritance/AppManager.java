package com.example0203.demo0203.Inheritance;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Aldi Septiyanto";
        manager.sayHello("Ika");

        var vicePresident = new VicePresident();
        vicePresident.name = "Septiyanto";
        vicePresident.sayHello("Tania");
    }
}