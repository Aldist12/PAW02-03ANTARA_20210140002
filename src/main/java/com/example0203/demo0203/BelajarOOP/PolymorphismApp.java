package com.example0203.demo0203.BelajarOOP;

public class PolymorphismApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Aldist");
        employee.sayHello("Fandi");

        employee = new Manager("Aldist");
        employee.sayHello("Fandi");

        employee = new VicePresident("Aldist");
        employee.sayHello("Fandi");

        sayHello(new Employee("Wahidna"));
        sayHello(new Manager("Erlang"));
        sayHello(new VicePresident("Fandi"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}