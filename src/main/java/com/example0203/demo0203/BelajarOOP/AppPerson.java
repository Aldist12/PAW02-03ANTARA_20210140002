package com.example0203.demo0203.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person = new Person(null, null); // Menggunakan null sebagai argumen sementara

        person.name = "Aldi Septiyanto";
        person.address = "Yogyakarta";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country); // Property 'country' tidak ada dalam kelas Person

        person.sayHello("Bruno"); // Menggunakan tanda kurung biasa, bukan titik dua
    }
}
